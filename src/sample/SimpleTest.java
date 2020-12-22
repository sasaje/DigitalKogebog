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
        Recipe glasurRecipe = new Recipe("GlasurOpskrift", "This is how you do it.", 2, "20 minutes");

        ArrayList<Ingredient> glasurList = new ArrayList<>();
        Ingredient glasurIngredientsSugar = new Ingredient("Vand", 3);
        Ingredient glasurIngredientsWater = new Ingredient("Flormelis", 100);
        //add ingredients to list
/*        glasurList.add(glasurIngredientsSugar);
        glasurList.add(glasurIngredientsWater);*/

/*        glasurRecipe.addIngredients(new Ingredient("Flormelis", 100));
        glasurRecipe.addIngredients("Water", 0);
*/
        glasurRecipe.addIngredients("Navn" , 22);
        glasurRecipe.setIngredientsList(glasurList);

        //display data using arrayList
        glasurRecipe.showIngrediens(glasurList);
        glasurRecipe.numberOfIngrediens();

        blankLine();

        //declare the Recipe objects
        Recipe teRecipe = new Recipe("TeOpskrift", "This is how you do it.", 1, "15 minutes");

        ArrayList<Ingredient> teList = new ArrayList<>();
        Ingredient teIngredientsSugar = new Ingredient("Vand", 0);
        Ingredient teIngredientsWater = new Ingredient("Tebrev", 5);
        Ingredient teIngredientsMelis = new Ingredient("Flormelis", 200);
        //add ingredients to list
/*        teList.add(teIngredientsSugar);
        teList.add(teIngredientsWater);
        teList.add(teIngredientsMelis);
        */

        teRecipe.addIngredients("sugar", 100);
        teRecipe.addIngredients("Water", 0);
        teRecipe.addIngredients("Citron", 5);

        teRecipe.setIngredientsList(teList);


        //display data from arrayList
        for (Ingredient ingredient : teList) {
            System.out.println("Ingredient: " + ingredient.name + " (Calories: " + ingredient.calories + ")");
        }
    }
    public static void blankLine(){
        System.out.println(" ");
    }
}
