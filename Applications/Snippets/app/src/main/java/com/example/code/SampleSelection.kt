package com.example.code

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.code.databinding.ActivitySampleSelectionBinding
import com.example.code.demos.simpleSamples.aligningComposable.AlignComposableActivity
import com.example.code.demos.simpleSamples.applyingStyle.ApplyStyleActivity
import com.example.code.demos.simpleSamples.arrangeAlignComposable.ArrangeAlignComposableActivity
import com.example.code.demos.simpleSamples.buttonComposable.ButtonComposable
import com.example.code.demos.simpleSamples.decouplingComposable.DecoupledComposable
import com.example.code.demos.simpleSamples.displayDynamicData.DynamicDataList
import com.example.code.demos.simpleSamples.helloWorld.HelloWorldActivity
import com.example.code.demos.simpleSamples.modifiers.ModifiersActivity
import com.example.code.demos.simpleSamples.multipleComposable.MultipleComposableActivity
import com.example.code.demos.simpleSamples.nestViewsComposable.NestViewComposableActivity
import com.example.code.demos.simpleSamples.reusingComposable.ReusingComposableActivity
import com.example.code.demos.simpleSamples.surfaceComposable.SurfaceComposableActivity
import com.example.code.demos.simpleSamples.wrappingContentComposable.WrapComposableActivity
import com.example.code.demos.statesSamples.rememberDemo.RememberDemo
import com.example.code.demos.statesSamples.updateState.UpdatingState
import com.example.code.demos.statesSamples.updateTimer.UpdateTimer
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
            btnWrapComposableId.setOnClickListener { openActivity(WrapComposableActivity::class.java) }
            btnAlignComposableId.setOnClickListener { openActivity(AlignComposableActivity::class.java) }
            btnMultipleComposableId.setOnClickListener { openActivity(MultipleComposableActivity::class.java) }
            btnReuseComposableId.setOnClickListener { openActivity(ReusingComposableActivity::class.java) }
            btnArrangeAlignComposableId.setOnClickListener { openActivity(ArrangeAlignComposableActivity::class.java) }
            btnNestedViewComposableId.setOnClickListener { openActivity(NestViewComposableActivity::class.java) }
            btnDynamicViewsId.setOnClickListener { openActivity(DynamicDataList::class.java) }
            btnUpdateStateId.setOnClickListener { openActivity(UpdatingState::class.java) }
            btnStateUpdateUsingTimerId.setOnClickListener { openActivity(UpdateTimer::class.java) }
            btnRememberDemoId.setOnClickListener { openActivity(RememberDemo::class.java) }
        }
    }

}