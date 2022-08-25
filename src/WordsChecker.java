import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WordsChecker {
    protected static String text;
    List<String> list = new LinkedList<>();

    public WordsChecker(String text) {
        this.text = text;
    }

    public void textTransformation() {
        String[] textArray = text.split(" ");
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].contains(",") || textArray[i].contains(".")) {
                list.add(textArray[i].substring(0, (textArray[i].length() - 1)).toLowerCase());
            } else {
                list.add(textArray[i].toLowerCase());
            }
        }
        //System.out.println(list);
    }

    public boolean hasWord(String word) {
        if (list.contains(word)) {
            System.out.println("Vvedennoe slovo " + word + " v texte: ");
            return true;
        } else {
            System.out.println("Vvedennoe slovo " + word + " v texte: ");
            return false;
        }
    }
}
