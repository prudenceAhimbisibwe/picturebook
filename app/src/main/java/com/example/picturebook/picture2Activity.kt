package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class picture2Activity : AppCompatActivity() {
    lateinit var btnPrevious3:Button
    lateinit var btnNext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture2)
        btnPrevious3=findViewById(R.id.btnPrevious3)
        btnPrevious3.setOnClickListener{
            val intent=Intent(this,picture1Activity::class.java)
            startActivity(intent)
        }
        btnNext3=findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener{
            val intent=Intent(this,picture3Activity::class.java)
            startActivity(intent)
        }
    }
}