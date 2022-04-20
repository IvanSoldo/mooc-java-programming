
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {

        int space = height - 1;
        int star = 1;

        for (int i = 0; i < height; i++) {
            printSpaces(space);
            printStars(star);
            space --;
            star +=2;
        }

        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }

    }

    public static void main(String[] args) {

        christmasTree(4);
    }
}
