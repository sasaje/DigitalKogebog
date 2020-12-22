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

        ArrayList<Ingredient> ingredientsList = new ArrayList<>();
        Ingredient glasurIngredientsSugar = new Ingredient();
        glasurIngredientsSugar.setName("Sugar");
        glasurIngredientsSugar.setCalories(100);
        Ingredient glasurIngredientsWater = new Ingredient();
        glasurIngredientsWater.setName("water");
        glasurIngredientsWater.setCalories(0);

        ingredientsList.add(glasurIngredientsSugar);
        ingredientsList.add(glasurIngredientsWater);

        System.out.println("name: " + glasurRecipe.getName() + " "
                + ", name: " + glasurRecipe.getInstructions() + " "
                + ", numberofportions: " + glasurRecipe.getNumberOfPortions() + " "
                + ", cookingTime: " +glasurRecipe.getCookingTime() + " "
                + ", ingrediens: " + ingredientsList.toString());

        for(int i=0; i < ingredientsList.size(); i++){
            System.out.println(ingredientsList.get(i).getClass().getSimpleName().toString()); //TODO prints ingrediens right format
        }

        //declare the teRecipe objects
        Recipe teRecipe = new Recipe();
        teRecipe.setName("TeOpskrift");
        teRecipe.setInstructions("This is how you do it.");
        teRecipe.setNumberOfPortions(1);
        teRecipe.setCookingTime("15 minutter");

        ArrayList<Ingredient> ingredientsList = new ArrayList<>();
        Ingredient teIngredientsSugar = new Ingredient();
        teIngredientsSugar.setName("Sugar");
        teIngredientsSugar.setCalories(100);
        Ingredient teIngredientsTea = new Ingredient();
        teIngredientsTea.setName("Te-brev");
        teIngredientsTea.setCalories(14);
        Ingredient teIngredientsWater = new Ingredient();
        teIngredientsWater.setName("water");
        teIngredientsWater.setCalories(0);

        ingredientsList.add(teIngredientsSugar);
        ingredientsList.add(teIngredientsTea);
        ingredientsList.add(teIngredientsWater);

        System.out.println("name: " + glasurRecipe.getName() + " "
                + ", name: " + glasurRecipe.getInstructions() + " "
                + ", numberofportions: " + glasurRecipe.getNumberOfPortions() + " "
                + ", cookingTime: " +glasurRecipe.getCookingTime() + " "
                + ", ingrediens: " + ingredientsList.toString());

        for(int i=0; i < ingredientsList.size(); i++){
            System.out.println(ingredientsList.get(i).getClass().getSimpleName().toString()); //TODO prints ingrediens right format
        }
    }

    public void blankLine(){
        System.out.println("\n");
    }
}
