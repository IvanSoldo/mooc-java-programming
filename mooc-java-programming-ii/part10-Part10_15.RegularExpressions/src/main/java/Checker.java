import java.lang.reflect.Array;

public class Checker {

    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }
        return false;
    }

    public boolean allVowels(String string) {
        String[] letters = string.split("");
        for (String letter : letters) {
            if (!letter.matches("a|e|i|o|u")) {
                return false;
            }
        }
        return true;
    }

    public boolean timeOfDay(String string) {
        if (string.matches("(((([0-1][0-9])|(2[0-3])):?[0-5][0-9]:?[0-5][0-9]+$))")) {
            return true;
        }
        return false;
    }

}
