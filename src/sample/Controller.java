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

    }

}

