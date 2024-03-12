package com.example.foodfridge.ingredientsmenu


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.foodfridge.common.NormalTextBold
import com.example.foodfridge.common.PantryIngredient
import com.example.foodfridge.ingredientsmenu.IngredientsListViewModel

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
        val ingredientsListViewModel: IngredientsListViewModel = viewModel()
        val ingredients = PantryIngredient.pantryIngredient
        Card(
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                        .fillMaxWidth(0.95f)
        ){
            Box {
                Button(
                    onClick = {ingredientsListViewModel.onDismissDialog()},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(255, 176, 0),
                        contentColor = Color.Black
                    ),
                    modifier = Modifier
                        .size(width = 35.dp, height = 35.dp)
                        .offset(y = 9.dp, x = 330.dp)
                        .defaultMinSize(minWidth = 0.5.dp, minHeight = 0.5.dp)
                    ,
                    contentPadding = PaddingValues(0.dp),
                    shape = RoundedCornerShape(25.dp),
                ){
                    NormalTextBold(
                        value = "x",
                        fontSize = 30,
                        modifier = Modifier.padding(0.dp)
                    )
                }
            }
            FlowRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
            ){
                for (ingredient in ingredients){
                    SuggestionChip(
                        onClick = {
                            ingredientsListViewModel.addSelectedChip(ingredient)},
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