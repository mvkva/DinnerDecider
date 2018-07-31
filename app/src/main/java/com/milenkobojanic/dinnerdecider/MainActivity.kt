package com.milenkobojanic.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Tesla", "RTRS Fortuna", "Malta", "Kod Baće", "Ćevapi Banjalučanka", "Ćevapi Obelix", "Kort")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodText.text = foodList[randomFood]
        }

        addFoodButton.setOnClickListener{
            val newFood = addFoodText.text.toString()
            if (!newFood.isBlank()) {
                foodList.add(newFood)
            }
            addFoodText.text.clear()
        }
    }
}
