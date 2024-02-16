package com.example.foodfridge.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.example.foodfridge.R

@Composable
fun IngredientsDisplayComponent() {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = Color.Black
    ) {
       NormalButtonComponent(value = "Generate Recipe")
    }
}


