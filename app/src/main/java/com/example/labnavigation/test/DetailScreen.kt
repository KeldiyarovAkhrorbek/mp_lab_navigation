package com.example.labnavigation.test

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailScreen(myName: String?, myAge: Int?) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Details Screen", fontSize = 30.sp)
        Spacer(modifier = Modifier.height(45.dp))
        Text(text = "Your name is: $myName", fontSize = 30.sp)
        Spacer(modifier = Modifier.height(45.dp))
        Text(text = "Your age is: $myAge", fontSize = 30.sp)
        Spacer(modifier = Modifier.height(45.dp))
    }
}