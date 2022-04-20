package dictionary;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public void add(String words, String translations) {
        this.dictionary.putIfAbsent(words, translations);
    }

    public String translate(String word) {
        String translation = this.dictionary.getOrDefault(word, null);
        if (translation == null) {
            for (String key : this.dictionary.keySet()) {
                if (word.equals(this.dictionary.get(key))) {
                    translation = key;
                }
            }
        }
        return translation;
    }

    public void delete(String word) {
        String translation = translate(word);

        this.dictionary.remove(word);
        this.dictionary.remove(translation);
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(this.file));

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(new File(file));
            saveWords(writer);
            writer.close();

        } catch (Exception e) {
            return false;
        }
        return true;

    }

    private void saveWords(PrintWriter writer) throws IOException {

        List<String> allreadySaved = new ArrayList<>();

        this.dictionary.keySet().stream().forEach(word -> {
            if (allreadySaved.contains(word)) {
                return;
            }

            String toSave = word + ":" + this.dictionary.get(word);
            writer.println(toSave);

            allreadySaved.add(word);
            allreadySaved.add(this.dictionary.get(word));

        });

    }

}
