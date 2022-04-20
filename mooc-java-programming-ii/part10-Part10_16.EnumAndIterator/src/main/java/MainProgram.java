
public class MainProgram {

    public static void main(String[] args) {
        Employees employees = new Employees();
        Person person = new Person("Arto", Education.PHD);
        employees.add(person);
        employees.fire(Education.PHD);
        employees.print();
    }
}
