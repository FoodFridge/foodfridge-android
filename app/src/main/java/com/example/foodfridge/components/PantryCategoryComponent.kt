package com.example.foodfridge.components
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodfridge.R

@Composable
fun PantryCategoryComponent(){
    Surface {
        val pantryCategory = arrayOf("Carb", "Vegitable","Meat","Fruit","Dairy","Seasoning","Seafood","Pantry")
        val imageModifier = Modifier.size(20.dp)

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
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.dairy),
                                contentDescription = stringResource(id = R.string.dairy_image),
                                contentScale = ContentScale.Fit,
                                modifier = imageModifier
                            )
                            Text(text = pantryCategory[index])
                        }
                    }
            }
        }


    }
}