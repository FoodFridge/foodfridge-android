package com.example.foodfridge.home
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodfridge.R
import com.example.foodfridge.common.NormalTextBold

@Composable
fun PantryCategoryComponent(){
    Surface {
        val pantryCategory = arrayOf("Carb", "Vegitable","Meat","Fruit","Dairy","Seasoning","Seafood","Pantry")

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.padding(start = 10.dp, end = 10.dp)
        ) {
            items(pantryCategory.size) { index ->
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0, 66, 37),
                        contentColor = Color(255, 207, 157)
                    ),
                    modifier = Modifier.padding(start = 1.dp, end = 1.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.dairy),
                            contentDescription = stringResource(id = R.string.dairy_image),
                            modifier = Modifier
                                .size(20.dp)
                        )
                        Spacer(Modifier.weight(1f))
                        NormalTextBold(value = pantryCategory[index], fontSize = 13, modifier = Modifier)
                        Spacer(Modifier.weight(1f))
                    }
                }
            }
        }
    }
}