package org.example;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        StringBuilder sb = new StringBuilder();
        String s = "asdf";
        Arrays.sort(str);
        char[] first = str[0].toCharArray();
        char[] last = str[str.length - 1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {
                break;
            }
            sb.append(first[i]);
        }
        System.out.println(sb);
    }
}
