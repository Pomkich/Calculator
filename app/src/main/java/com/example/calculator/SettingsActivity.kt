package com.example.calculator

import android.app.Activity
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager.getDefaultSharedPreferences
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.ContextThemeWrapper
import android.widget.Button
import android.widget.TextView
import java.util.*


class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val sharedPref = getDefaultSharedPreferences(this)
        val cur_int_theme = sharedPref.getInt("cur_theme", 0)
        val language = sharedPref.getString("language", "en")
        val editor = sharedPref.edit()
        when (cur_int_theme) {
            0 -> setTheme(R.style.Theme_Calculator)
            1 -> setTheme(R.style.Theme_CalculatorDark)
            2 -> setTheme(R.style.Theme_CalculatorKids)
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        var buttonLight: Button = findViewById(R.id.buttonLight)
        var buttonDark: Button = findViewById(R.id.buttonDark)
        var buttonKids: Button = findViewById(R.id.buttonKids)

        var buttonEnglish: Button = findViewById(R.id.buttonEnglish)
        var buttonRussian: Button = findViewById(R.id.buttonRussian)

        if (language == "en") {
            val themeText: TextView = findViewById(R.id.textTheme)
            val languageText: TextView = findViewById(R.id.textLanguage)
            themeText.setText("Theme selection")
            languageText.setText("Language selection")
            buttonLight.setText("Light")
            buttonDark.setText("Dark")
            buttonKids.setText("Kids")
            buttonEnglish.setText("English")
            buttonRussian.setText("Russian")
        }
        else if (language == "ru") {
            val themeText: TextView = findViewById(R.id.textTheme)
            val languageText: TextView = findViewById(R.id.textLanguage)
            themeText.setText("Выбор темы")
            languageText.setText("Выбор языка")
            buttonLight.setText("Светлая")
            buttonDark.setText("Тёмная")
            buttonKids.setText("Детская")
            buttonEnglish.setText("Английский")
            buttonRussian.setText("Русский")
        }

        buttonLight.setOnClickListener() {
            editor.putInt("cur_theme", 0)
            editor.commit()
            // открываем заново приложение
            val intent = Intent(applicationContext, MainActivity::class.java)
            val mPendingIntentId: Int = 321123
            val mPendingIntent = PendingIntent.getActivity(
                applicationContext,
                mPendingIntentId,
                intent,
                PendingIntent.FLAG_CANCEL_CURRENT
            )
            val mgr = applicationContext.getSystemService(ALARM_SERVICE) as AlarmManager
            //mgr[AlarmManager.RTC, System.currentTimeMillis() + 100] = mPendingIntent
            System.exit(0)
        }
        buttonDark.setOnClickListener() {
            editor.putInt("cur_theme", 1)
            editor.commit()
            val intent = Intent(applicationContext, MainActivity::class.java)
            val mPendingIntentId: Int = 321123
            val mPendingIntent = PendingIntent.getActivity(
                applicationContext,
                mPendingIntentId,
                intent,
                PendingIntent.FLAG_CANCEL_CURRENT
            )
            val mgr = applicationContext.getSystemService(ALARM_SERVICE) as AlarmManager
            //mgr[AlarmManager.RTC, System.currentTimeMillis() + 100] = mPendingIntent
            System.exit(0)
        }
        buttonKids.setOnClickListener() {
            editor.putInt("cur_theme", 2)
            editor.commit()
            val intent = Intent(applicationContext, MainActivity::class.java)
            val mPendingIntentId: Int = 321123
            val mPendingIntent = PendingIntent.getActivity(
                applicationContext,
                mPendingIntentId,
                intent,
                PendingIntent.FLAG_CANCEL_CURRENT
            )
            val mgr = applicationContext.getSystemService(ALARM_SERVICE) as AlarmManager
            //mgr[AlarmManager.RTC, System.currentTimeMillis() + 100] = mPendingIntent
            System.exit(0)
        }

        buttonEnglish.setOnClickListener() {
            editor.putString("language", "en")
            editor.commit()
            val intent = Intent(applicationContext, MainActivity::class.java)
            val mPendingIntentId: Int = 321123
            val mPendingIntent = PendingIntent.getActivity(
                applicationContext,
                mPendingIntentId,
                intent,
                PendingIntent.FLAG_CANCEL_CURRENT
            )
            val mgr = applicationContext.getSystemService(ALARM_SERVICE) as AlarmManager
            //mgr[AlarmManager.RTC, System.currentTimeMillis() + 100] = mPendingIntent
            System.exit(0)
        }

        buttonRussian.setOnClickListener() {
            editor.putString("language", "ru")
            editor.commit()
            val intent = Intent(applicationContext, MainActivity::class.java)
            val mPendingIntentId: Int = 321123
            val mPendingIntent = PendingIntent.getActivity(
                applicationContext,
                mPendingIntentId,
                intent,
                PendingIntent.FLAG_CANCEL_CURRENT
            )
            val mgr = applicationContext.getSystemService(ALARM_SERVICE) as AlarmManager
            //mgr[AlarmManager.RTC, System.currentTimeMillis() + 100] = mPendingIntent
            System.exit(0)
        }
    }
}