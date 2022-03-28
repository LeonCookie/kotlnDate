package com.example.kotlndate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var DayToDay: EditText
        lateinit var TextToDay: TextView

        lateinit var First: EditText
        lateinit var Second: EditText
        lateinit var TextDif: TextView




        DayToDay = findViewById(R.id.DateToDay)
        TextToDay = findViewById(R.id.textViewDay)

        First = findViewById(R.id.FirstDay)
        Second = findViewById(R.id.SecondDay)
        TextDif = findViewById(R.id.textViewRoznica)

        val today = "12-121-2"// test value

        val one = First.toString().toInt()
        val two = Second.toString().toInt()
        var Dif: Int = 0
        if(one>two){
            Dif = one-two;
            TextDif.text = Dif.toString()
        }else if(two>one){
            Dif = two-one;
            TextDif.text = Dif.toString()
        }else {
            Toast.makeText(this, "To te same daty", Toast.LENGTH_SHORT).show()
        }




        TextToDay.text= today






    }
}