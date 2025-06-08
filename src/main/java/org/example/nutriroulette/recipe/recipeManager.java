package org.example.nutriroulette.recipe;

import java.util.ArrayList;
import java.util.List;

public class recipeManager {
    public List<Recipe> allRecipes;
    Recipe MisoSoup = new iodineRecipe("Miso Tofu Soup", "Delicious Japanese Miso Soup packed with iodine!",
            List.of(
                    "3 cups water",
                    "2 tbsp miso paste",
                    "1 sheet seaweed (wakame)",
                    "100g tofu, cubed",
                    "2 green onions, sliced",
                    "Soy sauce (optional)"),
            "1. Boil water.\n2. Dissolve miso.\n3. Add seaweed and tofu.\n4. Simmer 5 min.\n5. Add green onions.\n6. Serve.",
            "misosoup.jpg", 2);

    Recipe BeefStirFry = new ironRecipe("Beef Stir Fry","Iron-rich beef with crisp veggies — quick and satisfying!",
            List.of(
                    "200g beef strips",
                    "1 cup broccoli florets",
                    "1 bell pepper, sliced",
                    "2 tbsp soy sauce",
                    "1 tbsp sesame oil",
                    "1 garlic clove, minced"),
            "1. Heat oil, cook garlic.\n2. Add beef, stir-fry 5 min.\n3. Add veggies, cook 5 min.\n4. Add soy sauce.\n5. Stir well and serve hot.",
            "beefstirfry.jpg", 4
            );

    Recipe ChickpeaQuinoaBowl = new ironRecipe("Chickpea-Quinoa Bowl", "Simple, tasty bowl full of plant-based iron and protein!",
            List.of(
                    "1 cup cooked quinoa",
                    "1 cup canned chickpeas, rinsed",
                    "1/2 cup cherry tomatoes, halved",
                    "1/4 cup spinach, chopped",
                    "1 tbsp olive oil",
                    "Juice of 1 lemon",
                    "Salt & pepper to taste"),
            "1. Mix quinoa and chickpeas.\n2. Add veggies.\n3. Drizzle with oil and lemon juice.\n4. Toss well.\n5. Season and serve.",
            "chickpeaquinoabowl.jpg",3
            );

    Recipe SeaweedSalad = new iodineRecipe("Seaweed Salad", "Fresh and tangy seaweed salad — a crunchy iodine boost!",
            List.of(
                    "1 cup dried wakame seaweed",
                    "1 cucumber, thinly sliced",
                    "2 tbsp rice vinegar",
                    "1 tbsp soy sauce",
                    "1 tsp sesame oil",
                    "1 tsp sesame seeds"),
            "1. Soak seaweed 10 min, drain.\n2. Mix vinegar, soy sauce, and oil.\n3. Combine seaweed and cucumber.\n4. Toss with dressing.\n5. Sprinkle sesame seeds.\n6. Chill and serve.",
            "seaweedsalad.jpg", 1
            );

    Recipe ShrimpStirFry = new iodineRecipe("Shrimp Stir-Fry", "Colorful shrimp stir-fry — quick, tasty, and rich in iodine!",
            List.of(
                    "200g shrimp, peeled",
                    "1 cup broccoli florets",
                    "1 bell pepper, sliced",
                    "2 tbsp soy sauce",
                    "1 tbsp vegetable oil",
                    "1 garlic clove, minced"),
            "1. Heat oil in pan.\n2. Sauté garlic.\n3. Add shrimp, cook until pink.\n4. Add veggies, stir-fry 5–7 min.\n5. Add soy sauce.\n6. Serve hot.",
            "shrimpstirfry.jpg", 5
            );

    Recipe SpinachLentilCurry = new ironRecipe("Spinach Lentil Curry", "Hearty lentil curry loaded with spinach — plant-powered iron!",
            List.of(
                    "1 cup red lentils",
                    "2 cups water",
                    "2 cups spinach, chopped",
                    "1 onion, diced",
                    "2 garlic cloves, minced",
                    "1 tbsp curry powder",
                    "1 tbsp olive oil",
                    "Salt to taste"),
            "1. Rinse lentils.\n2. Cook onion & garlic in oil.\n3. Add lentils, water, curry powder.\n4. Simmer 20 min.\n5. Stir in spinach.\n6. Cook 5 more min and serve.",
            "spinachlentilcurry.jpg", 4
            );

    Recipe CitrusSalad = new vcRecipe("Citrus Power Salad", "A refreshing salad bursting with vitamin C!",
            List.of(
                    "1 orange, peeled and segmented",
                    "1 grapefruit, peeled and segmented",
                    "1 kiwi, sliced",
                    "1/2 cup strawberries, halved",
                    "1 tbsp honey",
                    "Fresh mint leaves"),
            "1. Combine all fruits in a bowl.\n2. Drizzle with honey.\n3. Toss gently.\n4. Garnish with mint.\n5. Serve chilled.",
            "citrussalad.jpg",2);

    Recipe BellPepperStirFry = new vcRecipe("Bell Pepper Stir-Fry", "Quick and colorful stir-fry packed with vitamin C!",
            List.of(
                    "1 red bell pepper, sliced",
                    "1 yellow bell pepper, sliced",
                    "1 green bell pepper, sliced",
                    "1 onion, sliced",
                    "2 cloves garlic, minced",
                    "1 tbsp olive oil",
                    "Soy sauce to taste"),
            "1. Heat oil in a pan.\n2. Add garlic and onion, sauté until fragrant.\n3. Add bell peppers.\n4. Stir-fry for 5-7 minutes.\n5. Add soy sauce, mix well.\n6. Serve hot.",
            "bellpepperstirfry.jpg", 5);

    Recipe BroccoliSoup = new vcRecipe("Creamy Broccoli Soup", "Warm soup full of vitamin C and flavor!",
            List.of(
                    "2 cups broccoli florets",
                    "1 potato, diced",
                    "1 small onion, chopped",
                    "2 cups vegetable broth",
                    "1/2 cup milk (or plant-based alternative)",
                    "Salt and pepper to taste"),
            "1. Cook onion, broccoli, and potato in broth until tender.\n2. Blend until smooth.\n3. Add milk.\n4. Simmer 5 minutes.\n5. Season to taste.\n6. Serve warm.",
            "broccolisoup.jpg", 3);
    public recipeManager() {
        allRecipes = new ArrayList<>();
        allRecipes.add(MisoSoup);
        allRecipes.add(BeefStirFry);
        allRecipes.add(ChickpeaQuinoaBowl);
        allRecipes.add(SeaweedSalad);
        allRecipes.add(ShrimpStirFry);
        allRecipes.add(SpinachLentilCurry);
        allRecipes.add(CitrusSalad);
        allRecipes.add(BellPepperStirFry);
        allRecipes.add(BroccoliSoup);
    }

    public List<Recipe> getAllRecipes(){
        return allRecipes;
    }

}
