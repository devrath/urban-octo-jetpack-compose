package com.example.code.demos.practiceSamples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.code.databinding.ActivityPracticeSampleSelectionBinding
import com.example.code.databinding.ActivitySelectionScreenBinding
import com.example.code.demos.practiceSamples.profileList.ProfileListActivity
import com.example.code.extensions.openActivity
import com.example.code.selection.ModifierSelection
import com.example.code.selection.SampleSelection
import com.example.code.selection.WidgetsSelection

class PracticeSampleSelection : AppCompatActivity() {

    private lateinit var binding: ActivityPracticeSampleSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPracticeSampleSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        binding.apply {
            btnProfileListSampleId.setOnClickListener { openActivity(ProfileListActivity::class.java) }

        }
    }

}