package com.example.code

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.code.databinding.ActivitySampleSelectionBinding
import com.example.code.demos.applyingStyle.ApplyStyleActivity
import com.example.code.demos.buttonComposable.ButtonComposable
import com.example.code.demos.decouplingComposables.DecoupledComposable
import com.example.code.demos.helloWorld.HelloWorldActivity
import com.example.code.demos.modifiers.ModifiersActivity
import com.example.code.demos.surfaceComposable.SurfaceComposableActivity
import com.example.code.extensions.openActivity

class SampleSelection : AppCompatActivity() {

    private lateinit var binding: ActivitySampleSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySampleSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        binding.apply {
            btnHelloWorldId.setOnClickListener { openActivity(HelloWorldActivity::class.java) }
            btnDecoupleComposableId.setOnClickListener { openActivity(DecoupledComposable::class.java) }
            btnButtonComposableId.setOnClickListener { openActivity(ButtonComposable::class.java) }
            btnModifiersId.setOnClickListener { openActivity(ModifiersActivity::class.java) }
            btnApplyStyleId.setOnClickListener { openActivity(ApplyStyleActivity::class.java) }
            btnSurfaceComposableId.setOnClickListener { openActivity(SurfaceComposableActivity::class.java) }
        }
    }

}