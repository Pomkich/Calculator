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
    var leftValInited: Boolean = false
    var rightValInited: Boolean = false
    var operatorLocked: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    // обработка кнопок ввода чисел
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

    // запоминание оператора и операндов
    fun operatorEvent(view: View) {
        var mainWindow: TextView = findViewById(R.id.mainWindow)
        if (mainWindow.text.toString().isEmpty()) return    // если нет числа, то оператор нельзя определить

        var textOp: TextView = findViewById(R.id.operator)
        var select_button = view as Button
        when (select_button.id) {
            R.id.buttonPlus -> {
                if (!operatorLocked) {
                    operator = '+'
                    textOp.text = "+"
                    operatorLocked = true
                }
            }
            R.id.buttonMinus -> {
                if (!operatorLocked) {
                    operator = '-'
                    textOp.text = "-"
                    operatorLocked = true
                }
            }
            R.id.buttonMult -> {
                if (!operatorLocked) {
                    operator = '*'
                    textOp.text = "*"
                    operatorLocked = true
                }
            }
            R.id.buttonDiv -> {
                if (!operatorLocked) {
                    operator = '/'
                    textOp.text = "/"
                    operatorLocked = true
                }
            }
            R.id.buttonProc -> {
                if (!operatorLocked) {
                    operator = '%'
                    textOp.text = "%"
                    operatorLocked = true
                }
            }
            R.id.buttonRoot -> {     // square root
                if (!operatorLocked) {
                    operator = 'r'
                    textOp.text = "sqrt(x)"
                    operatorLocked = true
                }
            }
            R.id.buttonSquare -> {   // square
                if (!operatorLocked) {
                    operator = 's'
                    textOp.text = "^2"
                    operatorLocked = true
                }
            }
            R.id.buttonCalc -> {

            }
        }
        if (!leftValInited) {
            leftVal = mainWindow.text.toString().toDouble()
            var leftValText: TextView = findViewById(R.id.leftVal)
            leftValText.text = mainWindow.text.toString()
            mainWindow.text = ""
            leftValInited = true
        }
        else if (!rightValInited) {
            rightVal = mainWindow.text.toString().toDouble()
            var rightValText: TextView = findViewById(R.id.rightVal)
            rightValText.text = mainWindow.text.toString()
            mainWindow.text = ""
            rightValInited = true
        }
    }
}