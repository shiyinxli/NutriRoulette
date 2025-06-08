package org.example.nutriroulette.recipe;

import java.util.List;

public class ironRecipe extends Recipe{
    public ironRecipe(String name, String slogan, List<String> ingredients, String instruction, String imagePath, int difficulty){
        super(name, slogan, ingredients, instruction, imagePath, difficulty);
    }

    @Override
    public String getNutrientType(){
        return "iron";
    }
}
