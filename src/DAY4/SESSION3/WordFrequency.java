package DAY4.SESSION3;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    public static void main(String[] args) {

        String[] words = {
            "Iron Man",
            "Thor",
            "Captain Marvel",
            "Hawkeye",
            "Iron Man"
        };

        HashMap<String, Integer> map = new HashMap<>();

        // Count frequency
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Print frequencies
        System.out.println("Frequencies:");

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        // Find most frequent word
        String maxWord = "";
        int max = 0;

        for (Map.Entry<String, Integer> e : map.entrySet()) {

            if (e.getValue() > max) {
                max = e.getValue();
                maxWord = e.getKey();
            }
        }

        System.out.println("\nMost Frequent Word: " + maxWord);

        // Print unique words
        System.out.print("Unique Words: ");

        for (Map.Entry<String, Integer> e : map.entrySet()) {

            if (e.getValue() == 1) {
                System.out.print(e.getKey() + " ");
            }
        }
    }
}