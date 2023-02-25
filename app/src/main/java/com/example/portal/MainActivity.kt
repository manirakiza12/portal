package com.example.portal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sign=findViewById<Button>(R.id.bun)
        sign.setOnClickListener{
            val meet=Intent(this,web::class.java)
            startActivity(meet)
        }
       val come=findViewById<Button>(R.id.clen)
        come.setOnClickListener{
            val dee=Intent(this,web::class.java)
            startActivity(dee)
        }
    }
}