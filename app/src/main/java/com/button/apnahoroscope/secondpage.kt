package com.button.apnahoroscope

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class secondpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondpage)

        val ariess = findViewById<RelativeLayout>(R.id.aries)

        ariess.setOnClickListener {
            intent = Intent(applicationContext,aries::class.java)
            startActivity(intent)
        }
    }
}