package org.example;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "racecar";
        str = str.toLowerCase();

        if(isPalindrome(str)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

    public static boolean isPalindrome(String s){
        int i =0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
