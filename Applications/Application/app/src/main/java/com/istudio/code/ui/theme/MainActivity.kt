package com.istudio.code.ui.theme

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
import com.istudio.code.demos.simpleform.SimpleFormActivity
import com.istudio.code.demos.state.StateActivity
import com.istudio.code.demos.stylingText.StylingTextActivity
import com.istudio.code.ui.theme.ComposeTheme
import com.istudio.code.utils.ButtonSelection
import com.istudio.code.utils.startActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {}
    }
}