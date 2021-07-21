package exercises;

import java.util.ArrayList;

public class FiveLetters {
    public static ArrayList<String> hasFiveLetters(ArrayList<String> array) {
        ArrayList<String> wordArray = new ArrayList<>();
        for (String i : array)
            if (i.length() == 5) {
                wordArray.add(i);
            }
        return wordArray;
    }
}

