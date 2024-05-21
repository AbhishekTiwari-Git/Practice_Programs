package org.example;

import java.util.*;

import java.util.HashMap;
import java.util.stream.Collectors;

public class findCountOfChar {
    public static void main(String[] args) {
        String str = "Automation Testing";
//        str = str.toLowerCase().replace(" ", "");
//        char[] arr = str.toCharArray();
//        Map<Character, Integer> map = new HashMap<Character, Integer>();
//        int counter = 1;
//        for (Character ch : arr) {
//            System.out.println("====>" + counter++);
//            Integer count = map.get(ch);
//            if (count == null) {
//                map.put(ch, 1);
//            } else {
//                map.put(ch, ++count);
//            }
//
//        }
//        System.out.println("Total Count ===>" + counter);
//
//        Set<Map.Entry<Character, Integer>> entry = map.entrySet();
//        for (Map.Entry<Character, Integer> entrySet : entry) {
//            System.out.println(entrySet.getKey() + " " + entrySet.getValue());
//        }

        int[] arr = new int[128];
        char[] s = str.toLowerCase().replace(" ", "").toCharArray();
        Set<Character> res = new HashSet<>();

        for(char charr : s){
            arr[charr]++;
            res.add(charr);
        }

        res.forEach(character -> System.out.println("No. of " + character + " " + arr[character]));


    }
}

class SortCharsByFreq {
    public static void main(String[] args) {
        String str = "aaaaccccc";

//        Map<Character, Integer> map = new HashMap<>();
//        Set<Character> check = new HashSet<>();
//
//        for(char s : str.toCharArray()){
//            if(check.add(s)){
//                map.put(s, 1);
//            }else{
//                map.put(s, map.get(s)+1);
//            }
//        }
//        StringBuilder a = new StringBuilder();
//        map.entrySet().stream().sorted((i1, i2) -> i2.getValue().compareTo(i1.getValue()))
//                .forEach(i -> {
//                    for(int j = 0; j < i.getValue(); j++){
//                        a.append(i.getKey());
//                    }
//                });
//        System.out.println(a);

        int[] arr = new int[128];
        char[] s1 = str.toCharArray();

        for (char s : s1) {
            arr[s]++;
        }

        for(int i = 0; i < str.length();){
            char c = ',';
            for(int j = 0; j < arr.length; j++){
                if(arr[j] > arr[c])
                    c = (char) j;
            }

            while(arr[c] != 0){
                s1[i++] = c;
                arr[c]--;
            }
        }
        System.out.println(s1);
    }
}
