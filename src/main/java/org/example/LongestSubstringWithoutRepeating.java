package org.example;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String str = "ABCABCDEA";
        int maxLen = 0;
        for (int right = 0, left = 0; right < str.length(); right++) {
            int indexOfFirstAppearance = str.indexOf(str.charAt(right), left);
            if (indexOfFirstAppearance != right) {
                left = indexOfFirstAppearance + 1;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        System.out.println(maxLen);
    }

}
