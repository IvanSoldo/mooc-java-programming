import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList toDoList;

    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.scanner = scanner;
        this.toDoList = toDoList;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
            this.proccess(command);

        }
    }

    private void proccess(String command) {
        if (command.equals("add")) {
            this.add();
        } else if (command.equals("list")) {
            this.list();
        } else if (command.equals("remove")) {
            this.remove();
        }
    }

    public void add() {
        System.out.print("To add: ");
        String newTask = scanner.nextLine();
        this.toDoList.add(newTask);
    }

    public void list() {
        this.toDoList.print();
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        int taskNumber = Integer.valueOf(scanner.nextLine());
        this.toDoList.remove(taskNumber);
    }

}
