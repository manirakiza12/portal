package com.example.portal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sign : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)
        val si=findViewById<Button>(R.id.btx)
        si.setOnClickListener {
            val cv=Intent(this,web::class.java)
            startActivity(cv)
        }

    }
}