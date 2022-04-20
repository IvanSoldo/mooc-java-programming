
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        boolean isFound = false;

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {

            while (fileReader.hasNextLine()) {
                names.add(fileReader.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        for (String name : names) {
            if (name.equals(searchedFor)) {
                System.out.println("Found!");
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("Not found.");
        }

    }
}
