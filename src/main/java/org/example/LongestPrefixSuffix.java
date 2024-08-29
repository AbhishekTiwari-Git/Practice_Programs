package org.example;

public class LongestPrefixSuffix {
    public static void main(String[] args) {
        String s = "ABCABDFABC";
        String str = "";
        int max = 0, ans = 0;
        int left = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(left) == s.charAt(i)) {
                str = str + s.charAt(left);
                max = Math.max(max, i - left);
                left++;
            } else {
                left = 0;
                str = "";
            }
            if (max > ans) {
                ans = max;
            }
        }

        System.out.println(ans);
    }
}
