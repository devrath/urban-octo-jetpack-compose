package com.demo.tracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.demo.core.navigation.Route
import com.demo.onboarding_presentation.gender.GenderScreen
import com.demo.onboarding_presentation.welcome.WelcomeScreen
import com.demo.tracker.navigation.navigate
import com.demo.tracker.ui.theme.CaloryTrackerTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaloryTrackerTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Route.WELCOME
                ){
                    composable(route = Route.WELCOME){
                        WelcomeScreen(onNavigate = navController::navigate)
                    }
                    composable(route = Route.AGE){

                    }
                    composable(route = Route.GENDER){
                        GenderScreen(onNavigate = navController::navigate)
                    }  
                    composable(route = Route.HEIGHT){

                    }
                    composable(route = Route.WEIGHT){

                    }
                    composable(route = Route.NUTRIENT_GOAL){

                    }
                    composable(route = Route.ACTIVITY){

                    }
                    composable(route = Route.GOAL){

                    }
                    composable(route = Route.TRACKER_OVERVIEW){

                    }
                    composable(route = Route.SEARCH){

                    }
                }
            }
        }
    }
}