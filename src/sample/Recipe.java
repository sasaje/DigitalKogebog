/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/12/2020
 *
 */

package sample;

import java.util.ArrayList;
import java.util.Arrays;

import static sample.SimpleTest.blankLine;

//EXAMPLE VARIABLES, INTERFACE IMPLEMENTATION
public class Recipe implements CalorieCalculator {
    private String name; //navn
    private String instructions; //fremgangsmåde
    private int numberOfPortions; // antalPortioner
//    private CookingTime cookingTime; //tilberedningstid <- to declare both a hour an minutes - not working yet
    private String cookingTime; //tilberedningstid
    private ArrayList<Ingredient> ingredientsList = new ArrayList<>(); //ingredienser

    //EXAMPLE GETTERS AND SETTERS
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

    //EXAMPLE ARRAYLIST
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

//EXAMPLE CONSTRUCTORS
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

    public int numberOfIngrediens(){
        // This will print the size of the stock list
        int numberOfingrediens = ingredientsList.size();
        return numberOfingrediens;
    }

    //addIngredients method
    public void addIngrediens(Ingredient ingredient){
        //what to do here?
    }

//EXAMPLE ADD INGREDIENTS TO ARRAYLIST
    //addIngredients method
    public void addIngredients(String name, int calories){

        ingredientsList.add(new Ingredient(name, calories));

        //removes the [] from the arrayList output
/*        String asString = this.getIngredientsList().toString().replaceAll("^\\[", "").replaceAll("\\]$", "").replace(",", "");
        System.out.println("Current ingredientList: " + asString); //toString() not working
        System.out.println(asString);*/
    }

//EXAMPLE DISPLAY ARRAYLIST ITEMS
    public void showIngredients(){
        System.out.println("Ingredients you need to make " + name + ":");
 /*       for(int i = 0; i < ingredientsList.size(); i++){
            int x=i+1;
            System.out.println("Ingredient(" + x + "): " + ingredientsList.get(i));
        }
*/
        //afterwards line 114-117 are replaced by this following 120-122 these are the only changes, which solved the big ingredientList toString() issue!
        for(Ingredient element : ingredientsList){
            System.out.println("*" + element.getName());
        }
    }

    //GUI method only - shows the ingredients in GUI
    public void showIngredientsGUI(){
        ingredientsList.forEach(System.out::println); // changed after showIngredient was changed
    }

    //show instructions
    public void showInstructions(){
        System.out.println("The instructions for making " + name + ":");
        String currentInstructions = this.getInstructions();
        System.out.println("- " + currentInstructions);
    }

    // GUI method only - show instructions in GUI
    public String showInstructionsGUI(){
        String currentInstructions = this.getInstructions();
        return currentInstructions;
    }

//EXAMPLE EXTRACT METHODS TO ANOTHER METHOD
    //showRecipe instructions and ingredient together.
    public void showRecipe(){
        showIngredients();
        blankLine(); //imported from SampleTest
        showInstructions();
    }

//EXAMPLE METHODS FROM INTERFACE IMPLEMENTATION
    //Go through a loop for all the ingredients and sum up the total calories in the recipe.
    @Override
    public int caloriesTotal() {
        System.out.println("***************************");
        System.out.println("*    CALORIES IN RECIPE   *");
        System.out.println("***************************");

        int totalCalories = 0;

//EXAMPLE FOR-EACH LOOP
        for(Ingredient ingredient : ingredientsList){
            int currentCaloriesTotal = 0;
            int currentCaloriesOnItem = ingredient.getCalories();
            String currentIngredient = ingredient.getName();
            System.out.println("Calories in " + currentIngredient + " : "  + currentCaloriesOnItem);

            totalCalories += currentCaloriesOnItem;
        }
        return totalCalories;
    }

//EXAMPLE EXCEPTION TRY-CATCH
    public int caloriesPerPortion(){
        int result = 0;

        try{
            result = caloriesTotal()/numberOfPortions;
            if(result==0){
                System.out.println(result);
                System.out.println(name + "can't have 0 portions!");
            }
        }
        catch(Exception e){
            System.out.println("EXCEPTION ERROR : " + name + " can't have 0 portions!");
        }

        return result;
    }
}
