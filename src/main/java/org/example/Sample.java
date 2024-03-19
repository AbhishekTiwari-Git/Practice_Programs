package org.example;

import java.util.*;

public class Sample {

    public static void main(String[] args) {
        String str = "AAABCCCCD";
        int maxLen =0;
        for(int left=0,right =0;right<str.length();right++){
            int cnt = str.indexOf(str.charAt(right),left);
            if(cnt!=right){
                left = cnt+1;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        System.out.println(maxLen);
    }
}
