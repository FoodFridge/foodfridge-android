package com.example.foodfridge.common

data class Category(val id: Int, val name: String)
data class Ingredient(val ingredient_id: Int, val ingredient_name: String)
object PantryCategory {
//    val pantryCategory = arrayOf("Carb", "Vegetable", "Meat", "Fruit", "Dairy", "Seasoning", "Seafood", "Pantry");
    val pantryCategory = listOf(
        Category(1, "My pantry"),
        Category(2, "Meat"),
        Category(3, "Seafood"),
        Category(4, "Dairy and Alternatives"),
        Category(5, "Paste and Sauces"),
        Category(6, "Cereals and Pulses"),
        Category(7, "Carbohydrate"),
        Category(8, "Vegetable"),
        Category(9, "Fruit"),
        Category(10, "Spices and Seasonings"),
        Category(11, "Sugar and Sugar Products"),
        Category(12, "Other Ingredients")
    )
}

object PantryIngredient {
    val pantryIngredient = listOf(
        Ingredient(2, "Chicken"),
        Ingredient(2, "Beef"),
        Ingredient(2, "Lamb"),
        Ingredient( 2, "Pork"),
        Ingredient( 3, "Salmon"),
        Ingredient( 3, "Chilean Bass"),
        Ingredient(3, "Shrimp"),
        Ingredient( 4, "Yogurt"),
        Ingredient( 5, "Soy sauce"),
        Ingredient( 6, "nuts"),
        Ingredient( 7, "rice"),
        Ingredient( 8, "Lettus"),
        Ingredient( 8, "onion"),
        Ingredient( 9, "apple"),
        Ingredient( 10, "cinnamon"),
        Ingredient( 11, "sugar"),
        Ingredient( 12, "miso"),
    )
}