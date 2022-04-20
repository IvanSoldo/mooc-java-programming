import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private GradeSystem gradeSystem;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.gradeSystem = new GradeSystem();
    }

    public void start() {

        System.out.println("Enter point totals, -1 stops:");

        while (true) {

            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                this.gradeSystem.print();
                break;
            }

            this.gradeSystem.add(input);


        }

    }

}
