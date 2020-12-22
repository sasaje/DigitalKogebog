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
        Recipe glasurRecipe = new Recipe("GlasurOpskrift", "This is how you make glasur.", 2, "20 minutes");

        ArrayList<Ingredient> ingredientArrayList = new ArrayList<>(); //reuse for all ingredient declarations
        glasurRecipe.addIngredients("Powdered sugar", 100);
        glasurRecipe.addIngredients("Water", 0);

        blankLine();
    /*    glasurRecipe.showIngrediens();
        blankLine();
        glasurRecipe.showInstructions();
        blankLine();*/

        glasurRecipe.showRecipe();

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

    Ingredient citron = new Ingredient("Citron", 5);
    citron.richOnCaloeries();

    Ingredient ryeBread = new Ingredient("Rye Bread", 100);
    ryeBread.richOnCaloeries();

    Ingredient chocolate = new Ingredient("Chocolate", 105);
    chocolate.richOnCaloeries();

    Ingredient citron2 = new Ingredient("Citron", 22, 2, 2);
    citron2.goodAgainstColds();

    Ingredient pølse = new Ingredient("Pølse", 0,22,43);
    pølse.goodAgainstColds();


    }
    public static void blankLine(){
        System.out.println(" ");
    }
}
