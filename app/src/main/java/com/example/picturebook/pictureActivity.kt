package com.example.picturebook

import android.content.Intent
import android.media.tv.TvContract
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pictureActivity : AppCompatActivity() {
    lateinit var btnPrevious1:Button
    lateinit var btnNext1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture)
        btnPrevious1=findViewById(R.id.btnPrevious1)
        btnPrevious1.setOnClickListener{
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnNext1=findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener{
            val intent=Intent(this,picture1Activity::class.java)
            startActivity(intent)
        }
    }
}