/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/12/2020
 *
 */

package sample;

public class Ingredient {
    String name; //navn
    double calories; //kalorier

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void setIngredient(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }

    public Ingredient(String name, double calories) {
        this.name = name;
        this.calories = calories;

        System.out.println("Ingredient " + name + " added.");
    }
}
