package com.istudio.code.demos.sideeffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.istudio.code.R
import com.istudio.code.demos.sideeffect.demos.disposableEffect.DisposableEffectActivity
import com.istudio.code.demos.sideeffect.demos.launchedEffect.LaunchedEffectActivity
import com.istudio.code.demos.sideeffect.demos.produceState.ProduceStateActivity
import com.istudio.code.demos.sideeffect.demos.rememberCoroutineScope.RememberCoroutineScopeActivity
import com.istudio.code.demos.sideeffect.demos.rememberUpdatedState.RememberUpdatedStateActivity
import com.istudio.code.demos.sideeffect.demos.sideEffect.SideEffectActivity
import com.istudio.code.utils.ButtonSelection
import com.istudio.code.utils.startActivity

class SideEffectSelectionActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomListComposable(listOfMainDemo())
        }
    }

    @Composable
    private fun CustomListComposable(
        listOfItems: List<String> = listOf()
    ) {

        var selectedIndex by remember { mutableStateOf(0) }
        val onItemClick = { index: Int -> selectedIndex = index }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
        ) {
            itemsIndexed(listOfItems) { index, item ->
                ItemView(
                    index = index,
                    item = item,
                    selected = selectedIndex == index,
                    onClick = onItemClick
                )
            }
        }
    }

    @Composable
    private fun ItemView(index: Int, item: String, selected: Boolean, onClick: (Int) -> Unit) {
        ButtonSelection(
            buttonText = item,
            clickAction = {
                when (index) {
                    0 -> startActivity<LaunchedEffectActivity>()
                    1 -> startActivity<RememberCoroutineScopeActivity>()
                    2 -> startActivity<RememberUpdatedStateActivity>()
                    3 -> startActivity<SideEffectActivity>()
                    4 -> startActivity<ProduceStateActivity>()
                    5 -> startActivity<DisposableEffectActivity>()
                }
            }
        )
    }

    private fun listOfMainDemo() = listOf(
        resources.getString(R.string.demo_launched_effect),//-> 0
        resources.getString(R.string.demo_remember_coroutine_scope_effect),//-> 1
        resources.getString(R.string.demo_remember_updated_state),//-> 2
        resources.getString(R.string.demo_side_effect),//-> 3
        resources.getString(R.string.demo_produce_state),//-> 4
        resources.getString(R.string.demo_effect_disposable),//-> 5
    )
}
