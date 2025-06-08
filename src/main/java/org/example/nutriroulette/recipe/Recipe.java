package org.example.nutriroulette.recipe;

import java.util.List;

public abstract class Recipe implements Comparable<Recipe> {
    protected String name;
    protected String slogan;
    protected List<String> ingredients;
    protected String instruction;
    protected String imagePath;
    protected int difficulty;

    public Recipe(String name, String slogan, List<String> ingredients, String instruction, String imagePath, int difficulty){
        this.name=name;
        this.slogan=slogan;
        this.ingredients = ingredients;
        this.instruction = instruction;
        this.imagePath = imagePath;
        this.difficulty = difficulty;
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

    public int getDifficulty(){
        return difficulty;
    }

    @Override
    public int compareTo(Recipe other){
        return Integer.compare(this.difficulty, other.difficulty);
    }

    @Override
    public String toString (){
        return this.name+"---------difficulty: "+this.difficulty+"-----------nutrition: "+this.getNutrientType();
    }
}
