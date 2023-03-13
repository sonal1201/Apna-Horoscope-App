package com.button.apnahoroscope

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RelativeLayout

class secondpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondpage)

        val ariess = findViewById<RelativeLayout>(R.id.aries)
        val leoss = findViewById<RelativeLayout>(R.id.leos)
        val callus = findViewById<Button>(R.id.con)

        ariess.setOnClickListener {
            intent = Intent(this,aries ::class.java )
            startActivity(intent)
        }
        leoss.setOnClickListener {
            intent = Intent(this,leo ::class.java)
            startActivity(intent)
        }
        callus.setOnClickListener{
            val intent = Intent(Intent.ACTION_CALL)
            intent.data=Uri.parse("tel: 5387289")
            startActivity(intent)
        }

    }
}