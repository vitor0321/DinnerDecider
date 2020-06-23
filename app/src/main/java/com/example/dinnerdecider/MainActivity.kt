package com.example.dinnerdecider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }
    val foodList = arrayListOf<String>(
        "McDonlds",
        "Chinese Food",
        "Portuguese Food",
        "Feijoada",
        "Churrasco",
        "Espetada"
    )

    private fun init() {
        button_decide.setOnClickListener {
            val random = Random
            val randomFood = random.nextInt(foodList.count())
            select_food_text.text = foodList[randomFood]
        }
        button_add_food.setOnClickListener {
            val newFood = text_view_addfood.text.toString()
            foodList.add(newFood)
            text_view_addfood.text?.clear()
        }
    }
}