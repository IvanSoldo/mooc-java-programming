
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();

        list.add("first");
        list.add("second");
        Scanner scanner = new Scanner(System.in);

        list.print();

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();

    }
}
