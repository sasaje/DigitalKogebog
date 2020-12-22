/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/12/2020
 *
 */

package sample;

public class Ingredient implements CalorieCalculator {
    String name; //navn
    int calories; //kalorier
    Diet diet; //Diet

    public Ingredient(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setIngredient(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public Ingredient(String name, int calories) {
        this.name = name;
        this.calories = calories;

        System.out.println("Ingredient added: " + name);
    }

    public Ingredient(String name, int cVitamin, int magnesium, int kalk) {
        this.name = name;
    }

//EXAMPLE FOR-LOOP
    public boolean richOnCaloeries(){
        boolean result;
        if(getCalories()>=100) {
            System.out.println(name + " is rich on calories.");
            result = true;
        }else{
            System.out.println(name + " is not rich on calories.");
            result = false;
        }
        return result;
    }

//EXAMPLE METHODS FROM INTERFACE IMPLEMENTATION
    //Return calories in the ingredient
    @Override
    public int caloriesTotal() {
        return calories;
    }
}
