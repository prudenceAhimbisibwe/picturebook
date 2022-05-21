package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class picture3Activity : AppCompatActivity() {
    lateinit var btnPrevious4:Button
    lateinit var btnExit:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture3)
        btnPrevious4 = findViewById(R.id.btnPrevious4)
        btnPrevious4.setOnClickListener {
            val intent = Intent(this, picture2Activity::class.java)
            startActivity(intent)
        }
        btnExit = findViewById(R.id.btnExit)
        btnExit.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}