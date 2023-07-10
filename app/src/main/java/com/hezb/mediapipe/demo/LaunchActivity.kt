package com.hezb.mediapipe.demo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LaunchActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        findViewById<Button>(R.id.btn_facedetecation).setOnClickListener(this)
        findViewById<Button>(R.id.btn_facemesh).setOnClickListener(this)
        findViewById<Button>(R.id.btn_hands).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_facedetecation -> {
                startActivity(
                    Intent(
                        this,
                        com.google.mediapipe.examples.facedetecation.MainActivity::class.java
                    )
                )
            }

            R.id.btn_facemesh -> {
                startActivity(
                    Intent(
                        this,
                        com.google.mediapipe.examples.facemesh.MainActivity::class.java
                    )
                )
            }

            R.id.btn_hands -> {
                startActivity(
                    Intent(
                        this,
                        com.google.mediapipe.examples.hands.MainActivity::class.java
                    )
                )
            }
        }
    }

}