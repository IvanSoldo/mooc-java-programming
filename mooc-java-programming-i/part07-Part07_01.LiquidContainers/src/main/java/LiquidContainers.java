
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.print("> ");

            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            if (parts[0].equals("add")) {

                if (Integer.valueOf(parts[1]) > 0) {
                    first += Integer.valueOf(parts[1]);
                }

                if (first > 100) {
                    first = 100;
                }
            }

            if (parts[0].equals("move")) {

                if (Integer.valueOf(parts[1]) > 0) {
                    second += Integer.valueOf(parts[1]);
                    first -= Integer.valueOf(parts[1]);
                }

                if (first < 0) {
                    second += first;
                    first = 0;
                }

                if (second > 100) {
                    second = 100;
                }
            }

            if (parts[0].equals("remove")) {

                if (Integer.valueOf(parts[1]) <= 0) {
                    continue;
                }

                if (second >= Integer.valueOf(parts[1])) {
                    second -= Integer.valueOf(parts[1]);
                }

            }

        }
    }

}
