package com.istudio.code.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.istudio.code.R
import com.istudio.code.demos.constraintLayout.ConstraintLayoutActivity
import com.istudio.code.demos.imageCard.ImageCardActivity
import com.istudio.code.demos.list.ListActivity
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
            CustomListComposable()
        }
    }

    @Composable
    private fun CustomListComposable(
        modifier: Modifier = Modifier
    ) {

        val currentList = listOfItems()
        var selectedIndex by remember { mutableStateOf(0) }
        val onItemClick = { index: Int -> selectedIndex = index }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
        ) {
            itemsIndexed(currentList) { index, item ->
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
                }
            }
        )
    }

    private fun listOfItems() = listOf(
        resources.getString(R.string.demo_image_card),//-> 0
        resources.getString(R.string.demo_styling_text),//-> 1
        resources.getString(R.string.demo_state),//-> 2
        resources.getString(R.string.demo_simple_form),//-> 3
        resources.getString(R.string.demo_list_view),//-> 4
        resources.getString(R.string.demo_constraint)//-> 5
    )
}