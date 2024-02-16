package com.example.foodfridge.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color

@Composable
fun PantryCategoryComponent(){
    Surface {
        val pantryCategory = arrayOf("Carb", "Vegitable","Meat","Fruit","Dairy","Seasoning","Seafood","Pantry")
        val customGreenColor = Color(0xFF00FF11)

        LazyVerticalGrid(columns = GridCells.Fixed(2)){
            items(pantryCategory.size){
                index ->
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(10, 54, 10),
                            contentColor =  Color(242, 195, 65)
                        ),
                    ){

                        Text(text = pantryCategory[index])
                    }
            }
        }


    }
}