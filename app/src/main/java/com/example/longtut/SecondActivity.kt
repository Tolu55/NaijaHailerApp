package com.example.longtut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val userName = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvHailing)

        val message = "$userName, you na boss naw! Odogwu number ONE!  O porr boss mi..."
        textView.text = message
    }
}