package com.example.code.selection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.code.databinding.ActivityStylingSelectionBinding
import com.example.code.demos.stylingSamples.StylingSampleDemo
import com.example.code.extensions.openActivity

class StylingSelection  : AppCompatActivity() {

    private lateinit var binding: ActivityStylingSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStylingSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        binding.apply {
            btnDemoOneId.setOnClickListener { openActivity(StylingSampleDemo::class.java) }
        }
    }

}