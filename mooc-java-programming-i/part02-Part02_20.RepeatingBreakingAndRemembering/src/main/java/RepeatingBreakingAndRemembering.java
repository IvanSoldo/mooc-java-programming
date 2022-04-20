
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int count = 0;
        int sum = 0;
        int oddNumbers = 0;
        int evenNumbers = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            count ++;
            sum += number;

            if (number % 2 != 0) {
                oddNumbers ++;
                continue;
            }
            evenNumbers ++;

        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (1.0 * sum / count));
        System.out.println("Even: " + evenNumbers);
        System.out.printf("Odd: " + oddNumbers);

    }
}
