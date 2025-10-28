package com.d3ifcool.parkirin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.d3ifcool.parkirin.ui.theme.ParkirINTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ParkirINTheme {
                ParkirINApp()
            }
        }
    }
}

@Composable
fun ParkirINApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination ="splashPage"
    ){
        composable("splashPage") {
            splashPage(navController = navController)
        }
    }
}
