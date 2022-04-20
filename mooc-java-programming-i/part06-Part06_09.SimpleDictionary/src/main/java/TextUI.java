import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {

        while (true) {

            System.out.print("Command: ");
            String input = this.scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (input.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                this.simpleDictionary.add(word, translation);
                continue;
            }

            if (input.equals("search")) {
                System.out.print("To be translated: ");
                String wordToTranslate = scanner.nextLine();

                if (this.simpleDictionary.translate(wordToTranslate) == null) {
                    System.out.println("Word " + wordToTranslate + " was not found");
                } else {
                    System.out.print("Translation: " + this.simpleDictionary.translate(wordToTranslate));
                }
                continue;
            }

            System.out.println("Unknown command");

        }
    }

}
