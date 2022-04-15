package com.example.code.demos.practiceSamples.profileList

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.code.R
import com.example.code.ui.theme.CodeTheme

class ProfileListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeTheme { UserApplication() }
        }
    }
}

/**
 * Using this composable we can determine where to navigate into
 */
@Composable
fun UserApplication(){
    /**
     * Just like normal controller navigation also has a state and it has to be remembered
     */
    val navController = rememberNavController()
    /**
     * Create NavHost that take nav-controller and nav-graph as parameters
     * Nav-Host allows us to control the actual navigation
     * Nav-Graph represents all the routes a user can take in a  application
     */
    NavHost(navController = navController, startDestination = "users_list"){
        composable("users_list") {
            // It takes a composable
            UsersListScreen(navController)
        }
        composable(
            route = "users_details/{userId}",
            arguments = listOf(navArgument("userId"){
                type = NavType.IntType
            })
        ) { navBackStackEntry ->
            // It takes a composable
            UserProfileDetailsScreen(navBackStackEntry.arguments!!.getInt("userId"))
        }
    }
}

@Composable
fun UsersListScreen(navController:NavController?) {

    val isDetailsScreen = false

    Scaffold(topBar = {AppBar()}) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
            ) {
                val listOfUsers : ArrayList<Userprofile> = userProfileList
                LazyColumn{
                    items(listOfUsers){ user ->
                        ProfileCard(name = user.name,isDetailsScreen){
                            // This is called trailing lambda - Since last parameter is a lambda
                            navController?.navigate("users_details/${user.id}")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun UserProfileDetailsScreen(id: Int) {

    val userprofile = userProfileList.first { userprofile -> userprofile.id == id }
    val isDetailsScreen = true

    Scaffold(topBar = {AppBar()}) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
            ) {
                ProfileDetailsCard(name = userprofile.name,isDetailsScreen)
            }
        }
    }
}

@Composable
fun AppBar() {
    TopAppBar(
        navigationIcon = {
            Icon(Icons.Filled.Menu, "Menu")
        },
        title = { Text(text = "Home") }
    )
}

@Composable
fun ProfileCard(name: String, isDetailsScreen: Boolean=false, clickAction: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Top)
            .clickable {
              if(!isDetailsScreen){
                  // when someone clicks the composable, Invoke it
                  clickAction.invoke()
              }
            },
        elevation = 8.dp
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            ProfilePicture(isDetailsScreen)
            ProfileContent(name)
        }
    }
}

@Composable
fun ProfileDetailsCard(name: String,isDetailsScreen:Boolean) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProfilePicture(isDetailsScreen)
        ProfileContent(name)
    }
}

@Composable
fun ProfilePicture(isDetailScreen : Boolean = false) {
    Card(
        shape = CircleShape,
        border = BorderStroke(width = 2.dp, color = Color.Green),
        modifier = Modifier.padding(16.dp),
        elevation = 2.dp
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_profile_pic),
            contentDescription = "Profile picture",
            modifier = if(isDetailScreen) {
                Modifier.size(150.dp)
            }else{
                Modifier.size(50.dp)
            },
            contentScale = ContentScale.Crop
        )
    }

}

@Composable
fun ProfileContent(name: String) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = name,
            style = MaterialTheme.typography.h5
        )
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(
                text = "Active now",
                style = MaterialTheme.typography.body1
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UsersListScreenDefaultPreview() {
    CodeTheme { UsersListScreen(null) }
}

@Preview(showBackground = true)
@Composable
fun UserProfileDetailsScreenDefaultPreview() {
    CodeTheme { UserProfileDetailsScreen(id=0) }
}