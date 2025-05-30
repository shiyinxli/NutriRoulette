package org.example.nutriroulette.recipe;

import java.util.List;

public abstract class Recipe {
    protected String name;
    protected String slogan;
    protected List<String> ingredients;
    protected String instruction;
    protected String imagePath;

    public Recipe(String name, String slogan, List<String> ingredients, String instruction, String imagePath){
        this.name=name;
        this.slogan=slogan;
        this.ingredients = ingredients;
        this.instruction = instruction;
        this.imagePath = imagePath;
    }

    public abstract String getNutrientType();

    public String getName() {
        return name;
    }

    public String getSlogan() {
        return slogan;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getInstruction() {
        return instruction;
    }

    public String getImagePath(){
        return imagePath;
    }
}
