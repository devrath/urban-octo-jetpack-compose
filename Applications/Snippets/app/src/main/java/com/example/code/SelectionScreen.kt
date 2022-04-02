package com.example.code

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.code.databinding.ActivitySelectionScreenBinding
import com.example.code.demos.practiceSamples.PracticeSampleSelection
import com.example.code.demos.practiceSamples.profileList.ProfileListActivity
import com.example.code.demos.simpleSamples.helloWorld.HelloWorldActivity
import com.example.code.extensions.openActivity
import com.example.code.selection.ModifierSelection
import com.example.code.selection.SampleSelection
import com.example.code.selection.StylingSelection
import com.example.code.selection.WidgetsSelection

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
            btnSimpleDemosId.setOnClickListener { openActivity(SampleSelection::class.java) }
            btnModifierDemosId.setOnClickListener { openActivity(ModifierSelection::class.java) }
            //btnStylingDemosId.setOnClickListener { openActivity(StylingSelection::class.java) }
            btnWidgetDemosId.setOnClickListener { openActivity(WidgetsSelection::class.java) }
            btnSamplePracticeId.setOnClickListener { openActivity(PracticeSampleSelection::class.java) }
        }
    }

}