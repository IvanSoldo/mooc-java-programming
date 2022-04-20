
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printValues(HashMap<String, Book> hashMap) {
        for (String book : hashMap.keySet()) {
            System.out.println(hashMap.get(book));
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        for (String book : hashmap.keySet()) {
            if (hashmap.get(book).getName().contains(text)) {
                System.out.println(hashmap.get(book));
            }
        }
    }

}
