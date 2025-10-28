package com.d3ifcool.parkirin

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.d3ifcool.parkirin.ui.theme.BiruJ
import com.d3ifcool.parkirin.ui.theme.Biruk
import com.d3ifcool.parkirin.ui.theme.LucidaSansStyle

@Composable
fun splashPage(navController: NavController){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .clickable{
                navController.navigate("HomeScreen")
            },
        color = Color.White
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
                horizontalAlignment =Alignment.CenterHorizontally
        ){

            Spacer(modifier = Modifier.weight(2f))

            Text(
                text = "ParkirIn",
                fontSize = 64.sp,
                style = MaterialTheme.typography.bodyLarge,color = BiruJ
            )

            Spacer(modifier = Modifier.height(2.dp))

            Text(
                text = "temukan, parkir, lanjut",
                fontSize = 19.sp,
                style = LucidaSansStyle,color = Biruk
            )

            Spacer(modifier = Modifier.weight(2f))
            Text(
                text = "click anywhere",
                fontSize = 12.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(100.dp))
        }
    }

}