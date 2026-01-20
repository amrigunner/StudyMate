package com.example.studymateapp

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TimerActivity : AppCompatActivity() {

    private var isRunning = false
    private lateinit var countDownTimer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)

        // Kod yang telah dibetulkan (Tanpa 'id = ')
        val tvTime = findViewById<TextView>(R.id.tvTime)
        val btnStart = findViewById<Button>(R.id.btnStart)

        btnStart.setOnClickListener {
            if (!isRunning) {
                startTimer(25 * 60 * 1000, tvTime) // Contoh 25 minit
                btnStart.text = "STOP"
                isRunning = true
            } else {
                countDownTimer.cancel()
                btnStart.text = "START"
                isRunning = false
            }
        }
    }

    private fun startTimer(timeInMillis: Long, tvTime: TextView) {
        countDownTimer = object : CountDownTimer(timeInMillis, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val minutes = (millisUntilFinished / 1000) / 60
                val seconds = (millisUntilFinished / 1000) % 60
                tvTime.text = String.format("%02d:%02d", minutes, seconds)
            }

            override fun onFinish() {
                tvTime.text = "00:00"
                isRunning = false
            }
        }.start()
    }
}