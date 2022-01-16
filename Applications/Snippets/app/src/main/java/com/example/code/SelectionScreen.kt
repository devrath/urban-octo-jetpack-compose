package com.example.code

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.code.databinding.ActivitySelectionScreenBinding
import com.example.code.demos.simpleSamples.helloWorld.HelloWorldActivity
import com.example.code.extensions.openActivity

class SelectionScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySelectionScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectionScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        binding.apply {
            btnWidgetDemosId.setOnClickListener { openActivity(HelloWorldActivity::class.java) }
            btnSimpleDemosId.setOnClickListener { openActivity(SampleSelection::class.java) }
            btnModifierDemosId.setOnClickListener { openActivity(ModifierSelection::class.java) }
        }
    }

}