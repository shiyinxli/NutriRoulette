package org.example.nutriroulette.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {
    @FXML
    private void goToRoulette() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/nutriroulette/Recipe.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load()));

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
