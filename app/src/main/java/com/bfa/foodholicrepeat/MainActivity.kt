package com.bfa.foodholicrepeat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val fImages = arrayOf(R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e,
        R.drawable.f, R.drawable.g)

    val fNames = arrayOf("Special Noodies", "Veg Biryani", "Veg Sandwich", "Pizzah Friday",
        "Pancakes", "Ice creams", "Veg Burger")

    val fDes = arrayOf("Best meal", "Best meal", "Best meal", "Best meal", "Best meal",
        "Best meal", "Best meal")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerview = rvItems
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = CustomAdapter(fImages, fNames, fDes)

    }
}