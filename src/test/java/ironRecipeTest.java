import org.example.nutriroulette.recipe.ironRecipe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class ironRecipeTest {
    List<String> mylist = Arrays.asList("1");
    @Test
    void testResult(){

        ironRecipe myRecipe = new ironRecipe("myRecipe", "myslogan",mylist, "instruction", "imagePath", 2 );
        String result = myRecipe.getNutrientType();
        assertEquals("iron", result);
    }
}
