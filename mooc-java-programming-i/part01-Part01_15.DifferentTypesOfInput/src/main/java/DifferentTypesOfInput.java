
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String word = scan.nextLine();

        System.out.println("Give an integer:");
        int wholeNumber = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        double partialNumber = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean isTrue = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + word);
        System.out.println("You gave the integer " + wholeNumber);
        System.out.println("You gave the double " + partialNumber);
        System.out.println("You gave the boolean " + isTrue);

    }
}
