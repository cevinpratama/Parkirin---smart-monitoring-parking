package com.d3ifcool.parkirin

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.d3ifcool.parkirin.ui.theme.BiruJ

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    title : String,
    modifier: Modifier = Modifier
){
    val isDark = isSystemInDarkTheme()
    val cardColor = if (isDark) Color(0xFF1E1E1E) else Color.White

    Box(
    modifier = modifier
        .shadow(4.dp)
        .height(70.dp)
    ){
        TopAppBar(
            title = {
            },actions = {
                  Text(
                    text =title,
                    style = MaterialTheme.typography.bodyLarge,
                    color = BiruJ,
                      modifier = Modifier.padding(end = 16.dp)
                )
            },
             colors = TopAppBarDefaults.topAppBarColors(
                containerColor = cardColor,
                titleContentColor = contentColor,
                navigationIconContentColor = contentColor,
                actionIconContentColor = contentColor
             )
        )
    }
}