package com.example.foodfridge.ingredientsmenu

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class IngredientsListViewModel: ViewModel() {
    var isDialogShown by mutableStateOf(false)
        private set

    fun onOpenDialog(){
        isDialogShown = true
    }

    fun onDismissDialog(){
        isDialogShown = false
    }
}