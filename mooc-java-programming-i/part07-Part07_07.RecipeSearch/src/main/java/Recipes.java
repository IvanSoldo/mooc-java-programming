import java.util.ArrayList;

public class Recipes {

    private ArrayList<Recipe> recipes;

    public Recipes() {
        this.recipes = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void print() {
        for ( Recipe recipe : this.recipes) {
            System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime() );
        }
        System.out.println();
    }

    public void searchRecipesByName(String searchedFor) {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(searchedFor)) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime() );
            }
        }
        System.out.println();
    }

    public void searchByCookingTime(int cookingTime) {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= cookingTime) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime() );
            }
        }
        System.out.println();
    }

    public void searchByIngredient(String ingredient) {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime() );
            }
        }
        System.out.println();
    }

}
