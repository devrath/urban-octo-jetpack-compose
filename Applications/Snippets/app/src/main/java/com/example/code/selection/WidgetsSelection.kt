package com.example.code.selection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.code.databinding.ActivityWidgetsSelectionBinding
import com.example.code.demos.widgetSamples.BoxComposableDemo
import com.example.code.demos.widgetSamples.RowsAndColumnsActivity
import com.example.code.demos.widgetSamples.SpacerWidgetDemoActivity
import com.example.code.demos.widgetSamples.SurfaceComposableDemo
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
            btnRowColumnDemoId.setOnClickListener { openActivity(RowsAndColumnsActivity::class.java) }
            btnSpacerDemoId.setOnClickListener { openActivity(SpacerWidgetDemoActivity::class.java) }
            btnBoxComposableDemoId.setOnClickListener { openActivity(BoxComposableDemo::class.java) }
            btnSurfaceComposableDemoId.setOnClickListener { openActivity(SurfaceComposableDemo::class.java) }
        }
    }

}