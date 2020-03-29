package com.kspl.mykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etMail.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                when(p0?.length){
                    1->ivMonkey.setImageResource(R.drawable.monkey_2)
                    2->ivMonkey.setImageResource(R.drawable.monkey_3)
                    3->ivMonkey.setImageResource(R.drawable.monkey_4)
                    4->ivMonkey.setImageResource(R.drawable.monkey_5)
                    5->ivMonkey.setImageResource(R.drawable.monkey_6)
                    6->ivMonkey.setImageResource(R.drawable.monkey_7)
                    7->ivMonkey.setImageResource(R.drawable.monkey_8)
                    8->ivMonkey.setImageResource(R.drawable.monkey_9)
                    9->ivMonkey.setImageResource(R.drawable.monkey_10)
                    10->ivMonkey.setImageResource(R.drawable.monkey_11)
                    11->ivMonkey.setImageResource(R.drawable.monkey_12)
                    12->ivMonkey.setImageResource(R.drawable.monkey_13)
                    13->ivMonkey.setImageResource(R.drawable.monkey_14)
                    14->ivMonkey.setImageResource(R.drawable.monkey_15)
                    15->ivMonkey.setImageResource(R.drawable.monkey_16)
                    16->ivMonkey.setImageResource(R.drawable.monkey_17)
                    17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35->ivMonkey.setImageResource(R.drawable.monkey_17)
                    else->ivMonkey.setImageResource(R.drawable.monkey_1)
                }
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

    }
}
