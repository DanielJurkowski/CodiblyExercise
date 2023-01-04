package BalancedWordsCounter;

import java.util.HashMap;
import java.util.Map;

public class BalancedWordsCounter {
    public static int count(String input) throws RuntimeException {
        if (input == null) {
            throw new RuntimeException();
        }

        for (char c : input.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new RuntimeException();
            }
        }

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String subword = input.substring(i, j);

                if (isBalanced(subword)) {
                    count += 1;
                }
            }
        }

        return count;
    }

    private static boolean isBalanced(String word) {
        if (word.isEmpty()) {
            return false;
        }

        Map<Character, Integer> letterCounts = new HashMap<>();

        for (char c : word.toCharArray()) {
            letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
        }

        int count = letterCounts.values().iterator().next();

        for (int v : letterCounts.values()) {
            if (v != count) {
                return false;
            }
        }

        return true;
    }
}

