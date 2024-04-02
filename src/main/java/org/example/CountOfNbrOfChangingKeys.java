package org.example;

import java.util.Arrays;

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
    }
}
