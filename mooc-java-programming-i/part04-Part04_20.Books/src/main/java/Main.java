import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            Book book = new Book(title, pages, publicationYear);
            books.add(book);

        }

        System.out.println();

        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();

        if (input.equals("everything")) {

            for (Book book : books) {
                System.out.println(book);
            }
        }

        if (input.equals("name")) {

            for (Book book : books) {
                System.out.println(book.getTitle());
            }

        }

    }
}
