package com.example.hw5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var ranText : EditText
    private lateinit var swamText : EditText
    private lateinit var caloriesText : EditText
    private var ranList = mutableListOf<Int>()
    private var swamList = mutableListOf<Int>()
    private var caloriesList = mutableListOf<Int>()
    private lateinit var ranAvg : TextView
    private lateinit var swamAvg : TextView
    private lateinit var caloriesAvg : TextView
    private lateinit var ranSum : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ranText = findViewById(R.id.ran)
        swamText = findViewById(R.id.swam)
        caloriesText = findViewById(R.id.calories)
        ranAvg = findViewById(R.id.avgRan)
        swamAvg = findViewById(R.id.avgSwam)
        caloriesAvg = findViewById(R.id.avgCalories)
        ranSum = findViewById(R.id.ranSum)
    }
      public fun submitClick(view: View) {
        val r = ranText.text.toString().toInt()
        ranList.add(r)
        val rA = ranList.average()
        ranAvg.text = rA.toString()


        val s = swamText.text.toString().toInt()
        swamList.add(s)
        val sA = swamList.average()
        swamAvg.text = sA.toString()

        val c = caloriesText.text.toString().toInt()
        caloriesList.add(c)
        val cA = caloriesList.average()
        caloriesAvg.text = cA.toString()

        val rS = ranList.sum()
        ranSum.text = rS.toString()
    }
}