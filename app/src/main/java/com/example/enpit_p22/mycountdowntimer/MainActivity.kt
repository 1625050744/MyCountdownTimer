package com.example.enpit_p22.mycountdowntimer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    inner class MyCountDownTimer(milisInFuture: Long, CountDownInterval: Long)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
