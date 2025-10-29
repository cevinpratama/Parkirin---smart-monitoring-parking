package com.d3ifcool.parkirin

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.d3ifcool.parkirin.ui.theme.BiruJ


@Composable
fun HomeScreen(navController: NavController) {

    val isDark = isSystemInDarkTheme()
    val backgroundColor = if (isDark) Color(0xFF121212) else Color.White

    val jumlah = 24
    val tersedia = 4


    Scaffold(
        containerColor = backgroundColor,
        topBar = {
            TopBar(
                title = stringResource(R.string.app_name),
            )
        }
    ) { innerPadding ->

        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            contentAlignment = Alignment.TopCenter
        ) {

            Column {

                Spacer(modifier = Modifier.height(24.dp))

                Box(
                    modifier = Modifier
                        .size(width = 320.dp, height = 287.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(color = BiruJ),
                    contentAlignment = Alignment.TopCenter
                ) {

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Spacer(modifier = Modifier.height(15.dp))

                        Text(
                            text = stringResource(R.string.home_parking_slot_title),
                            fontSize = 45.sp,
                            color = Color.White
                        )

                        Spacer(modifier = Modifier.height(50.dp))

                        Row {
                            Column(
                                horizontalAlignment = Alignment.End
                            ) {
                                Text(
                                    text = stringResource(R.string.home_label_total),
                                    fontSize = 20.sp,
                                    color = Color.White
                                )

                                Text(
                                    text = stringResource(R.string.home_label_available),
                                    fontSize = 20.sp,
                                    color = Color.White
                                )

                                Text(
                                    text = stringResource(R.string.home_label_status),
                                    fontSize = 20.sp,
                                    color = Color.White
                                )
                            }

                            Spacer(modifier = Modifier.width(8.dp))

                            Column {
                                Text(
                                    text = ":",
                                    fontSize = 20.sp,
                                    color = Color.White
                                )

                                Text(
                                    text = ":",
                                    fontSize = 20.sp,
                                    color = Color.White
                                )

                                Text(
                                    text = ":",
                                    fontSize = 20.sp,
                                    color = Color.White
                                )
                            }
                            Spacer(modifier = Modifier.width(8.dp))

                            Column {
                                Text(
                                    text = jumlah.toString(),
                                    fontSize = 20.sp,
                                    color = Color.White
                                )
                                Text(
                                    text = tersedia.toString(),
                                    fontSize = 20.sp,
                                    color = Color.White
                                )
                                if (tersedia == 0)
                                    Text(
                                        text = stringResource(R.string.home_status_full),
                                        fontSize = 20.sp,
                                        color = Color.Red
                                    )
                                else
                                    Text(
                                        text = stringResource(R.string.home_status_available),
                                        fontSize = 20.sp,
                                        color = Color.Green
                                    )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Ini Adalah Main Screen"
                )

            }
        }
    }
}