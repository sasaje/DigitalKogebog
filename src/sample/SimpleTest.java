/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/12/2020
 *
 */
package sample;

import java.util.ArrayList;

public class SimpleTest {

    public static void main(String[] args) {

        System.out.println("*************************************************");
        System.out.println("* Welcome to 'The Kogebog' your digital recipes *");
        System.out.println("*************************************************");

        blankLine(); //creates new blank line

        //declare the Recipe objects
        Recipe glasurRecipe = new Recipe("GlasurOpskrift", "This is how you make glasur.", 2, "20 minutes");

        glasurRecipe.addIngredients("Powdered sugar", 100); //adds ingredients to arrayList
        glasurRecipe.addIngredients("Water", 0);

        blankLine();
    /*    glasurRecipe.showIngrediens();
        blankLine();
        glasurRecipe.showInstructions();
        blankLine();*/

        glasurRecipe.showRecipe(); //show recipe, both the showIngrediens() and showInstructions() all together

        blankLine();
        System.out.println("/***********/");
        blankLine();

        //declare the Recipe objects
        Recipe teRecipe = new Recipe("TeOpskrift", "This is how you make tea.", 1, "15 minutes");

        teRecipe.addIngredients("Sugar", 100);
        teRecipe.addIngredients("Citron", 7);
        teRecipe.addIngredients("Water", 0);
        teRecipe.addIngredients("Tea Bag", 4);

        blankLine();
    /*    teRecipe.showIngrediens();
        blankLine();
        teRecipe.showInstructions();
        blankLine();*/

        teRecipe.showRecipe();

        blankLine();

        //objects to check methods
        Ingredient citron = new Ingredient("Citron", 5); //creates new Ingredient
        citron.richOnCaloeries(); //tells if the ingredient is rich on calories
        blankLine();
        Ingredient ryeBread = new Ingredient("Rye Bread", 100);
        ryeBread.richOnCaloeries();
        blankLine();
        Ingredient chocolate = new Ingredient("Chocolate", 105);
        chocolate.richOnCaloeries();
        blankLine();
        IngredientNutritionContent citron2 = new IngredientNutritionContent("Citron", 55, 2, 2);
        citron2.goodAgainstColds(); //tells if the IngredientNutritionContent object is goodAgainstColds
        blankLine();
        IngredientNutritionContent pølse = new IngredientNutritionContent("Pølse", 0,22,43);
        pølse.goodAgainstColds();

        Recipe burger = new Recipe(); //creates new recipe
        burger.addIngredients("salat", 2); //add ingredients to arrayList for this recipe
        burger.addIngredients("cheese", 52);
        burger.addIngredients("tomato", 7);
        burger.addIngredients("beef", 123);
        burger.addIngredients("mayonaise", 243);
        burger.addIngredients("bun", 321);

        blankLine();
        System.out.println("The total calories in a burger is: " + burger.caloriesTotal()); //get the total amount of calorie in the recipe

        blankLine();
        Recipe water = new Recipe();
        water.addIngredients("water",0);
        System.out.println("The total calories in a water is: " + water.caloriesTotal());

//EXAMPLE EXCEPTION
        blankLine();
        System.out.println("******** CALORIES PER PORTION **********");
        blankLine();
        Recipe lemonWater = new Recipe("lemonWater", "instructions here", 0 , "0 minutter");
        lemonWater.addIngredients("Lemon Water",5);
        lemonWater.caloriesPerPortion(); //get the calories per portion of the recipe, this throws an exception
    }
    public static void blankLine(){
        System.out.println(" ");
    }
}
