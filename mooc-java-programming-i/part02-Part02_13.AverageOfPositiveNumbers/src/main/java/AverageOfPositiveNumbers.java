
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while(true) {

            int number = Integer.valueOf(scanner.nextLine());

            if (sum == 0 && number == 0) {
                System.out.println("Cannot calculate the average");
            }

            if (number == 0) {
                System.out.println(1.0 * sum / count);
                break;
            }

            if (number > 0) {
                count ++;
                sum += number;
            }

        }

    }
}
