package com.istudio.code.ui

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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.istudio.code.R
import com.istudio.code.demos.constraintLayout.ConstraintLayoutActivity
import com.istudio.code.demos.imageCard.ImageCardActivity
import com.istudio.code.demos.list.ListActivity
import com.istudio.code.demos.sideeffect.SideEffectSelectionActivity
import com.istudio.code.demos.simpleform.SimpleFormActivity
import com.istudio.code.demos.state.StateActivity
import com.istudio.code.demos.stylingText.StylingTextActivity
import com.istudio.code.ui.theme.ComposeTheme
import com.istudio.code.utils.ButtonSelection
import com.istudio.code.utils.startActivity

class MainActivity : ComponentActivity() {

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
                    0 -> startActivity<ImageCardActivity>()
                    1 -> startActivity<StylingTextActivity>()
                    2 -> startActivity<StateActivity>()
                    3 -> startActivity<SimpleFormActivity>()
                    4 -> startActivity<ListActivity>()
                    5 -> startActivity<ConstraintLayoutActivity>()
                    6 -> startActivity<SideEffectSelectionActivity>()
                }
            }
        )
    }

    private fun listOfMainDemo() = listOf(
        resources.getString(R.string.demo_image_card),//-> 0
        resources.getString(R.string.demo_styling_text),//-> 1
        resources.getString(R.string.demo_state),//-> 2
        resources.getString(R.string.demo_simple_form),//-> 3
        resources.getString(R.string.demo_list_view),//-> 4
        resources.getString(R.string.demo_constraint),//-> 5
        resources.getString(R.string.demo_effect_selection)//-> 6

    )
}