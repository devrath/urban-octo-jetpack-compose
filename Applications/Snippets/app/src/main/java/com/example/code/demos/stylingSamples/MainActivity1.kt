package com.example.code.demos.stylingSamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.code.R
import com.example.code.demos.stylingSamples.TestingObject.TestingCall

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        TestingCall()
    }
}