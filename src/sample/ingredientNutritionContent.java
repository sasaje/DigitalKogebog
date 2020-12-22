/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/12/2020
 *
 */

package sample;

public class ingredientNutritionContent extends Ingredient{
    int cVitamin;
    int magnesium;
    int kalk;

    public ingredientNutritionContent(String name, double calories) {
        super(name, calories);
    }

    public boolean goodAgainstColds(String name, int cVitamin, int magnesium, int kalk) {
        boolean result;
        if(cVitamin>5) {
            System.out.println(name + " is good against colds.");
            result = true;
        }else{
            System.out.println(name + " is not good against colds.");
            result = false;
        }
        return result;
    }
}
