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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.d3ifcool.parkirin.ui.theme.BiruB
import com.d3ifcool.parkirin.ui.theme.BiruJ


@Composable
fun HomeScreen(navController: NavController) {

    val isDark = isSystemInDarkTheme()
    val backgroundColor = if (isDark) Color(0xFF121212) else Color.White

    val jumlah = 5
    val tersedia = 2


    Scaffold(
        containerColor = backgroundColor,
        topBar = {
            TopBar(
                title = stringResource(R.string.app_name),
            )
        }
    ) { innerPadding ->

        val scrollState = rememberScrollState()
        val cardShape = RoundedCornerShape(16.dp)
        val slotShape = RoundedCornerShape(5.dp)
        val circleShape = RoundedCornerShape(20.dp)
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .verticalScroll(scrollState)
                .drawBehind {
                    val canvasWidth = size.width

                    val yGaris1 = (308.dp + 15.dp).toPx()
                    val yGaris2 = (435.dp + 15.dp).toPx()
                    val yGaris3 = (520.dp + 15.dp).toPx()
                    val yGarisVertikal_bawah = (yGaris3.toDp() + 130.dp).toPx()
                    val startX = canvasWidth * 0.05f
                    val endX = canvasWidth * 0.95f
                    val midX = canvasWidth * 0.7f
                    drawLine(
                        color = BiruJ,
                        start = Offset(startX, yGaris1),
                        end = Offset(endX, yGaris1),
                        strokeWidth = 4f
                    )
                    drawLine(
                        color = BiruJ,
                        start = Offset(startX, yGaris2),
                        end = Offset(endX, yGaris2),
                        strokeWidth = 4f
                    )
                    drawLine(
                        color = BiruJ,
                        start = Offset(startX, yGaris3),
                        end = Offset(midX, yGaris3),
                        strokeWidth = 4f
                    )
                    drawLine(
                        color = BiruJ,
                        start = Offset(midX, yGarisVertikal_bawah),
                        end = Offset(midX, yGaris3),
                        strokeWidth = 4f
                    )
                    drawLine(
                        color = BiruJ,
                        start = Offset(endX, yGarisVertikal_bawah),
                        end = Offset(endX, yGaris2),
                        strokeWidth = 4f
                    )
                },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Column {

                Spacer(modifier = Modifier.height(24.dp))

                Box(
                    modifier = Modifier
                        .size(width = 320.dp, height = 287.dp)
                        .shadow(
                            elevation = 10.dp,
                            shape = cardShape
                        )
                        .clip(RoundedCornerShape(16.dp))
                        .background(color = BiruJ, shape = cardShape),
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

                        Spacer(modifier = Modifier.height(40.dp))

                        Row {
                            Column(
                                horizontalAlignment = Alignment.End
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(width = 130.dp, height = 130.dp)
                                        .shadow(
                                            elevation = 10.dp,
                                            shape = cardShape
                                        )
                                        .clip(RoundedCornerShape(16.dp))
                                        .background(BiruJ, shape = cardShape)
                                        .background(
                                            color = BiruB.copy(alpha = 0.59f),
                                            shape = cardShape
                                        ),
                                    contentAlignment = Alignment.TopCenter
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Spacer(modifier = Modifier.height(20.dp))
                                        Text(
                                            text = stringResource(R.string.home_label_total),
                                            fontSize = 20.sp,
                                            color = Color.White
                                        )
                                        Spacer(modifier = Modifier.height(15.dp))
                                        Text(
                                            text = jumlah.toString(),
                                            fontSize = 30.sp,
                                            color = Color.White
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.width(20.dp))

                            Column(
                                horizontalAlignment = Alignment.End
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(width = 130.dp, height = 130.dp)
                                        .shadow(
                                            elevation = 10.dp,
                                            shape = cardShape
                                        )
                                        .clip(RoundedCornerShape(16.dp))
                                        .background(BiruJ, shape = cardShape)
                                        .background(
                                            color = BiruB.copy(alpha = 0.59f),
                                            shape = cardShape
                                        ),
                                    contentAlignment = Alignment.TopCenter
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Spacer(modifier = Modifier.height(20.dp))
                                        Text(
                                            text = stringResource(R.string.home_parking_slot_title),
                                            fontSize = 20.sp,
                                            color = Color.White
                                        )
                                        Spacer(modifier = Modifier.height(15.dp))
                                        Text(
                                            text = tersedia.toString(),
                                            fontSize = 30.sp,
                                            color = Color.White
                                        )
                                    }
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(30.dp))

                Row {
                    Box(
                        modifier = Modifier
                            .size(width = 100.dp, height = 100.dp)
                            .shadow(
                                elevation = 10.dp,
                                shape = slotShape
                            )
                            .background(Color.White, shape = slotShape)
                            .background(color = BiruJ.copy(alpha = 0.59f), shape = slotShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "A1",
                            fontSize = 32.sp,
                            color = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.width(13.dp))
                    Box(
                        modifier = Modifier
                            .size(width = 100.dp, height = 100.dp)
                            .shadow(
                                elevation = 10.dp,
                                shape = slotShape
                            )
                            .background(Color.White, shape = slotShape)
                            .background(color = BiruJ.copy(alpha = 0.59f), shape = slotShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "A2",
                            fontSize = 32.sp,
                            color = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.width(13.dp))
                    Box(
                        modifier = Modifier
                            .size(width = 100.dp, height = 100.dp)
                            .shadow(
                                elevation = 10.dp,
                                shape = slotShape
                            )
                            .background(Color.White, shape = slotShape)
                            .background(color = Color.Gray.copy(alpha = 0.59f), shape = slotShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "A3",
                            fontSize = 32.sp,
                            color = Color.White
                        )
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))

                Row {
                    repeat(5) {
                        Text(
                            text = "<",
                            fontSize = 32.sp,
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.width(50.dp))
                    }
                }
                Spacer(modifier = Modifier.height(45.dp))
                Row {
                    Row {
                        Box(
                            modifier = Modifier
                            .size(width = 100.dp, height = 100.dp)
                            .shadow(
                                elevation = 10.dp,
                                shape = slotShape
                            )
                            .background(Color.White, shape = slotShape)
                            .background(color = Color.Gray.copy(alpha = 0.59f), shape = slotShape),
                        contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "A4",
                                fontSize = 32.sp,
                                color = Color.White
                            )
                        }
                        Spacer(modifier = Modifier.width(13.dp))
                        Box(
                            modifier = Modifier
                            .size(width = 100.dp, height = 100.dp)
                            .shadow(
                                elevation = 10.dp,
                                shape = slotShape
                            )
                            .background(Color.White, shape = slotShape)
                            .background(color = Color.Gray.copy(alpha = 0.59f), shape = slotShape),
                        contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "A5",
                                fontSize = 32.sp,
                                color = Color.White
                            )
                        }

                    }
                    Spacer(modifier = Modifier.width(75.dp))
                    Column(
                        horizontalAlignment = Alignment.Start
                    ) {
                        repeat(2) {
                            Text(
                                text = "^",
                                fontSize = 32.sp,
                                color = Color.Gray
                            )
                            Spacer(modifier = Modifier.height(25.dp))
                        }
                    }
                }
                Spacer(modifier = Modifier.height(25.dp))

                Row {
                    Box(
                        modifier = Modifier
                            .size(width = 150.dp, height = 50.dp)
                            .shadow(
                                elevation = 10.dp,
                                shape = RoundedCornerShape(16.dp)
                            )
                            .background(Color.White, shape = circleShape)
                            .background(color = BiruJ, shape = RoundedCornerShape(16.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(width = 20.dp, height = 20.dp)
                                    .shadow(
                                elevation = 10.dp,
                                shape = circleShape
                            )
                            .background(Color.White, shape = circleShape)
                            .background(color = Color.Gray.copy(alpha = 0.59f), shape = slotShape)
                            ) {}
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = "Full",
                                fontSize = 32.sp,
                                color = Color.White
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    Box(
                        modifier = Modifier
                            .size(width = 150.dp, height = 50.dp)
                            .shadow(
                                elevation = 10.dp,
                                shape = RoundedCornerShape(16.dp)
                            )
                            .background(Color.White, shape = circleShape)
                            .background(color = BiruJ, shape = RoundedCornerShape(16.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(width = 20.dp, height = 20.dp)
                                    .shadow(
                                elevation = 10.dp,
                                shape = circleShape
                            )
                            .background(Color.White, shape = circleShape)
                            .background(color = BiruJ.copy(alpha = 0.59f), shape = slotShape)
                            ) {}
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = "Free",
                                fontSize = 32.sp,
                                color = Color.White
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))

            }
        }
    }
}

@Preview
@Composable
fun HomePreview() {
    val navController = rememberNavController()

    HomeScreen(
        navController = navController
    )
}