package com.example.rollera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var boton: Button
    lateinit var lbl: TextView
    lateinit var img: ImageView
    lateinit var lbl1: TextView
    lateinit var img1: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lbl = findViewById(R.id.lblSaludo)
        boton  = findViewById(R.id.btnRoller)
        img = findViewById(R.id.imgRoller)
        lbl1 = findViewById(R.id.lblnueva)
        img1 = findViewById(R.id.imgDado2)

        img.setImageDrawable(resources.getDrawable(R.drawable.empty_dice))
        img1.setImageDrawable(resources.getDrawable(R.drawable.empty_dice))

        boton.setOnClickListener {
            val ale= diceRoller()
            val ale2 = diceRoller()
            Toast.makeText(
                applicationContext,
                "Se genero el numero " + ale,
                Toast.LENGTH_SHORT
            ).show()
            Toast.makeText(
                applicationContext,
                "Se genero el numero " + ale2,
                Toast.LENGTH_SHORT
            ).show()
            val idImagenAl = when (ale){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.empty_dice
            }
            val idImagenAl2 = when (ale2){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.empty_dice
            }
            img.setImageResource(idImagenAl)
            img1.setImageResource(idImagenAl2)

            lbl.text = ale.toString()
            lbl1.text = ale2.toString()
        }
    }

    fun diceRoller():Int{
        return (1..6).random()
    }

}