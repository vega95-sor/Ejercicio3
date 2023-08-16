package com.example.ejercicio32

import android.R
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.setLayoutManager(layoutManager)
        val adapter: RecyclerView.Adapter<*> = MyAdapter()
        recyclerView.setAdapter(adapter)
    }

    class MainActivity : AppCompatActivity() {
        private var videoView: VideoView? = null
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            videoView = findViewById<VideoView>(R.id.videoView)
            val videoPath = "android.resource://" + packageName + "/" + R.raw.sample_video
            videoView.setVideoURI(Uri.parse(videoPath))
            videoView.start()
        }
    }

    class MainActivity : AppCompatActivity() {
        private var startServiceButton: Button? = null
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            startServiceButton = findViewById<Button>(R.id.startServiceButton)
            startServiceButton.setOnClickListener(View.OnClickListener {
                val serviceIntent = Intent(this@MainActivity, MyService::class.java)
                startService(serviceIntent)
            })
        }
    }


}
