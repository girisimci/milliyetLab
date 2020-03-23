package com.example.milliyetlab.ui

import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.example.milliyetlab.R
import com.example.milliyetlab.ui.util.extStartActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        object : CountDownTimer(3000, 1000) {
            override fun onFinish() {
                this@SplashActivity extStartActivity DashboardActivity::class.java


            }

            override fun onTick(millisUntilFinished: Long) {

                txtCount.text = (millisUntilFinished / 1000).toString()

            }
        }.start()

    }

}
