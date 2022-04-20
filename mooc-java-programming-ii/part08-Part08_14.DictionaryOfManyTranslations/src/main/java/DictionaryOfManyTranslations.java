import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (!this.dictionary.containsKey(word)) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add(translation);
            this.dictionary.put(word, temp);
            return;
        }
        this.dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (this.dictionary.get(word) == null) {
            return new ArrayList<>();
        }
        return this.dictionary.get(word);
    }

    public void remove(String word) {
        this.dictionary.remove(word);
    }

}
