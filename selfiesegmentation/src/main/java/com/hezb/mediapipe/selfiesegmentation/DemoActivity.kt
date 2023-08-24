package com.hezb.mediapipe.selfiesegmentation

import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.SurfaceTexture
import android.os.Bundle
import android.util.Size
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.mediapipe.components.CameraHelper
import com.google.mediapipe.components.CameraXPreviewHelper
import com.google.mediapipe.components.PermissionHelper


class DemoActivity : AppCompatActivity() {

    // Flips the camera-preview frames vertically before sending them into FrameProcessor to be
    // processed in a MediaPipe graph, and flips the processed frames back when they are displayed.
    // This is needed because OpenGL represents images assuming the image origin is at the bottom-left
    // corner, whereas MediaPipe in general assumes the image origin is at top-left.
    private val FLIP_FRAMES_VERTICALLY = true

    private val CAMERA_FACING = CameraHelper.CameraFacing.FRONT

    // Handles camera access via the {@link CameraX} Jetpack support library.
    private var cameraHelper: CameraXPreviewHelper? = null

    // {@link SurfaceTexture} where the camera-preview frames can be accessed.
    private var previewFrameTexture: SurfaceTexture? = null

    // {@link SurfaceView} that displays the camera-preview frames processed by a MediaPipe graph.
    private lateinit var previewDisplayView: SurfaceView

    private lateinit var mediaPipeHelper: MediaPipeHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        // aar module
//        mediaPipeHelper =
//            MediaPipeHelper(this, "selfie_segmentation_gpu.binarypb", "input_video", "output_video")

        // src module
        mediaPipeHelper =
            MediaPipeHelper(this, "selfie_segmentation_gpu_bg.binarypb", "input_video", "output_video")
        val bgBitmap = createColorBitmap(768, 1280, Color.WHITE)
        mediaPipeHelper.processor.setOnWillAddFrameListener {
            mediaPipeHelper.processor.graph.addConsumablePacketToInputStream(
                "background_video",
                mediaPipeHelper.processor.packetCreator.createRgbImageFrame(bgBitmap),
                it
            )
        }

        mediaPipeHelper.processor.videoSurfaceOutput.setFlipY(FLIP_FRAMES_VERTICALLY)

        previewDisplayView = SurfaceView(this)
        setupPreviewDisplayView()

        PermissionHelper.checkAndRequestCameraPermissions(this)
    }

    override fun onResume() {
        super.onResume()
        mediaPipeHelper.openConverter().setFlipY(FLIP_FRAMES_VERTICALLY)
        if (PermissionHelper.cameraPermissionsGranted(this)) {
            startCamera()
        }
    }

    override fun onPause() {
        super.onPause()
        mediaPipeHelper.closeConverter()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        PermissionHelper.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    private fun setupPreviewDisplayView() {
        previewDisplayView.visibility = View.GONE
        val viewGroup = findViewById<ViewGroup>(R.id.preview_display_layout)
        viewGroup.addView(previewDisplayView)
        previewDisplayView
            .holder
            .addCallback(
                object : SurfaceHolder.Callback {
                    override fun surfaceCreated(holder: SurfaceHolder) {
                        mediaPipeHelper.setProcessorOutput(holder.surface)
                    }

                    override fun surfaceChanged(
                        holder: SurfaceHolder,
                        format: Int,
                        width: Int,
                        height: Int
                    ) {
                        // (Re-)Compute the ideal size of the camera-preview display (the area that the
                        // camera-preview frames get rendered onto, potentially with scaling and rotation)
                        // based on the size of the SurfaceView that contains the display.
                        val viewSize = Size(width, height)
                        val displaySize: Size = cameraHelper!!.computeDisplaySizeFromViewSize(viewSize)

                        // Connect the converter to the camera-preview frames as its input (via
                        // previewFrameTexture), and configure the output width and height as the computed
                        // display size.
                        mediaPipeHelper.setSurfaceTextureAndAttachToGLContext(
                            previewFrameTexture,
                            if (FLIP_FRAMES_VERTICALLY) displaySize.height else displaySize.width,
                            if (FLIP_FRAMES_VERTICALLY) displaySize.width else displaySize.height
                        )
                    }

                    override fun surfaceDestroyed(holder: SurfaceHolder) {
                        mediaPipeHelper.setProcessorOutput(null)
                    }
                })
    }

    private fun startCamera() {
        cameraHelper = CameraXPreviewHelper()
        cameraHelper!!.setOnCameraStartedListener { surfaceTexture: SurfaceTexture? ->
            previewFrameTexture = surfaceTexture
            // Make the display view visible to start showing the preview. This triggers the
            // SurfaceHolder.Callback added to (the holder of) previewDisplayView.
            previewDisplayView.visibility = View.VISIBLE
        }
        cameraHelper!!.startCamera(this, CAMERA_FACING,  /*surfaceTexture=*/null)
    }

    /**
     * 创建纯色Bitmap
     */
    private fun createColorBitmap(width: Int, height: Int, color: Int): Bitmap {
        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        for (x in 0 until width) {
            for (y in 0 until height) {
                bitmap.setPixel(x, y, color)
            }
        }
        return bitmap
    }

}