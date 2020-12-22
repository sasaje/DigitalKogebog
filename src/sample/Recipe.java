/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/12/2020
 *
 */

package sample;

import java.util.ArrayList;

public class Recipe {
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
        return ingredientsList.add(ingredient);
    }
    //addIngredients method
    public void addIngredients(String name, int calories){
        ingredientsList.add(new Ingredient(name, calories));
        for (Ingredient ingredient : ingredientsList) {
            ingredientsList.add(new Ingredient(name, calories));

            System.out.println("For every item in the list this is added");
        }
    }

    public void showIngrediens(ArrayList<Ingredient> ingredientsList){
        for (Ingredient ingredient : ingredientsList) {
//            System.out.println("Ingredient: " + ingredient.name + " (Calories: " + ingredient.calories + ")");
        }

        for(int i = 0; i < ingredientsList.size(); i++){
            int x=i+1;
            System.out.println("Ingredient(" + x + "): " + ingredientsList.get(i).getClass().getSimpleName());
        }
    }
}
