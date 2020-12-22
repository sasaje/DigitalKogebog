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

    public IngredientNutritionContent(String name, int cVitamin, int magnesium, int kalk) {
        super(name, cVitamin, magnesium, kalk);
        this.cVitamin = cVitamin;
        this.magnesium = magnesium;
        this.kalk = kalk;

        System.out.println("IngredientNutritionContent added: " + name);
    }

    public boolean goodAgainstColds() {
        boolean result;

        if(cVitamin>5) {
            result = true;
            System.out.println(name + " is good against colds.");
        }else{
            result = false;
            System.out.println(name + " is not good against colds.");
        }
        return result;
    }
}
