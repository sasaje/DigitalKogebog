/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/12/2020
 *
 */

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Controller {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Tab inspirationGalleryTab;

    @FXML
    private Button showRecipeButton;

    @FXML
    private TextField recipeNameTextField;

    @FXML
    private Label chosen;

    @FXML
    private TextArea ingredientsTextArea;

    @FXML
    private TextArea instructionsTextArea;

    @FXML
    void showRecipe(ActionEvent event) {
        Recipe glasurRecipe = new Recipe("GlasurOpskrift", "This is how you make glasur.", 2, "20 minutes");

        ArrayList<Ingredient> ingredientArrayList = new ArrayList<>(); //an arrayList for the ingredients - reuse for all ingredient declarations to the recipes
        glasurRecipe.addIngredients("Powdered sugar", 100); //adds ingredients to arrayList
        glasurRecipe.addIngredients("Water", 0);

        //prevents duplicates content when clicking button again
        if (recipeNameTextField.getText() == null || recipeNameTextField.getText().trim().isEmpty()) {
            recipeNameTextField.appendText(glasurRecipe.getName());
        }

        glasurRecipe.showInstructionsGUI();
        glasurRecipe.showIngrediens();

        //prevents duplicates content when clicking button again
        if (ingredientsTextArea.getText() == null || ingredientsTextArea.getText().trim().isEmpty()) {
            ingredientsTextArea.appendText(glasurRecipe.showInstructionsGUI());
        }

//      instructionsTextArea.appendText(glasurRecipe.showIngrediens());
//      instructionsTextArea.appendText(glasurRecipe.getIngredientsList().toString());


        glasurRecipe.getIngredientsList();

        //removes the [] from the arrayList output
        String asString = glasurRecipe.getIngredientsList().toString().replaceAll("^\\[", "").replaceAll("\\]$", "").replace(",", "");

        if (instructionsTextArea.getText() == null || instructionsTextArea.getText().trim().isEmpty()) {
            instructionsTextArea.appendText(asString);
        }


    }

}

