package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Number buttonds
        textView1.setOnClickListener { appendOnExpression("1", true) }
        textView2.setOnClickListener { appendOnExpression("2", true) }
        textView3.setOnClickListener { appendOnExpression("3", true) }
        textView4.setOnClickListener { appendOnExpression("4", true) }
        textView5.setOnClickListener { appendOnExpression("5", true) }
        textView6.setOnClickListener { appendOnExpression("6", true) }
        textView7.setOnClickListener { appendOnExpression("7", true) }
        textView8.setOnClickListener { appendOnExpression("8", true) }
        textView9.setOnClickListener { appendOnExpression("9", true) }
        textViewZero.setOnClickListener { appendOnExpression("0", true) }
        textViewPoint.setOnClickListener { appendOnExpression(".", true) }

        //operators
        textViewAdd.setOnClickListener { appendOnExpression("+", false) }
        textViewSubtract.setOnClickListener { appendOnExpression("-", false) }
        textViewMultiply.setOnClickListener { appendOnExpression("*", false) }
        textViewDivision.setOnClickListener { appendOnExpression("/", false) }

        //Clear the data
        textViewClear.setOnClickListener {
            textViewExpression.text = ""
            textViewResults.text = ""
        }

        //delete
        imageViewDelete.setOnClickListener {
            val string = textViewExpression.text.toString()
            if (string.isNotEmpty()){
                textViewExpression.text = string.substring(0, string.length-1)
            }
            textViewResults.text = ""
        }
    }
    fun appendOnExpression(string: String, canClear: Boolean){
        if(canClear){
            textViewResults.text= ""
            textViewExpression.append(string)
        }
        else
        {
            textViewExpression.append(textViewResults.text)
            textViewExpression.append(string)
            textViewResults.text = ""
        }
    }
}
