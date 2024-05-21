package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountOfNbrOfChangingKeys {
    public static void main(String[] args) {
        String str = "aAbBcccDefGH";
        int left =0,count=0;
        for(int i=1;i<str.length();i++){
            if(str.toLowerCase().charAt(i)!=str.toLowerCase().charAt(left)){
                count++;
            }
            left++;
        }
        System.out.println(count);
        System.out.println("------------------Optimized Approach------------------------------");
        String str1 = "aAbBcccDefGH";
        int l = str1.length();
        int count1 = 0;
        char lastChar = str.charAt(0);
        char currChar;

        for(int i = 1; i < l; i++){
            currChar = str1.charAt(i);
            if(lastChar == currChar || (lastChar - currChar) == 'a' - 'A' || (lastChar - currChar) == 'A' - 'a')
                lastChar = currChar;
            else {
                lastChar = currChar;
                count1++;
            }
        }
        System.out.println(count1);
    }
}
