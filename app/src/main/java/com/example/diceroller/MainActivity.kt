package com.example.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage1 : ImageView
    lateinit var diceImage2 : ImageView
    lateinit var diceImage3 : ImageView
    lateinit var diceImage4 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)
        diceImage3 = findViewById(R.id.dice_image3)
        diceImage4 = findViewById(R.id.dice_image4)
    }
    private fun rollDice(){
        Toast.makeText(this, "Đã xáo xúc xắc!" , Toast.LENGTH_SHORT).show()
        val result:TextView = findViewById(R.id.textResult)
        val randomInt1 = (1..6).random()
        val randomInt2 = (1..6).random()
        val randomInt3 = (1..6).random()
        val randomInt4 = (1..6).random()
        val drawableResource1 = when (randomInt1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource2 = when (randomInt2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource3 = when (randomInt3) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource4 = when (randomInt4) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage1.setImageResource(drawableResource1)
        diceImage2.setImageResource(drawableResource2)
        diceImage3.setImageResource(drawableResource3)
        diceImage4.setImageResource(drawableResource4)
        val ketqua = randomInt1 + randomInt2 + randomInt3 + randomInt4
        result.text = ketqua.toString()

    }
}