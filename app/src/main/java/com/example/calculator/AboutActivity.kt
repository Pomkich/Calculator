package com.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Button
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val sharedPref = PreferenceManager.getDefaultSharedPreferences(this)
        val cur_int_theme = sharedPref.getInt("cur_theme", 0)
        val language = sharedPref.getString("language", "en")
        val editor = sharedPref.edit()
        when (cur_int_theme) {
            0 -> setTheme(R.style.Theme_Calculator)
            1 -> setTheme(R.style.Theme_CalculatorDark)
            2 -> setTheme(R.style.Theme_CalculatorKids)
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val text: TextView = findViewById(R.id.textAbout)

        if (language == "en") {
            text.text="This program was developed by students of Murmansk Arctic State University\n" +
                    "To switch to advanced mode, you need to flip the phone.\n" +
                    "Factorial function (X!) can only be performed up to numbers less than 10.\n" +
                    "Translation to other number systems is carried out by the X10~XN button.\n" +
                    "Supported number systems: 2, 3, 4, 5, 6, 7, 8"
        }
        else if (language == "ru") {
            text.text="Данная программа разработана студентами Мурманского Арктического Государственного университета\n" +
                    "Для перехода в расширенный режим необходимо перевернуть телефон.\n" +
                    "Функция факториала (X!) может быть выполнена только до чисел меньших 10.\n" +
                    "Перевод в другие системы счисления осуществляется кнопкой X10~XN.\n" +
                    "Поддерживаемые системы счисления: 2, 3, 4, 5, 6, 7, 8"
        }
    }
}