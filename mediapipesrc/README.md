# mediapipesrc 模块说明

## 一、源码

`com.google.mediapipe`包下的代码为MediaPipe Framework源码，已移除一些google库的依赖（如：com.google.flogger、com.google.code.findbugs、com.google.guava:guava）

`com.google.protobuf`包为`com.google.protobuf:protobuf-javalite:3.19.1`库源码



## 二、资源编译说明

> 编译所需文件都放在/mediapipe/hezb/目录下，修改目录需修改编译相关配置

编译aar的`BUILD`文件：

```
load("//mediapipe/java/com/google/mediapipe:mediapipe_aar.bzl", "mediapipe_aar")

mediapipe_aar(
    name = "mediapipe_selfie_segmentation",
    calculators = ["//mediapipe/hezb/selfie_segmentation:selfie_segmentation_image"],
)
```

整合计算单元的`BUILD`文件：

```
load(
    "//mediapipe/framework/tool:mediapipe_graph.bzl",
    "mediapipe_binary_graph",
)

licenses(["notice"])

package(default_visibility = ["//visibility:public"])

cc_library(
    name = "selfie_segmentation_image",
    deps = [
        "//mediapipe/calculators/core:flow_limiter_calculator",
        "//mediapipe/gpu:image_frame_to_gpu_buffer_calculator",
        "//mediapipe/gpu:gpu_buffer_to_image_frame_calculator",
        "//mediapipe/calculators/core:packet_cloner_calculator",
        "//mediapipe/calculators/image:image_transformation_calculator",
        "//mediapipe/calculators/image:mask_overlay_calculator",
        "//mediapipe/modules/selfie_segmentation:selfie_segmentation_gpu",
    ],
)

mediapipe_binary_graph(
    name = "selfie_segmentation_image_binary_graph",
    graph = "selfie_segmentation_image.pbtxt",
    output_name = "selfie_segmentation_image.binarypb",
    deps = [":selfie_segmentation_image"],
)
```

用于编译Graph二进制文件的节点描述文件（selfie_segmentation_image.pbtxt）：

```
# CPU buffer. (ImageFrame)
input_stream: "input_video"

# 背景图片(ImageFrame)
input_stream: "input_background"

# Output image with rendered results. (ImageFrame)
output_stream: "output_video"

# Throttles the images flowing downstream for flow control. It passes through
# the very first incoming image unaltered, and waits for downstream nodes
# (calculators and subgraphs) in the graph to finish their tasks before it
# passes through another image. All images that come in while waiting are
# dropped, limiting the number of in-flight images in most part of the graph to
# 1. This prevents the downstream nodes from queuing up incoming images and data
# excessively, which leads to increased latency and memory usage, unwanted in
# real-time mobile applications. It also eliminates unnecessarily computation,
# e.g., the output produced by a node may get dropped downstream if the
# subsequent nodes are still busy processing previous inputs.
node {
  calculator: "FlowLimiterCalculator"
  input_stream: "input_video"
  input_stream: "FINISHED:output_video"
  input_stream_info: {
    tag_index: "FINISHED"
    back_edge: true
  }
  output_stream: "throttled_input_video"
}

# 输入的图像数据格式转换 ImageFrame -> GpuBuffer
node {
  calculator: "ImageFrameToGpuBufferCalculator"
  input_stream: "throttled_input_video"
  output_stream: "throttled_input_video_gpu"
}

# Subgraph that performs selfie segmentation.
node {
  calculator: "SelfieSegmentationGpu"
  input_stream: "IMAGE:throttled_input_video_gpu"
  output_stream: "SEGMENTATION_MASK:segmentation_mask"
}

# 背景图数据格式转换 ImageFrame -> GpuBuffer
node {
  calculator: "ImageFrameToGpuBufferCalculator"
  input_stream: "input_background"
  output_stream: "input_background_gpu"
}

#
node {
  calculator: "PacketClonerCalculator"
  input_stream: "TICK:throttled_input_video_gpu"
  input_stream: "input_background_gpu"
  output_stream: "throttled_background_gpu"
  #input_stream_handler {
  # input_stream_handler: "ImmediateInputStreamHandler"
  #}
}

# 合并图片
node {
  calculator: "MaskOverlayCalculator"
  input_stream: "VIDEO:0:throttled_background_gpu"
  input_stream: "VIDEO:1:throttled_input_video_gpu"
  input_stream: "MASK:segmentation_mask"
  output_stream: "OUTPUT:output_mask"
}

# 合并后的图片数据格式转换 GpuBuffer -> ImageFrame
node {
  calculator: "GpuBufferToImageFrameCalculator"
  input_stream: "output_mask"
  output_stream: "output_video"
}
```

编译命令如下：

* 首先编译aar包，把编译好的aar包中的so库解压出来（`libmediapipe_jni.so`、`libopencv_java3.so`）

  ```sh
  bazel build -c opt --strip=ALWAYS \
      --host_crosstool_top=@bazel_tools//tools/cpp:toolchain \
      --fat_apk_cpu=arm64-v8a,armeabi-v7a \
      --legacy_whole_archive=0 \
      --features=-legacy_whole_archive \
      --copt=-fvisibility=hidden \
      --copt=-ffunction-sections \
      --copt=-fdata-sections \
      --copt=-fstack-protector \
      --copt=-Oz \
      --copt=-fomit-frame-pointer \
      --copt=-DABSL_MIN_LOG_LEVEL=2 \
      --linkopt=-Wl,--gc-sections,--strip-all \
      //mediapipe/hezb:mediapipe_selfie_segmentation.aar
  ```

  ```sh
  // 编译成功后把aar包从缓存中复制出来
  cp bazel-bin/mediapipe/hezb/mediapipe_selfie_segmentation.aar /home/hezb/mediapipe/mediapipe/hezb
  ```

* 再编译.binarypb文件

  ```sh
  bazel build -c opt mediapipe/hezb/selfie_segmentation:selfie_segmentation_image_binary_graph
  ```

  ```sh
  // 编译成功后把.binarypb从缓存中复制出来
  cp bazel-bin/mediapipe/hezb/selfie_segmentation/selfie_segmentation_image.binarypb /home/hezb/mediapipe/mediapipe/hezb
  ```

`selfie_segmentation.tflite`和`selfie_segmentation_landscape.tflite`模型文件通过此地址：https://github.com/google/mediapipe/blob/master/docs/solutions/models.md下载（注：不要修改模型文件的名称）



## 三、接入调用

通过实例化`MediaPipeHelper`对象，先设置背景图`setBackground(bitmap)`，再通过`segment(bitmap)`方法执行人像抠图合成背景，合成后的图片通过`SegmentationListener`接口回调出来
