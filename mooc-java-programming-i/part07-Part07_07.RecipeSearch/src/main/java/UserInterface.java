import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Recipes recipes;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipes = new Recipes();
    }

    public void start() {

        System.out.print("File to read: ");
        String file = this.scanner.nextLine();

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println();

        this.readFile(file);

        while (true) {

            System.out.print("Enter command: ");
            String command = this.scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
            System.out.println();

            this.processCommand(command);


        }
    }

    private void readFile(String file) {
        try {
            String content = new String ( Files.readAllBytes( Paths.get(file) ) );

            String[] recipes = content.split("\\n\\n");

            for (int i = 0; i < recipes.length; i++) {

                String[] parts = recipes[i].split("\n");

                String name = parts[0];
                int cookingTime = Integer.valueOf(parts[1]);
                Recipe recipe = new Recipe(name, cookingTime);
                for (int j = 2; j < parts.length; j ++) {
                    recipe.addIngredient(parts[j]);
                }

                this.recipes.add(recipe);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void processCommand(String command) {
        if (command.equals("list")) {
            System.out.println("Recipes:");
            this.recipes.print();
        } else if(command.equals("find name")) {
            System.out.print("Searched word: ");
            String searchedWord = this.scanner.nextLine();
            this.recipes.searchRecipesByName(searchedWord);
        } else if(command.equals("find cooking time")) {
            System.out.print("Max cooking time: ");
            int cookingTime = Integer.valueOf(scanner.nextLine());
            this.recipes.searchByCookingTime(cookingTime);
        } else if(command.equals("find ingredient")) {
            String ingredient = scanner.nextLine();
            this.recipes.searchByIngredient(ingredient);
        }
    }

}
