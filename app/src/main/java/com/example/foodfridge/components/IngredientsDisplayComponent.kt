package com.example.foodfridge.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.foodfridge.ui.theme.courierFontFamily

@Composable
fun IngredientsDisplayComponent() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .defaultMinSize(minHeight = 180.dp)
            .padding(2.dp)
            .clip(MaterialTheme.shapes.medium.copy(all = CornerSize(9.dp)))
        ,
        color = Color.Black
    ) {
        Box {
            Button(
                onClick = {
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(242, 195, 65),
                    contentColor = Color.Black),
                modifier = Modifier.size(width = 180.dp, height = 30.dp).offset(y = 125.dp, x = 110.dp)
            ){
                NormalTextBold(
                    value = "Generate Recipe",
                    fontSize = 12,
                    modifier = Modifier
                )
            }

        }

    }
}


