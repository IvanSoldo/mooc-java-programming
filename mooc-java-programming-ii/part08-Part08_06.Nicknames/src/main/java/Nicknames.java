
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Matthew", "Matt");
        hashMap.put("Michael", "Mix");
        hashMap.put("Arthur", "Artie");

        System.out.println(hashMap.get("Matthew"));
    }

}
