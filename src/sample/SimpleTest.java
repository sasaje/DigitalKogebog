package sample;/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/12/2020
 *
 */

import java.util.ArrayList;

public class SimpleTest{

    public static void main(String[] args) {
        System.out.println("Welcome to 'The Kogebog' your digital recipes.");

        //declare the Recipe objects
        Recipe glasurRecipe = new Recipe();
        glasurRecipe.setName("GlasurOpskrift");
        glasurRecipe.setInstructions("This is how you do it.");
        glasurRecipe.setNumberOfPortions(2);
//        CookingTime glasurCookingTime = new CookingTime(0,20);
        glasurRecipe.setCookingTime("20 minutter");

        ArrayList<Ingredient> glasurIngredientsList = new ArrayList<>();
        Ingredient glasurIngredientsSugar = new Ingredient("Vand", 3);
        Ingredient glasurIngredientsWater = new Ingredient("Flormelis", 100);
        glasurIngredientsList.add(glasurIngredientsSugar); //adds the ingredient to the glasurIngredientsList
        glasurIngredientsList.add(glasurIngredientsWater); //adds the ingredient to the glasurIngredientsList
        ArrayList<Ingredient> glasurList = new ArrayList<>();
        //add ingredients to list
        glasurList.add(glasurIngredientsSugar);
        glasurList.add(glasurIngredientsWater);
        glasurRecipe.setIngredientsList(glasurList);

        ArrayList<Ingredient> teIngredientsList = new ArrayList<>();
        Ingredient teIngredientsSugar = new Ingredient("Vand", 0);
        Ingredient teIngredientsWater = new Ingredient("Tebrev", 5);
        Ingredient teIngredientsMelis = new Ingredient("Flormelis", 200);
        teIngredientsList.add(glasurIngredientsSugar); //adds the ingredient to the glasurIngredientsList
        teIngredientsList.add(glasurIngredientsWater); //adds the ingredient to the glasurIngredientsList
        ArrayList<Ingredient> teList = new ArrayList<>();
        //add ingredients to list
        teList.add(glasurIngredientsSugar);
        teList.add(glasurIngredientsWater);
        glasurRecipe.setIngredientsList(teList);

        //display data using arrayList
        for(Ingredient ingredient : teList){
            System.out.println("IngredientName: " + ingredient.name);
            System.out.println("IngredientCalories: " + ingredient.calories);
            System.out.println("-------------------");
        }

        System.out.println("name: " + glasurRecipe.getName() + " "
                + ", name: " + glasurRecipe.getInstructions() + " "
                + ", numberofportions: " + glasurRecipe.getNumberOfPortions() + " "
                + ", cookingTime: " +glasurRecipe.getCookingTime() + " "
                + ", ingrediens: " + glasurRecipe.getIngredientsList().toString());

    }

    public void blankLine(){
        System.out.println("\n");
    }
}
