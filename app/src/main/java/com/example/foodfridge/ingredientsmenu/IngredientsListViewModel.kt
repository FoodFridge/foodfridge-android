package com.example.foodfridge.ingredientsmenu

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.foodfridge.common.PantryIngredient
import com.example.foodfridge.common.Ingredient

class IngredientsListViewModel: ViewModel() {
    private val _selectedChips = MutableLiveData<List<Ingredient>>()
    val selectedChips: MutableLiveData<List<Ingredient>> get() = _selectedChips

    fun addSelectedChip(chipValue: Ingredient){
        val currentChips = _selectedChips.value.orEmpty().toMutableList()
        currentChips.add(chipValue)
        _selectedChips.value = currentChips
    }

    fun deleteSelectedChip(chipValue: Ingredient){

    }

    var isDialogShown by mutableStateOf(false)
        private set

    fun onOpenDialog(){
        isDialogShown = true
    }

    fun onDismissDialog(){
        isDialogShown = false
    }
}