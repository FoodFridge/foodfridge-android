package com.example.foodfridge.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.foodfridge.R
import com.example.foodfridge.components.NormalTextComponent

@Composable
fun LandingPageScreen(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        NormalTextComponent(value = stringResource(id = R.string.landing_main))

    }
}

@Preview
@Composable
fun DefaultPreviewOfLandingPageScreen(){
    LandingPageScreen()
}