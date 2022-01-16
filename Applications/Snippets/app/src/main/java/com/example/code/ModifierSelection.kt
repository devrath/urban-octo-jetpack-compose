package com.example.code

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.code.databinding.ActivityModifierSelectionBinding
import com.example.code.demos.modifierSamples.ModifierSampleOneActivity
import com.example.code.extensions.openActivity

class ModifierSelection  : AppCompatActivity() {

    private lateinit var binding: ActivityModifierSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityModifierSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        binding.apply {
            btnModifierDemoOne.setOnClickListener { openActivity(ModifierSampleOneActivity::class.java) }
        }
    }

}