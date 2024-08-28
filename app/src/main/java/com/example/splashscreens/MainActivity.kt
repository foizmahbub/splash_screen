package com.example.splashscreens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        //stap 1

        Handler().postDelayed({
            //stap 2
            val intent= Intent(this, Secendpage::class.java)
            // stap 3
            startActivity(intent)
            //stap 4
            finish()
        },2000)
    }
}