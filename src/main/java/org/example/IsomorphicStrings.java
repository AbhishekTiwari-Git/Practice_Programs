package org.example;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String original = "babc";
        String replacement = "kiip";

        System.out.println(isIsomorphic(original, replacement));
    }

    private static boolean isIsomorphic(String original, String replacement) {
        if (original.length() != replacement.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < original.length(); i++) {
            if (!map.containsKey(original.charAt(i))) {
                if (!map.containsValue(replacement.charAt(i))) {
                    map.put(original.charAt(i), replacement.charAt(i));
                } else {
                    return false;
                }
            } else {
                if (map.get(original.charAt(i)) != replacement.charAt(i)) {
                    return false;
                }
            }


        }
        return true;
    }
}
