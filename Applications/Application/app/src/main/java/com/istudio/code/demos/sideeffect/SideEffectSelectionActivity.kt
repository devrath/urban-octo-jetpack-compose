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
                    0 -> startActivity<DisposableEffectActivity>()
                }
            }
        )
    }

    private fun listOfMainDemo() = listOf(
        resources.getString(R.string.demo_effect_disposable),//-> 0
    )
}
