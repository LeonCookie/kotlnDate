package com.example.kotlndate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var DayToDay: DatePicker
        lateinit var TextToDay: TextView

        DayToDay = findViewById(R.id.DateToDay)
        TextToDay = findViewById(R.id.textViewDay)


    }
}