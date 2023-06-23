package com.example.sitegenie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class geniebot : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geniebot)

        findViewById<Button>(R.id.back).setOnClickListener {
            val intent : Intent = Intent(this,LoginScreen::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.btntxt).setOnClickListener {
            val intent : Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.voicebtn).setOnClickListener {
            val intent : Intent = Intent(this,geniebot::class.java)
            startActivity(intent)
        }
    }
}