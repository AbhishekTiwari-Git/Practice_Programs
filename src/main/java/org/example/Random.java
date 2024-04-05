package org.example;


import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class Random {
    public static void main(String[] args) {
        String original = "Title";
        String replacement = "paper";
        System.out.println(isIsoMorphic(original.toLowerCase(),replacement.toLowerCase()));

    }

    private static boolean isIsoMorphic(String orig, String repl) {
        if(orig.length()!=repl.length()){
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        for(int i=0;i<orig.length()-1;i++){
            if(!map.containsKey(orig.charAt(i))){
                if(!map.containsValue(repl.charAt(i))){
                    map.put(orig.charAt(i),repl.charAt(i));
                }
                else {
                    return false;
                }
            }
            else if(map.containsKey(orig.charAt(i))!= map.containsValue(repl.charAt(i))){
                return false;
            }
        }
        return true;
    }

}
