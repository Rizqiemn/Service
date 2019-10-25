package com.example.service

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fb.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/rizqie.RMN"))
            startActivity(i)
        })

        ig.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/rizqimn"))
            startActivity(i)
        })

        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.pasti_bisa)

        play.setOnClickListener{
            MediaPlayer?.start()
        }
        pause.setOnClickListener{
            MediaPlayer?.pause()
        }
        stop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
