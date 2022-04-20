
public class MainProgram {

    public static void main(String[] args) {

        Money first = new Money(1,10);
        Money second = new Money(0, 90);

        Money third = first.minus(second);
        System.out.println(third);

    }
}
