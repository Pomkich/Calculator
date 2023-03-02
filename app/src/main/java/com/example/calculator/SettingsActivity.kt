package com.example.calculator

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager.getDefaultSharedPreferences
import android.support.v7.app.AppCompatActivity
import android.widget.Button


class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val sharedPref = getDefaultSharedPreferences(this)
        val cur_int_theme = sharedPref.getInt("cur_theme", 0)
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
            mgr[AlarmManager.RTC, System.currentTimeMillis() + 100] = mPendingIntent
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
            mgr[AlarmManager.RTC, System.currentTimeMillis() + 100] = mPendingIntent
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
            mgr[AlarmManager.RTC, System.currentTimeMillis() + 100] = mPendingIntent
            System.exit(0)
        }
    }
}