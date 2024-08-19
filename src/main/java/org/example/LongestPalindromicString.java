package org.example;

public class LongestPalindromicString {
    public static void main(String[] args) {
        String str = "EBBABADA";
        String LPS = "";
        for(int i=1;i<str.length();i++){
            int low = i;
            int high = i;

            while(str.charAt(low)==str.charAt(high)) {
                low--;
                high++;

                if (low == -1 || high == str.length()) {
                    break;
                }
            }
            String palindrome = str.substring(low+1,high);
            if(palindrome.length()>LPS.length()){
                LPS = palindrome;
            }

            low = i-1;
            high = i;

            while(str.charAt(low) == str.charAt(high)){
                low--;
                high++;

                if(low==-1 || high == str.length()){
                    break;
                }
            }

            palindrome = str.substring(low+1,high);
            if(palindrome.length()>LPS.length()){
                LPS = palindrome;
            }

        }
        System.out.println(LPS);

    }
}
