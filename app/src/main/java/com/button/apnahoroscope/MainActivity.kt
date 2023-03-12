package com.button.apnahoroscope

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickbtn = findViewById<Button>(R.id.click)

        clickbtn.setOnClickListener {
            //open a New Activity
            intent = Intent(applicationContext, secondpage::class.java)

            startActivity(intent)

        }

    }



}
