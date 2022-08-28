import java.util.*;

public class WordsChecker {
    protected String text;
    protected Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;
    }

    public void textTransformation() {
        String[] textArray = text.split(" ");
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].contains(",") || textArray[i].contains(".")) {
                set.add(textArray[i].substring(0, (textArray[i].length() - 1)).toLowerCase());
            } else {
                set.add(textArray[i].toLowerCase());
            }
        }
    }

    public boolean hasWord(String word) {
        if (set.contains(word)) {
            System.out.println("Vvedennoe slovo " + word + " v texte: ");
            return true;
        } else {
            System.out.println("Vvedennoe slovo " + word + " v texte: ");
            return false;
        }
    }
}
