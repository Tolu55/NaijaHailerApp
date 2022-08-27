package com.example.longtut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MYTAG","MainActivity : OnCreate")

        val tvHello = findViewById<TextView>(R.id.tvHello)
        val etName = findViewById<EditText>(R.id.etEnterName)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val dealsButton = findViewById<Button>(R.id.btnCollectHailing)

        var nameEntered = ""

        btnSubmit.setOnClickListener {
            nameEntered = etName.text.toString()

            if (nameEntered == ""){
                dealsButton.visibility = INVISIBLE
                tvHello.text = ""
                Toast.makeText(
                    this@MainActivity,
                    "Ogbeni, I say enter Name!",
                Toast.LENGTH_SHORT
                ).show()
            }else {
                val message = "Oga $nameEntered , una welcome"
                tvHello.text = message
                etName.text.clear()

                dealsButton.visibility = VISIBLE
            }

        dealsButton.setOnClickListener{
            val intent  = Intent(this,SecondActivity::class.java)
            intent.putExtra("USER", nameEntered)
            startActivity(intent)
        }

        }
    }

}