package com.example.nammamistri

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val length = findViewById<EditText>(R.id.length)
        val width = findViewById<EditText>(R.id.width)
        val height = findViewById<EditText>(R.id.height)
        val result = findViewById<TextView>(R.id.result)

        val button = findViewById<Button>(R.id.calcBtn)

        button.setOnClickListener {

            val l = length.text.toString().toDoubleOrNull() ?: 0.0
            val w = width.text.toString().toDoubleOrNull() ?: 0.0
            val h = height.text.toString().toDoubleOrNull() ?: 0.0

            val volume = l * w * h

            val bricks = (volume / 0.0016).toInt()
            val cement = (volume * 6).toInt()
            val sand = volume * 0.5

            result.text = "Bricks: $bricks\nCement: $cement\nSand: $sand m³"
        }
    }
}