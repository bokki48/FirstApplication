package com.example.firstapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var inputText: TextView
    private lateinit var outputText: TextView
    private lateinit var outputCount: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        inputText = findViewById(R.id.textViewInput)
        outputText = findViewById(R.id.textViewOutput)
        outputCount = findViewById(R.id.textViewOutputCount)
        button = findViewById(R.id.button)

        onButtonClick(button)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }

    fun onButtonClick(view: View) {
        val sendText = inputText.text
        outputText.text = sendText.reversed()
        outputCount.text = sendText.count().toString()
    }


}