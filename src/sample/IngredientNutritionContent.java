/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/12/2020
 *
 */

package sample;

public class IngredientNutritionContent extends Ingredient{
    int cVitamin;
    int magnesium;
    int kalk;

    public IngredientNutritionContent(String name, double calories) {
        super(name, calories);
    }

    public IngredientNutritionContent(String name, int cVitamin, int magnesium, int kalk) {
        super(name, cVitamin, magnesium, kalk);
    }

    public void goodAgainstColds() {
        if(cVitamin>5) {
            System.out.println(name + " is good against colds.");
        }else{
            System.out.println(name + " is not good against colds.");
        }
    }
}
