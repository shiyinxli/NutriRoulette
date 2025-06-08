package org.example.nutriroulette.recipe;

import java.util.List;

public class iodineRecipe extends Recipe{
    public iodineRecipe(String name, String slogan, List<String> ingredients, String instruction, String imagePath, int difficulty){
        super(name, slogan, ingredients, instruction, imagePath, difficulty);
    }

    @Override
    public String getNutrientType(){
        return "iodine";
    }

}
