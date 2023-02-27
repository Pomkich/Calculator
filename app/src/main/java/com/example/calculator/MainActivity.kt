package com.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var leftVal: Double = 0.0
    var rightVal: Double = 0.0
    var operator: Char = ' '
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun buttonEvent(view: View) {
        var mainWindow: TextView = findViewById(R.id.mainWindow)
        var select_button = view as Button
        when (select_button.id) {
            R.id.button0 -> {
                // ноль нельзя писать спереди
                if (!mainWindow.text.isEmpty() && mainWindow.text.toString() != "0" ) {
                    mainWindow.text = mainWindow.text.toString() + "0"
                }
            }
            R.id.button1 -> mainWindow.text = mainWindow.text.toString() + "1"
            R.id.button2 -> mainWindow.text = mainWindow.text.toString() + "2"
            R.id.button3 -> mainWindow.text = mainWindow.text.toString() + "3"
            R.id.button4 -> mainWindow.text = mainWindow.text.toString() + "4"
            R.id.button5 -> mainWindow.text = mainWindow.text.toString() + "5"
            R.id.button6 -> mainWindow.text = mainWindow.text.toString() + "6"
            R.id.button7 -> mainWindow.text = mainWindow.text.toString() + "7"
            R.id.button8 -> mainWindow.text = mainWindow.text.toString() + "8"
            R.id.button9 -> mainWindow.text = mainWindow.text.toString() + "9"
            R.id.buttonDot -> {
                // точка может быть только одна в числе
                if (!mainWindow.text.contains('.') && !mainWindow.text.isEmpty()) {
                    mainWindow.text = mainWindow.text.toString() + "."
                }
            }
            R.id.buttonChange -> {
                // смена знака
                if (!mainWindow.text.isEmpty() && mainWindow.text.get(0) == '-') {
                    mainWindow.text = mainWindow.text.drop(1)
                }
                else {
                    mainWindow.text = "-" + mainWindow.text
                }
            }
            R.id.buttonClear -> mainWindow.text = ""
        }
    }

    fun operatorEvent(view: View) {
        var mainWindow: TextView = findViewById(R.id.mainWindow)
        var select_button = view as Button
        when (select_button.id) {
            R.id.buttonPlus -> mainWindow.text = mainWindow.text.toString() + "+"
            R.id.buttonMinus -> mainWindow.text = mainWindow.text.toString() + "-"
            R.id.buttonMult -> mainWindow.text = mainWindow.text.toString() + "*"
            R.id.buttonDiv -> mainWindow.text = mainWindow.text.toString() + "/"
            R.id.buttonProc -> mainWindow.text = mainWindow.text.toString() + "%"
            R.id.buttonRoot -> mainWindow.text = "sqrt(" + mainWindow.text.toString() + ")"
            R.id.buttonSquare -> mainWindow.text = mainWindow.text.toString() + "^2"
            R.id.buttonCalc -> {

            }
        }
    }
}