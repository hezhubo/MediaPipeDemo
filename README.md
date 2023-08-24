# MediaPipeDemo
Google mediapipe demo, link : https://developers.google.cn/mediapipe

![mediapipe](https://developers.google.cn/static/mediapipe/images/home/hero_01_1440.png)

# MediaPipe Framework编译指南

> 1、基于Ubuntu 20.04.6
>
> 2、设备支持科学上网

## 一、环境配置

### 1.安装必要的程序

```sh
sudo apt-get update && sudo apt-get install -y build-essential git zip adb openjdk-8-jdk python
// 若出现python无法安装的情况，一般来说系统都默认自带python，可查看当前python版本

// 安装pip3
sudo apt install python3-pip
// 安装six
pip3 install --user six
// 安装numpy
pip3 install numpy
```

### 2.安装Bazel

> [官方指南](https://bazel.google.cn/versions/6.1.0/install/ubuntu)

以下使用推荐的`bazelisk`进行配置

```sh
// 下载已编译好的bazelisk
wget -c https://github.com/bazelbuild/bazelisk/releases/download/v1.17.0/bazelisk-linux-amd64
// 改权限并移动bazelisk
chmod +x bazelisk-linux-amd64
sudo mv bazelisk-linux-amd64 /usr/local/bin/bazel

// 执行下面命令会自动下载合适版本的bazel
bazel version
```



## 二、MediaPipe安装

### 1.下载源码(克隆仓库)

```sh
git clone --depth 1 https://github.com/google/mediapipe.git
cd mediapipe
```

### 2.安装OpenCV和FFmpeg

```sh
// 此处我们直接跑setup_opencv.sh脚本即可，受限于github连接速度问题，喝杯咖啡等等吧
chmod 777 setup_opencv.sh
./setup_opencv.sh

// 查看opencv版本
pkg-config --modversion opencv
// 查看ffmpeg版本
ffmpeg -version
```

### 3.运行Hello World

```sh
export GLOG_logtostderr=1
// 仅CPU
bazel run --copt -DMESA_EGL_NO_X11_HEADERS --copt -DEGL_NO_X11 \
    mediapipe/examples/desktop/hello_world:hello_world
```

等着吧，下载一些资源，经常会超时！多跑几次！

编译可能出问题，可以尝试清缓存，但是慎重！

```sh
// 清理bazel缓存
rm -rf ~/.cache/bazel/
// 清理bazel编译缓存
bazel clean --expunge
```



## 三、在Android平台的编译

### 1.配置Android SDK、NDK

官网推荐是使用AS的sdk和ndk，这里我选择使用[`setup_android_sdk_and_ndk.sh`](https://github.com/google/mediapipe/blob/master/setup_android_sdk_and_ndk.sh)脚本自动配置

由于国内无法访问google maven，可以修改根目录的`WORKSPACE`文件

```
repositories = [
	# "https://maven.google.com", // 注释掉，添加aliyun仓库
	"https://maven.aliyun.com/repository/google",
	"https://maven.aliyun.com/repository/central",
	"https://maven.aliyun.com/repository/public",
	"https://dl.google.com/dl/android/maven2",
	"https://repo1.maven.org/maven2",
	"https://jcenter.bintray.com",
],
```

若已经就有SDK和NDK，可以直接在`WORKSPACE`文件末尾添加路径配置

```
android_sdk_repository(name = "androidsdk", path = "/home/hezb/Android/Sdk")
android_ndk_repository(name = "androidndk", api_level=21, path = "/home/hezb/Android/Sdk/ndk/21.0.6113669")
```

api_level：最低支持的Android API版本

### 2.生成Demo APK

跑命令生成

```sh
// bazel build
bazel build -c opt --config=android_arm64 mediapipe/examples/android/src/java/com/google/mediapipe/apps/handtrackinggpu:handtrackinggpu
// 安装（或者可以复制出来）
adb install bazel-bin/mediapipe/examples/android/src/java/com/google/mediapipe/apps/handtrackinggpu/handtrackinggpu.apk
```

跑脚本生成

```sh
./build_android_examples.sh
```

### 3.生成Framework AAR包

#### (1)创建一个mediapipe_aar()对象

在MediaPipe目录下，创建一个`BUILD`文件并写入编译`mediapipe_aar()`对象的配置说明

例如：创建一个用于人脸检测的aar包，在文件夹mediapipe/examples/android/src/java/com/google/mediapipe/apps下创建aar_example文件夹，在里面创建`BUILD`文件

```
load("//mediapipe/java/com/google/mediapipe:mediapipe_aar.bzl", "mediapipe_aar")

mediapipe_aar(
    name = "mediapipe_face_detection",
    calculators = ["//mediapipe/graphs/face_detection:mobile_calculators"],
)
```

其中`load`加载`mediapipe_aar`编译脚本

`mediapipe_aar()`中的`name`即aar包文件名，`calculators`为构建aar包所需要的计算单元集合

> 注：可以通过`bazel query "xxx"` 查找计算单元
>
> 如果是翻找文件可以看到，上面的计算单元，实际是mediapipe/graphs/face_detection目录下的`BUILD`文件中，`cc_library()`的`name`命名字段
>
> ```
> cc_library(
>  name = "mobile_calculators",
>  deps = [
>      "//mediapipe/calculators/core:flow_limiter_calculator",
>      "//mediapipe/calculators/util:annotation_overlay_calculator",
>      "//mediapipe/calculators/util:detections_to_render_data_calculator",
>      "//mediapipe/gpu:gpu_buffer_to_image_frame_calculator",
>      "//mediapipe/gpu:image_frame_to_gpu_buffer_calculator",
>      "//mediapipe/modules/face_detection:face_detection_short_range_cpu",
>      "//mediapipe/modules/face_detection:face_detection_short_range_gpu",
>  ],
> )
> ```

#### (2)执行Bazel编译命令编译aar包

```
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
    //mediapipe/examples/android/src/java/com/google/mediapipe/apps/aar_example:mediapipe_face_detection.aar
```

一般来说我们只需要修改最后一行命令即可，其他不需要做变动

最后一行拼接规则实际是"//${`BUILD`文件路径}:${`mediapipe_aar()`的name}.aar"

> 注：编译成功，会有如下打印
>
> Target //mediapipe/examples/android/src/java/com/google/mediapipe/apps/aar_example:mediapipe_face_detection.aar up-to-date:
>
> bazel-bin/mediapipe/examples/android/src/java/com/google/mediapipe/apps/aar_example/mediapipe_face_detection.aar

把编译的aar包从bazel缓存中copy出来，放到指定目录

```
cp bazel-bin/mediapipe/examples/android/src/java/com/google/mediapipe/apps/aar_example/mediapipe_face_detection.aar
/home/hezb/mediapipe/mediapipe/examples/android/src/java/com/google/mediapipe/apps/aar_example
```

#### (3)编译graph的二进制文件

通过查看mediapipe/graphs/face_detection目录下的`BUILD`文件，发现有两个`mediapipe_binary_graph()`依赖mobile_calculators

```
mediapipe_binary_graph(
    name = "face_detection_mobile_cpu_binary_graph",
    graph = "face_detection_mobile_cpu.pbtxt",
    output_name = "face_detection_mobile_cpu.binarypb",
    deps = [":mobile_calculators"],
)

mediapipe_binary_graph(
    name = "face_detection_mobile_gpu_binary_graph",
    graph = "face_detection_mobile_gpu.pbtxt",
    output_name = "face_detection_mobile_gpu.binarypb",
    deps = [":mobile_calculators"],
)
```

所以可以选择其一进行编译：

```
bazel build -c opt mediapipe/graphs/face_detection:face_detection_mobile_cpu_binary_graph
// 或
bazel build -c opt mediapipe/graphs/face_detection:face_detection_mobile_gpu_binary_graph
```

编译成功后，把编译的`.binarypb`文件从bazel缓存中copy出来，放到指定目录

```
cp bazel-bin/mediapipe/graphs/face_detection/face_detection_mobile_gpu.binarypb /home/hezb/mediapipe/mediapipe/examples/android/src/java/com/google/mediapipe/apps/aar_example
```

#### (4)获取model文件（若用到tflite模型的话）

> 注：把.pbtxt文件内容拷贝到 <https://viz.mediapipe.dev/> 页面下，即可生成可视化流程图

要查看有没有用到模型文件，就要分析编译用到的`.pbtxt`文件中，用到的所有node对应的计算单元

```
# Subgraph that detects faces.
node {
  calculator: "FaceDetectionShortRangeGpu"
  input_stream: "IMAGE:throttled_input_video"
  output_stream: "DETECTIONS:face_detections"
}
```

可以看到节点中包含此计算单元`FaceDetectionShortRangeGpu`，要知道此计算单元实际在哪里定义的，可以查看`cc_library()`中的依赖，显然应该是在`//mediapipe/modules/face_detection:face_detection_short_range_gpu`中，然后还是继续查看分析`mediapipe/modules/face_detection`目录下的`BUILD`文件，最终可以看到`face_detection_short_range.pbtxt`文件中引用的model为`mediapipe/modules/face_detection/face_detection_short_range.tflite`!

真是一层套一层，那么这个`.tflite`模型文件也没在目录中啊？（官方文档说明可以直接用cp命令复制出来，文件不存在，复制个锤子？参考此[issues](https://github.com/google/mediapipe/issues/4356)）我们可以在这个[models.md](https://github.com/google/mediapipe/blob/master/docs/solutions/models.md)文件中找到下载地址

#### (5)使用编译的arr包和各资源文件

aar包放到libs目录下，.binarypb和.tflite文件放到assets目录下，并添加如下依赖：

```
dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar', '*.aar'])
    implementation 'androidx.appcompat:appcompat:1.0.2'
    implementation 'androidx.constraintlayout:constraintlayout:1.1.3'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'androidx.test.ext:junit:1.1.0'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.1.1'
    // MediaPipe deps
    implementation 'com.google.flogger:flogger:latest.release'
    implementation 'com.google.flogger:flogger-system-backend:latest.release'
    implementation 'com.google.code.findbugs:jsr305:latest.release'
    implementation 'com.google.guava:guava:27.0.1-android'
    implementation 'com.google.protobuf:protobuf-javalite:3.19.1'
    // CameraX core library
    def camerax_version = "1.0.0-beta10"
    implementation "androidx.camera:camera-core:$camerax_version"
    implementation "androidx.camera:camera-camera2:$camerax_version"
    implementation "androidx.camera:camera-lifecycle:$camerax_version"
    // AutoValue
    def auto_value_version = "1.8.1"
    implementation "com.google.auto.value:auto-value-annotations:$auto_value_version"
    annotationProcessor "com.google.auto.value:auto-value:$auto_value_version"
}
```

#### (6)代码调用示例

> 可以参照[官方Demo](https://github.com/jiuqiant/mediapipe_face_detection_aar_example)Demo查看使用方式

```java
/**
 * MediaPipe辅助类
 */
public class MediaPipeHelper {

    static {
        // Load all native libraries needed by the app.
        System.loadLibrary("mediapipe_jni");
        System.loadLibrary("opencv_java3");
    }

    private static final String BINARY_GRAPH_NAME = "face_detection_mobile_gpu.binarypb";
    private static final String INPUT_VIDEO_STREAM_NAME = "input_video";
    private static final String OUTPUT_VIDEO_STREAM_NAME = "output_video";

    // Flips the camera-preview frames vertically before sending them into FrameProcessor to be
    // processed in a MediaPipe graph, and flips the processed frames back when they are displayed.
    // This is needed because OpenGL represents images assuming the image origin is at the bottom-left
    // corner, whereas MediaPipe in general assumes the image origin is at top-left.
    private static final boolean FLIP_FRAMES_VERTICALLY = true;

    // Creates and manages an {@link EGLContext}.
    private EglManager eglManager;
    // Sends camera-preview frames into a MediaPipe graph for processing, and displays the processed
    // frames onto a {@link Surface}.
    private FrameProcessor processor;
    // Converts the GL_TEXTURE_EXTERNAL_OES texture from Android camera into a regular texture to be
    // consumed by {@link FrameProcessor} and the underlying MediaPipe graph.
    private ExternalTextureConverter converter;

    public MediaPipeHelper(Context context) {
        // Initialize asset manager so that MediaPipe native libraries can access the app assets, e.g.,
        // binary graphs.
        AndroidAssetUtil.initializeNativeAssetManager(context);

        eglManager = new EglManager(null);
        processor = new FrameProcessor(
                context,
                eglManager.getNativeContext(),
                BINARY_GRAPH_NAME,
                INPUT_VIDEO_STREAM_NAME,
                OUTPUT_VIDEO_STREAM_NAME);
        processor.getVideoSurfaceOutput().setFlipY(FLIP_FRAMES_VERTICALLY);
    }

    public void openConverter() {
        converter = new ExternalTextureConverter(eglManager.getContext());
        converter.setFlipY(FLIP_FRAMES_VERTICALLY);
        converter.setConsumer(processor);
    }

    public void setSurfaceTextureAndAttachToGLContext(SurfaceTexture texture, int width, int height) {
        // Connect the converter to the camera-preview frames as its input (via
        // previewFrameTexture), and configure the output width and height as the computed
        // display size.
        converter.setSurfaceTextureAndAttachToGLContext(texture, width, height);
    }

    public void closeConverter() {
        converter.close();
    }

    public void setProcessorOutput(Surface surface) {
        processor.getVideoSurfaceOutput().setSurface(surface);
    }
    
}
```

示例页面代码：

```java
public class MainActivity extends AppCompatActivity {

    private static final CameraHelper.CameraFacing CAMERA_FACING = CameraHelper.CameraFacing.FRONT;
    // Handles camera access via the {@link CameraX} Jetpack support library.
    private CameraXPreviewHelper cameraHelper;

    // {@link SurfaceTexture} where the camera-preview frames can be accessed.
    private SurfaceTexture previewFrameTexture;
    // {@link SurfaceView} that displays the camera-preview frames processed by a MediaPipe graph.
    private SurfaceView previewDisplayView;

    private MediaPipeHelper mediaPipeHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPipeHelper = new MediaPipeHelper(this);

        previewDisplayView = new SurfaceView(this);
        setupPreviewDisplayView();

        PermissionHelper.checkAndRequestCameraPermissions(this);
    }

    private void setupPreviewDisplayView() {
        previewDisplayView.setVisibility(View.GONE);
        ViewGroup viewGroup = findViewById(R.id.preview_display_layout);
        viewGroup.addView(previewDisplayView);

        previewDisplayView
                .getHolder()
                .addCallback(
                        new SurfaceHolder.Callback() {
                            @Override
                            public void surfaceCreated(SurfaceHolder holder) {
                                mediaPipeHelper.setProcessorOutput(holder.getSurface());
                            }

                            @Override
                            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
                                // (Re-)Compute the ideal size of the camera-preview display (the area that the
                                // camera-preview frames get rendered onto, potentially with scaling and rotation)
                                // based on the size of the SurfaceView that contains the display.
                                Size viewSize = new Size(width, height);
                                Size displaySize = cameraHelper.computeDisplaySizeFromViewSize(viewSize);
                                boolean isCameraRotated = cameraHelper.isCameraRotated();

                                // Connect the converter to the camera-preview frames as its input (via
                                // previewFrameTexture), and configure the output width and height as the computed
                                // display size.
                                mediaPipeHelper.setSurfaceTextureAndAttachToGLContext(
                                        previewFrameTexture,
                                        isCameraRotated ? displaySize.getHeight() : displaySize.getWidth(),
                                        isCameraRotated ? displaySize.getWidth() : displaySize.getHeight());
                            }

                            @Override
                            public void surfaceDestroyed(SurfaceHolder holder) {
                                mediaPipeHelper.setProcessorOutput(null);
                            }
                        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        mediaPipeHelper.openConverter();
        if (PermissionHelper.cameraPermissionsGranted(this)) {
            startCamera();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        mediaPipeHelper.closeConverter();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        PermissionHelper.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    private void startCamera() {
        cameraHelper = new CameraXPreviewHelper();
        cameraHelper.setOnCameraStartedListener(
                surfaceTexture -> {
                    previewFrameTexture = surfaceTexture;
                    // Make the display view visible to start showing the preview. This triggers the
                    // SurfaceHolder.Callback added to (the holder of) previewDisplayView.
                    previewDisplayView.setVisibility(View.VISIBLE);
                });
        cameraHelper.startCamera(this, CAMERA_FACING, /*surfaceTexture=*/ null);
    }

}
```



## 四、编译过程可能出现的问题

### 1.找不到EGL的库

```
ERROR: /home/hezb/mediapipe/mediapipe/gpu/BUILD:252:11: Compiling mediapipe/gpu/gl_texture_view.cc failed: (Exit 1): gcc failed: error executing command (from target //mediapipe/gpu:gl_texture_view) /usr/bin/gcc -U_FORTIFY_SOURCE -fstack-protector -Wall -Wunused-but-set-parameter -Wno-free-nonheap-object -fno-omit-frame-pointer '-std=c++0x' -MD -MF ... (remaining 54 arguments skipped)

Use --sandbox_debug to see verbose messages from the sandbox and retain the sandbox build root for debugging
In file included from ./mediapipe/gpu/gl_texture_view.h:22,
                 from mediapipe/gpu/gl_texture_view.cc:1:
./mediapipe/gpu/gl_base.h:57:10: fatal error: EGL/egl.h: No such file or directory
   57 | #include <EGL/egl.h>
      |          ^~~~~~~~~~~
compilation terminated.
Target //mediapipe/examples/desktop/hello_world:hello_world failed to build
Use --verbose_failures to see the command lines of failed build steps.
INFO: Elapsed time: 0.337s, Critical Path: 0.22s
INFO: 84 processes: 84 internal.
FAILED: Build did NOT complete successfully
ERROR: Build failed. Not running target
```

重新安装一下EGL库，再编译即可

```sh
sudo apt-get install libegl1-mesa-dev
```



## 五、自定义计算单元、编译想要的Model

从前面提到的AAR包生成过程，我们可以知道，只要重新编写`BUILD`、`.pbtxt`文件即可。

### 1.pbtxt（graph的描述文件）编写说明

如下例子：

```
input_stream: "input"
output_stream: "output"

node {
  calculator: "PlaceholderCalculator"
  input_stream: "IN:input"
  output_stream: "OUT:output"
}
```

![main](https://github.com/hezhubo/MediaPipeDemo/blob/main/screenshot/1692891138400.png)

如图是<https://viz.mediapipe.dev/>页面下的graph可视化流程预览

其中必须包含一个`input_stream`和`output_stream`，`node`即计算单元节点，定义了所使用的计算单元以及输入输出数据

### 2.编译calculators、graph的BUILD文件编写说明

```
# 固定添加内容
load(
    "//mediapipe/framework/tool:mediapipe_graph.bzl",
    "mediapipe_binary_graph",
)

licenses(["notice"])

package(default_visibility = ["//visibility:public"])

# 所需计算单元
cc_library(
    name = "my_test_calculators",
    deps = [
        "//mediapipe/xxxx:xxxxx", # PlaceholderCalculator计算单元所在的路径
    ],
)

mediapipe_binary_graph(
    name = "my_test_binary_graph",
    graph = "my_test_graph.pbtxt", # pbtxt文件名
    output_name = "my_test.binarypb", # 编译输出的graph二进制文件的文件名
    deps = [":my_test_calculators"], # 上面定义的计算单元合集名称
)
```

通过文件内容可以知道，我们只需要按照前面创建编写的`.pbtxt`文件所有节点对应的计算单元添加到`cc_library`的`deps`数组中即可。

编写完后就按照前面的步骤进行编译就能得到想要的Model功能
