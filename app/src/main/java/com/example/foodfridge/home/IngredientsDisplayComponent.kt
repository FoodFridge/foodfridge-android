package com.example.foodfridge.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.foodfridge.common.NormalTextBold
import com.example.foodfridge.ingredientsmenu.IngredientsListViewModel

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun IngredientsDisplayComponent() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .defaultMinSize(minHeight = 180.dp)
            .padding(1.dp)
            .clip(MaterialTheme.shapes.medium.copy(all = CornerSize(9.dp)))
        ,
        color = Color.Black
    ) {
        val ingredientsListViewModel: IngredientsListViewModel = viewModel()
        val selectedChips by ingredientsListViewModel.selectedChips.observeAsState()

        FlowRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        ){
            if(!selectedChips.isNullOrEmpty()){
                for (chip in selectedChips!!){
                    SuggestionChip(
                        onClick = {ingredientsListViewModel.deleteSelectedChip(chip)},
                        label = { Text(chip.ingredient_name) }
                    )
                }
            } else {
                // No action is needed when selectedChips are null or empty
            }
        }

        Box {
            Button(
                onClick = {
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(255, 176, 0),
                    contentColor = Color.Black),
                modifier = Modifier
                    .size(width = 155.dp, height = 28.dp)
                    .offset(y = 125.dp, x = 120.dp),
                shape = RoundedCornerShape(6.dp),

            ){
                NormalTextBold(
                    value = "Generate Recipe",
                    fontSize = 11,
                    modifier = Modifier.padding(0.dp)
                )
            }

        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfIngredientsDisplayComponent(){
    IngredientsDisplayComponent()
}


