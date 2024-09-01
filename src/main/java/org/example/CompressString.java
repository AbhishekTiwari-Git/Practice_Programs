package org.example;

import java.io.IOException;

public class CompressString {
    public static void main(String[] args) throws IOException {
        String str = "aaaAAbbCCddd";
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                sb.append(str.charAt(i)).append(count);
                break;
            }
            if (str.charAt(i) == str.charAt(i + 1)) {
                count = count + 1;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        System.out.println(sb);
    }
}
