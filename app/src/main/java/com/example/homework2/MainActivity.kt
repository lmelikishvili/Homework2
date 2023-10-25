package com.example.homework2

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import java.util.Objects

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputVal = findViewById<EditText>(R.id.editTextNumber).text

        findViewById<AppCompatButton>(R.id.execButt).setOnClickListener(){
            findViewById<AppCompatTextView>(R.id.numberName).text = ConvertNumberToNames().convert(inputVal.toString().toInt())
        }

    }
}