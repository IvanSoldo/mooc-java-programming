
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number? ");
        int firstNumber = Integer.valueOf(scanner.next());

        System.out.println("Last number? ");
        int lastNumber = Integer.valueOf(scanner.next());

        int sum = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);

    }
}
