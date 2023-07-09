package com.istudio.code.demos.books.basicComposableFunction

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity;
import com.istudio.code.R
import com.istudio.code.demos.books.basicComposableFunction.app.JetFundamentalsApp


class MainActivityBasicComposableFunction : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContent {
            JetFundamentalsApp()
        }
    }



}