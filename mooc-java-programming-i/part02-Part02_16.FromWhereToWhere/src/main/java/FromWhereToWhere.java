
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int finish = Integer.valueOf(scanner.next());

        System.out.println("Where from?");
        int start = Integer.valueOf(scanner.next());

        for(int i = start; i <= finish; i++) {
            System.out.println(i);
        }

    }
}
