package com.example.foodfridge.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodfridge.R
import com.example.foodfridge.components.IngredientsDisplayComponent
import com.example.foodfridge.components.NormalText
import com.example.foodfridge.components.NormalTextBold
import com.example.foodfridge.components.PantryCategoryComponent
import com.example.foodfridge.ui.theme.courierFontFamily

@Composable
fun LandingPageScreen(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            NormalTextBold(
                value = "Let\'s cook something from your fridge!",
                fontSize = 30,
                modifier = Modifier.padding(start = 10.dp, top = 10.dp, end = 10.dp)
            )

            NormalTextBold(
                value = "Select items from categories below",
                fontSize = 11,
                modifier = Modifier.padding(start = 10.dp).fillMaxWidth(),
            )

            IngredientsDisplayComponent()
            Image(
                painter = painterResource(id = R.drawable.chef),
                contentDescription = stringResource(id = R.string.chef_image),
                modifier = Modifier.size(230.dp)
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