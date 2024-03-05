package com.example.foodfridge.ingredientsmenu


import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.foodfridge.common.PantryIngredient

@OptIn(ExperimentalLayoutApi::class, ExperimentalMaterial3Api::class)
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
            FlowRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
            ){

                for (ingredient in ingredients){
                    // NormalTextBold(value = ingredient.ingredient_name, fontSize = 13, modifier = Modifier)
                    SuggestionChip(
                        onClick = {},
                        label = { Text(ingredient.ingredient_name)}
                    )
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