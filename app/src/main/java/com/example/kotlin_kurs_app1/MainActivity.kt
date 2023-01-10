package com.example.kotlin_kurs_app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var mynumber = 0
    lateinit var myText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myText = findViewById<TextView>(R.id.MyTextView)

        myText.text = mynumber.toString()

        findViewById<TextView>(R.id.minusButton).setOnClickListener {
            docalc(calcnumber = -1)
        }
        findViewById<TextView>(R.id.resetButton).setOnClickListener {
            docalc(calcnumber = 0)
        }
        findViewById<TextView>(R.id.plusButton).setOnClickListener {
            docalc(calcnumber = 1)
        }
    }
    fun docalc(calcnumber : Int) {
        if(calcnumber == 0) {
            mynumber = 0
        }
        mynumber += calcnumber
        if(mynumber<0) {
            mynumber = 0
        }
        myText.text = mynumber.toString()
    }
}

