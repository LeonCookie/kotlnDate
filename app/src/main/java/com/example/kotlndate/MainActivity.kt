package com.example.kotlndate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var DayToDay: EditText
        lateinit var TextToDay: TextView

        lateinit var First: EditText
        lateinit var Second: EditText




        DayToDay = findViewById(R.id.DateToDay)
        TextToDay = findViewById(R.id.textViewDay)

        First = findViewById(R.id.FirstDay)
        Second = findViewById(R.id.SecondDay)

        val today = "12-121-2"// test value

        //val one =



        TextToDay.text= today






    }
}