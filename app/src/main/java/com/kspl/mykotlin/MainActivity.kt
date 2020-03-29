package com.kspl.mykotlin

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import nl.dionsegijn.konfetti.models.Shape
import nl.dionsegijn.konfetti.models.Size

class MainActivity : AppCompatActivity() {


    //lateinit var diceImage : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnroll: Button = findViewById(R.id.btn_roll)
        val diceImg: ImageView = findViewById(R.id.dice_image)
        val tvnum: TextView = findViewById(R.id.textView)
        val num: TextView = findViewById(R.id.number)



        diceImg.setOnClickListener(View.OnClickListener {

            val anim: Animation = AnimationUtils.loadAnimation(this, R.anim.shake)

            anim.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationRepeat(animation: Animation?) {
                    // actually, I don't need this method but I have to implement this.
                }

                override fun onAnimationEnd(animation: Animation?) {

                    when (rollDice()) {
                        1 -> {
                            diceImg.setImageResource(R.drawable.dice_1)
                            tvnum.text = "Hard Luck Try Again"
                            num.text="1"
                        }
                        2 -> {
                            diceImg.setImageResource(R.drawable.dice_2)
                            tvnum.text = "Hard Luck Try Again"
                            num.text="2"

                        }
                        3 -> {
                            diceImg.setImageResource(R.drawable.dice_3)
                            tvnum.text = "Hard Luck Try Again"
                            num.text="3"

                        }
                        4 -> {
                            diceImg.setImageResource(R.drawable.dice_4)
                            tvnum.text = "Hard Luck Try Again"
                            num.text="4"

                        }
                        5 -> {
                            diceImg.setImageResource(R.drawable.dice_5)
                            tvnum.text = "Hard Luck Try Again"
                            num.text="5"

                        }
                        6 -> {

                            diceImg.setImageResource(R.drawable.dice_6)
                            tvnum.text = "Congratulations You Unlocked Next Level"
                            num.text="6"

                            viewKonfetti.build()
                                .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA)
                                .setDirection(0.0, 359.0)
                                .setSpeed(1f, 5f)
                                .setFadeOutEnabled(true)
                                .setTimeToLive(2000L)
                                .addShapes(Shape.Square, Shape.Circle)
//                                .addSizes(Size(12), Size(16, 6f))
//                                .setPosition(viewKonfetti.x + viewKonfetti.width / 2, viewKonfetti.y + viewKonfetti.height / 3)
//                                .burst(100)
                                .addSizes(Size(12), Size(16, 6f))
                                .setPosition(-50f, viewKonfetti.width + 50f, -50f, -50f)
                                .streamFor(300, 5000L)

                            btnroll.visibility=View.VISIBLE


                        }

                    }

                }

                override fun onAnimationStart(animation: Animation?) {
                    // actually, I don't need this method but I have to implement this.
                }
            })

            diceImg.startAnimation(anim)



        })


        btnroll.setOnClickListener(View.OnClickListener {
            intent=Intent(this,RecyclerViewActivity::class.java)
            startActivity(intent)
        })


    }

    private fun rollDice(): Int = (1..6).random()
}
