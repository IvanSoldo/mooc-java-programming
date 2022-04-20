
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longest = "";
        int sum = 0;
        int count = 0;

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            count ++;
            sum += Integer.valueOf(parts[1]);

            if (Integer.valueOf(longest.length()) < Integer.valueOf(parts[0].length())) {
                longest = parts[0];
            }
        }

        System.out.println("Longest name: " + longest);
        System.out.println("average of the birth years: " + (1.0 * sum / count));

    }
}
