package org.example.nutriroulette.recipe;

import java.util.List;

public class vcRecipe extends Recipe{
    public vcRecipe(String name, String slogan, List<String> ingredients, String instructions, String imagePath, int difficulty){
        super(name, slogan, ingredients, instructions, imagePath, difficulty);
    }

    @Override
    public String getNutrientType(){
        return "vitamin C";
    }
}
