package sample;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @org.junit.jupiter.api.Test
    void caloriesTotal() {
        Recipe recipeTest1 = new Recipe("recipe1", "instructions" , 1, "1time");

        ArrayList<Ingredient> ingredientArrayList = new ArrayList<>(); //reuse for all ingredient declarations
        recipeTest1.addIngredients("Sugar", 100);
        assertEquals(100, recipeTest1.caloriesTotal());
    }

    @org.junit.jupiter.api.Test
    void caloriesPerPortion() {
        Recipe recipeTest1 = new Recipe("recipe1", "instructions" , 2, "1time");

        ArrayList<Ingredient> ingredientArrayList = new ArrayList<>(); //reuse for all ingredient declarations
        recipeTest1.addIngredients("Sugar", 100);
        assertEquals(50, recipeTest1.caloriesPerPortion());
    }
}