package com.example.foodfridge.ingredientsmenu

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.foodfridge.common.NormalTextBold
import com.example.foodfridge.common.PantryCategory
import com.example.foodfridge.common.PantryIngredient

@Composable
fun IngredientsListDialog(
    onDismiss: ()->Unit,
    onConfirm: ()->Unit
){
    Dialog(
        onDismissRequest = {
            onDismiss()
        },
        properties = DialogProperties(
            usePlatformDefaultWidth = false
        )
    ){
        val ingredients = PantryIngredient.pantryIngredient
        Card(
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                        .fillMaxWidth(0.95f)
        ){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                verticalArrangement = Arrangement.spacedBy(25.dp)
            ) {
                LazyRow{
                    items(ingredients.size){index ->
                        NormalTextBold(value = ingredients[index].ingredient_name, fontSize = 13, modifier = Modifier)
                    }
                }

            }
        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfIngredientsListDialog(){
    IngredientsListDialog(onDismiss = { /*TODO*/ },
        onConfirm = {})
}