package com.example.foodfridge.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun NormalButtonComponent(value:String){
    Button(
        onClick = {}
    ){
        Text(text = value)
    }
}
