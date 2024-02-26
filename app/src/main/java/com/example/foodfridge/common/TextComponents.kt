package com.example.foodfridge.common

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.foodfridge.ui.theme.courierFontFamily

@Composable
fun NormalText(value: String, fontSize: Int, modifier: Modifier = Modifier){
    Text(
        text = value,
        modifier = modifier,
        style = TextStyle(
            fontSize = fontSize.sp,
            fontFamily = courierFontFamily,
            )
    )
}
@Composable
fun NormalTextBold(value: String, fontSize: Int, modifier: Modifier){
    Text(
        text = value,
        modifier = modifier,
        style = TextStyle(
            fontSize = fontSize.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = courierFontFamily,

        )
    )
}

