/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/12/2020
 *
 */

package sample;

import java.util.ArrayList;

import static sample.SimpleTest.blankLine;

public class Recipe implements CalorieCalculator {
    private String name; //navn
    private String instructions; //fremgangsmåde
    private int numberOfPortions; // antalPortioner
//    private CookingTime cookingTime; //tilberedningstid <- to declare both a hour an minutes - not working yet
    private String cookingTime; //tilberedningstid
    private ArrayList<Ingredient> ingredientsList = new ArrayList<>(); //ingredienser

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getNumberOfPortions() {
        return numberOfPortions;
    }

    public void setNumberOfPortions(int numberOfPortions) {
        this.numberOfPortions = numberOfPortions;
    }

    public String getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(String cookingTime) {
        this.cookingTime = cookingTime;
    }

    public ArrayList<Ingredient> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(ArrayList<Ingredient> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }

    //Constructors
    public Recipe(){
        //empty constructor
    }

    public Recipe(String name, String instructions, int numberOfPortions, String cookingTime) {
        this.name = name;
        this.instructions = instructions;
        this.numberOfPortions = numberOfPortions;
        this.cookingTime = cookingTime;
        System.out.println("Recipe added: " + name);
    }
    public Recipe(String name, String instructions, int numberOfPortions, String cookingTime, ArrayList<Ingredient> ingredientsList) {
        this.name = name;
        this.instructions = instructions;
        this.numberOfPortions = numberOfPortions;
        this.cookingTime = cookingTime;
        this.ingredientsList = ingredientsList;
        System.out.println("Recipe added: " + name);
    }

    //not working
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ArrayList").append(this.ingredientsList).append("\n");
        return sb.toString();
    }

    public int numberOfIngrediens(){
        // This will print the size of the stock list
        int numberOfingrediens = ingredientsList.size();
        return numberOfingrediens;
    }

    //addIngredients method
    public void addIngrediens(Ingredient ingredient){

    }

    //addIngredients method
    public void addIngredients(String name, int calories){
        ingredientsList.add(new Ingredient(name, calories));

//        System.out.println("Now the IngredientList looks like this: ");
//        System.out.println(ingredientsList.toString()); //TODO toString() still not working
    }

    public void showIngrediens(){
        System.out.println("Ingredients you need to make " + name + ":");
        for(int i = 0; i < ingredientsList.size(); i++){
            int x=i+1;
            System.out.println("Ingredient(" + x + "): " + ingredientsList.get(i));
        }
    }

    //show instructions
    public void showInstructions(){
        System.out.println("The instructions for making " + name + ":");
        String currentInstructions = this.getInstructions();
        System.out.println("- " + currentInstructions);
    }

    //showRecipe instructions and ingredient together.
    public void showRecipe(){
        showIngrediens();
        blankLine(); //imported from SampleTest
        showInstructions();
    }

    //Go through a loop for all the ingredients and sum up the total calories in the recipe.
    //en løkke gennemløbe alle ingredienser, og lægge deres kalorier sammen og returnere det
    @Override
    public int caloriesTotal() {

        System.out.println("***************************");
        System.out.println("*    CALORIES IN RECIPE   *");
        System.out.println("***************************");

        int totalCalories = 0;

        for(Ingredient ingredient : ingredientsList){
            int currentCaloriesTotal = 0;
            int currentCaloriesOnItem = ingredient.getCalories();
            String currentIngredient = ingredient.getName();
            System.out.println("Calories in " + currentIngredient + " : "  + currentCaloriesOnItem);

            totalCalories += currentCaloriesOnItem;
        }
        return totalCalories;
    }
}
