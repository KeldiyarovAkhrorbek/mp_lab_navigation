package com.example.labnavigation.test

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        var nameValue = remember { mutableStateOf("") }
        var ageValue = remember { mutableStateOf("") }
        Text(text = "Home Screen", fontSize = 54.sp)
        Spacer(modifier = Modifier.height(65.dp))
        TextField(
            value = nameValue.value,
            onValueChange = { nameValue.value = it },
            modifier = Modifier.padding(10.dp),
            placeholder = {
                Text(text = "Your name")
            }
        )
        TextField(
            value = ageValue.value,
            onValueChange = { ageValue.value = it },
            modifier = Modifier.padding(10.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = {
                Text(text = "Your age")
            }
        )

        Button(onClick = {
            navController.navigate("Details/${nameValue.value}/${ageValue.value}")
        }) {
            Text(text = "Navigate to details", fontSize = 20.sp)
        }
    }
}