package sample;/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/12/2020
 *
 */

import java.util.ArrayList;

public class SimpleTest {

    public static void main(String[] args) {
        System.out.println("Welcome to 'The Kogebog' your digital recipes.");

        blankLine();

        //declare the Recipe objects
        Recipe glasurRecipe = new Recipe();
        glasurRecipe.setName("GlasurOpskrift");
        glasurRecipe.setInstructions("This is how you do it.");
        glasurRecipe.setNumberOfPortions(2);
//        CookingTime glasurCookingTime = new CookingTime(0,20);
        glasurRecipe.setCookingTime("20 minutter");

        ArrayList<Ingredient> glasurList = new ArrayList<>();
        Ingredient glasurIngredientsSugar = new Ingredient("Vand", 3);
        Ingredient glasurIngredientsWater = new Ingredient("Flormelis", 100);
        //add ingredients to list
        glasurList.add(glasurIngredientsSugar);
        glasurList.add(glasurIngredientsWater);
        glasurRecipe.setIngredientsList(glasurList);

        System.out.println("name: " + glasurRecipe.getName() + " "
                + ", instructions: " + glasurRecipe.getInstructions() + " "
                + ", numberofportions: " + glasurRecipe.getNumberOfPortions() + " "
                + ", cookingTime: " + glasurRecipe.getCookingTime() + " "
                + ", ingrediens: " + glasurRecipe.getIngredientsList().toString());

        //declare the Recipe objects
        Recipe teRecipe = new Recipe();
        teRecipe.setName("TeOpskrift");
        teRecipe.setInstructions("This is how you do it.");
        teRecipe.setNumberOfPortions(2);
        teRecipe.setCookingTime("15 minutter");

        ArrayList<Ingredient> teList = new ArrayList<>();
        Ingredient teIngredientsSugar = new Ingredient("Vand", 0);
        Ingredient teIngredientsWater = new Ingredient("Tebrev", 5);
        Ingredient teIngredientsMelis = new Ingredient("Flormelis", 200);
        //add ingredients to list
        teList.add(teIngredientsSugar);
        teList.add(teIngredientsWater);
        teList.add(teIngredientsMelis);
        teRecipe.setIngredientsList(teList);

        //display data using arrayList
        for (Ingredient ingredient : teList) {
            System.out.println("Ingredient: " + ingredient.name + " (Calories: " + ingredient.calories + ")");
        }

        System.out.println("-------------------");

        System.out.println("THIS" + teList.toString());

        System.out.println("name: " + teRecipe.getName() + " "
                + ", name: " + teRecipe.getInstructions() + " "
                + ", numberofportions: " + teRecipe.getNumberOfPortions() + " "
                + ", cookingTime: " + teRecipe.getCookingTime() + " "
                + ", ingrediens: " + teRecipe.getIngredientsList().toString());
    }

    public static void blankLine(){
        System.out.println(" ");
    }
}
