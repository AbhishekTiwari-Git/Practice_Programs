package org.example;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        ;
        if ((isAnagram("God", "odq"))) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] strCh1 = str1.toLowerCase().toCharArray();
        char[] strCh2 = str2.toLowerCase().toCharArray();
        int count = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(Character ch1 : strCh1){
            map.put(ch1,++count);
        }
        for(Character ch2 : strCh2){
            if(map.get(ch2)==null){
                return false;
            }
        }
        return true;
    }
}
