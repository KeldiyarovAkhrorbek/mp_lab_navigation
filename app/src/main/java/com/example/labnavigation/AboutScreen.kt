package com.example.labnavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

@Composable
fun AboutScreen(listIndex: Int?) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(
                horizontal = 10.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = programmingLanguages[listIndex ?: 0].name, fontSize = 40.sp)
        Spacer(modifier = Modifier.height(10.dp))
        Image(
            painter = rememberAsyncImagePainter(programmingLanguages[listIndex ?: 0].imageUrl),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(
                    100.dp
                )
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = programmingLanguages[listIndex ?: 0].longDescription, fontSize = 20.sp)
        Spacer(modifier = Modifier.height(10.dp))
    }
}