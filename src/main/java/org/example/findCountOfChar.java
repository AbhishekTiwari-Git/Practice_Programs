package org.example;
import java.util.*;

import java.util.HashMap;

public class findCountOfChar {
    public static void main(String[] args) {
        String str = "Automation Testing";
        str = str.toLowerCase().replace(" ","");
        char arr[] = str.toCharArray();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int counter = 1;
        for(Character ch :arr){
            System.out.println("====>"+counter++);
            Integer count = map.get(ch);
            if(count== null){
                map.put(ch,1);
            }else{
                map.put(ch,++count);
            }

        }
        System.out.println("Total Count ===>"+counter);

        Set<Map.Entry<Character,Integer>> entry = map.entrySet();
        for(Map.Entry<Character,Integer> entrySet : entry){
            System.out.println(entrySet.getKey()+" "+entrySet.getValue());
        }
    }
}
