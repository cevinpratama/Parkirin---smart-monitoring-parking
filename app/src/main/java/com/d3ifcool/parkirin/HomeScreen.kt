package com.d3ifcool.parkirin

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.d3ifcool.parkirin.ui.theme.BiruJ

@Composable
fun HomeScreen(navController: NavController){

      val isDark = isSystemInDarkTheme()
    val backgroundColor = if (isDark) Color(0xFF121212) else Color.White

    Scaffold (
        containerColor = backgroundColor,
        topBar = {
          TopBar(
            title = "ParkirIn",
          )
        }
    ){innerPadding ->

        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            contentAlignment = Alignment.TopCenter
        ) {

            Column (

            ){

                Spacer(modifier = Modifier.height(24.dp))

                Box (
                    modifier = Modifier
                         .size(width = 320.dp, height = 287.dp)
                         .clip(RoundedCornerShape(16.dp))
                        .background(color = BiruJ),
                    contentAlignment = Alignment.TopCenter
                ){
                    Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                    ){

                    Spacer(modifier = Modifier.height(15.dp))

                    Text(
                        text = "Slot Parkir",
                        fontSize = 45.sp,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(50.dp))

                    Text(
                        text = "Jumlah: 24 slot",
                        fontSize = 20.sp,
                        color = Color.White
                    )
                        Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Tersedia : 4 slot",
                        fontSize = 20.sp,
                        color = Color.White
                    )
                        Spacer(modifier = Modifier.height(70.dp))

                    Text(
                        text = "Status : Tersedia",
                        fontSize = 20.sp,
                        color = Color.Green
                    )

                    }

                }



                Text(text = "Konten Utama HomeScreen")

            }

    }
}
}