package com.example.code

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.code.databinding.ActivityWidgetsSelectionBinding
import com.example.code.demos.simpleSamples.helloWorld.HelloWorldActivity
import com.example.code.extensions.openActivity

class WidgetsSelection : AppCompatActivity() {

    private lateinit var binding: ActivityWidgetsSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWidgetsSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        binding.apply {
            btnRowColumnDemoId.setOnClickListener { openActivity(HelloWorldActivity::class.java) }
        }
    }

}