package com.example.foodfridge.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.foodfridge.R
import com.example.foodfridge.components.IngredientsDisplayComponent
import com.example.foodfridge.components.NormalTextComponent
import com.example.foodfridge.components.PantryCategoryComponent

@Composable
fun LandingPageScreen(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column {
            NormalTextComponent(value = stringResource(id = R.string.landing_main))
            NormalTextComponent(value = stringResource(id = R.string.landing_sub))
            IngredientsDisplayComponent()
            Image(
                painter = painterResource(id = R.drawable.chef),
                contentDescription = stringResource(id = R.string.chef_image)
            )
            PantryCategoryComponent()

        }


    }
}

@Preview
@Composable
fun DefaultPreviewOfLandingPageScreen(){
    LandingPageScreen()
}