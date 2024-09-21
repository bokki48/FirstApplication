package com.example.firstapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var inputText: TextView
    private lateinit var outputText: TextView
    private lateinit var outputCount: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        inputText = findViewById(R.id.editText)
        outputText = findViewById(R.id.textViewOutput)
        outputCount = findViewById(R.id.textViewOutputCount)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            val sendText = inputText.text
            outputText.text = sendText.reversed()
            outputCount.text = countSymbol(sendText.toString()).toString()
        }
    }

    fun countSymbol(string: String): Int {
        var count = 0
        for (str in string) {
            if (str == ' ') continue
            count++
        }
        return count
    }
}