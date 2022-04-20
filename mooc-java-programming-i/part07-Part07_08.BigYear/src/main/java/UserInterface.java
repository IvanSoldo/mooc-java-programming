import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private BirdDatabase birdDatabase;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birdDatabase = new BirdDatabase();
    }

    public void start() {

        while (true) {

            System.out.print("? ");
            String command = this.scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            processCommand(command);

        }
    }

    private void processCommand(String command) {
        if (command.equals("Add")) {

            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Name in Latin: ");
            String latinName = scanner.nextLine();

            this.birdDatabase.add(name, latinName);

        }

        if (command.equals("Observation")) {
            System.out.print("Bird? ");
            String name = scanner.nextLine();

            this.birdDatabase.addObservation(name);
        }

        if (command.equals("All")) {
            this.birdDatabase.printAll();
        }

        if (command.equals("One")) {
            System.out.print("Bird? ");
            String name = scanner.nextLine();
            this.birdDatabase.printOne(name);
        }

    }

}
