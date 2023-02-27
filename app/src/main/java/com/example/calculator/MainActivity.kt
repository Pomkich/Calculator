package com.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView: TextView = findViewById(R.id.mainWindow)

        var button0: Button = findViewById(R.id.button0)
        var button1: Button = findViewById(R.id.button1)
        var button2: Button = findViewById(R.id.button2)
        var button3: Button = findViewById(R.id.button3)
        var button4: Button = findViewById(R.id.button4)
        var button5: Button = findViewById(R.id.button5)
        var button6: Button = findViewById(R.id.button6)
        var button7: Button = findViewById(R.id.button7)
        var button8: Button = findViewById(R.id.button8)
        var button9: Button = findViewById(R.id.button9)
        var buttonClear: Button = findViewById(R.id.buttonClear)
        var buttonPlus: Button = findViewById(R.id.buttonPlus)
        var buttonMinus: Button = findViewById(R.id.buttonMinus)
        var buttonMult: Button = findViewById(R.id.buttonMult)
        var buttonDiv: Button = findViewById(R.id.buttonDiv)
        var buttonProc: Button = findViewById(R.id.buttonProc)
        var buttonRoot: Button = findViewById(R.id.buttonRoot)
        var buttonSquare: Button = findViewById(R.id.buttonSquare)

        button0.setOnClickListener {
            textView.text = textView.text.toString() + "0"
        }
        button1.setOnClickListener {
            textView.text = textView.text.toString() + "1"
        }
        button2.setOnClickListener {
            textView.text = textView.text.toString() + "2"
        }
        button3.setOnClickListener {
            textView.text = textView.text.toString() + "3"
        }
        button4.setOnClickListener {
            textView.text = textView.text.toString() + "4"
        }
        button5.setOnClickListener {
            textView.text = textView.text.toString() + "5"
        }
        button6.setOnClickListener {
            textView.text = textView.text.toString() + "6"
        }
        button7.setOnClickListener {
            textView.text = textView.text.toString() + "7"
        }
        button8.setOnClickListener {
            textView.text = textView.text.toString() + "8"
        }
        button9.setOnClickListener {
            textView.text = textView.text.toString() + "9"
        }
        buttonPlus.setOnClickListener {
            textView.text = textView.text.toString() + "+"
        }
        buttonMinus.setOnClickListener {
            textView.text = textView.text.toString() + "-"
        }
        buttonMult.setOnClickListener {
            textView.text = textView.text.toString() + "*"
        }
        buttonDiv.setOnClickListener {
            textView.text = textView.text.toString() + "/"
        }
        buttonProc.setOnClickListener {
            textView.text = textView.text.toString() + "%"
        }
        buttonSquare.setOnClickListener {
            textView.text = textView.text.toString() + "^2"
        }
        buttonRoot.setOnClickListener {
            textView.text = "sqrt(" + textView.text.toString() + ")"
        }
        buttonClear.setOnClickListener {
            textView.text = ""
        }
    }
}