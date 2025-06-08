package org.example.nutriroulette.controllers;



import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import org.example.nutriroulette.recipe.*;

import java.util.*;

public class RecipeController {

    @FXML private ComboBox<String> nutrientComboBox;
    @FXML private Button generateButton;
    @FXML private VBox recipeContainer;
    @FXML private Button sortButton;

    private final Random random = new Random();

   private recipeManager myManager = new recipeManager();
   private List<Recipe> allRecipes = myManager.getAllRecipes();

    @FXML
    public void initialize() {

        nutrientComboBox.getItems().addAll("Iodine", "Iron", "Vitamin C");
        nutrientComboBox.setStyle("-fx-font-size: 14px;");


        generateButton.setOnAction(e -> {
            String selected = nutrientComboBox.getValue();
            if (selected != null) showRandomRecipe(selected);
        });

        sortButton.setOnAction(e->{
            recipeContainer.getChildren().clear();
            Collections.sort(allRecipes);
            for(Recipe recipe: allRecipes){
                Hyperlink recipelink = new Hyperlink(recipe.toString());
                recipelink.setOnAction(a->displayRecipe(recipe));
                recipeContainer.getChildren().add(recipelink);
            }
        });
    }

    private void showRandomRecipe(String selectedNutrient) {
        List<Recipe> matchingRecipes = new ArrayList<>();

        for (Recipe recipe : allRecipes) {
            if (recipe.getNutrientType().equalsIgnoreCase(selectedNutrient)) {
                matchingRecipes.add(recipe);
            }
        }

        if (matchingRecipes.isEmpty()) {
            recipeContainer.getChildren().setAll(new Label("No recipes found for " + selectedNutrient));
            return;
        }

        Recipe chosen = matchingRecipes.get(random.nextInt(matchingRecipes.size()));
        displayRecipe(chosen);
    }

    private void displayRecipe(Recipe recipe) {
        recipeContainer.getChildren().clear();
        Label name = new Label(recipe.getName());
        name.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #333;");

//        name.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
        Label slogan = new Label(recipe.getSlogan());
//        name.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #333;");

        ListView<String> ingredients = new ListView<>();
        ingredients.getItems().addAll(recipe.getIngredients());
        // Limit height based on number of items (assume ~24px per row)
        int rowCount = recipe.getIngredients().size();
        ingredients.setPrefHeight(Math.min(rowCount * 24 + 2, 200)); // max height 200

        TextArea instructions = new TextArea(recipe.getInstruction());
        instructions.setWrapText(true);
        instructions.setEditable(false);

        ImageView image = new ImageView(new Image(
                getClass().getResource("/org/example/nutriroulette/images/" + recipe.getImagePath()).toExternalForm()
        ));
        image.setFitHeight(300);
        image.setPreserveRatio(true);
        image.setStyle("-fx-border-radius: 5px;");


        recipeContainer.getChildren().setAll(
                name,
                slogan,
                image,
                new Label("Ingredients:"), ingredients,
                new Label("Instructions:"), instructions
        );
    }
}
