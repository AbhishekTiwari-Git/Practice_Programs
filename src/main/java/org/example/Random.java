package org.example;


import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class Random {
    public static void main(String[] args) {
        System.out.println(isAnagram("aacc","ccac"));
    }

    public static boolean isAnagram(String s1,String s2){
        s1 = s1.toLowerCase().replace(" ","");
        s2 = s2.toLowerCase().replace(" ","");

        int[] counts = new int[26];

        for(int i=0;i<s1.length();i++){
            counts[s1.charAt(i)-'a']++;
        }

        for(int i=0;i<s2.length();i++){
            counts[s2.charAt(i)-'a']--;
        }

        for(int count : counts){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
