import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static List<String> permute(String str) {
        List<String> permutations = new ArrayList<>();
        if (str == null || str.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char firstChar = str.charAt(0);
        String remaining = str.substring(1);
        List<String> words = permute(remaining);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                String newWord = insertCharAt(word, firstChar, i);
                permutations.add(newWord);
            }
        }
        return permutations;
    }

    public static String insertCharAt(String word, char c, int index) {
        String start = word.substring(0, index);
        String end = word.substring(index);
        return start + c + end;
    }

}
