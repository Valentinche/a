import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toLowerCase();
        String specifiedWord = input.nextLine();
        String[] Text = text.split("\\W+");
        Map<String, Integer> wordsCount = new HashMap<String, Integer>();

        for (String word : Text) {
            Integer count = wordsCount.get(word);
            if (count == null) {
                count = 0;
            }
            wordsCount.put(word, count + 1);
        }

        if (wordsCount.containsKey(specifiedWord)) {
            System.out.println(wordsCount.get(specifiedWord));
        } else {
            System.out.println(0);
        }

    }
}
