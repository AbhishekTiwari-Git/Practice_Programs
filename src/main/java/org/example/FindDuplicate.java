package org.example;

import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {
        String name[] = {"Abhishek","Ajay","Arun","Abhishek","Ayushi","Ani","Arun"};

        Set<String> store = new HashSet<String>();
        for(String names :name ){
            if(store.add(names) == false){
                System.out.println("Duplicate element is ::"+names);
            }
        }


        Map<String,Integer> nameMap = new HashMap<String,Integer>();
        for (String names : name){
            int count = nameMap.getOrDefault(names,0);
            nameMap.put(names,count+1);
        }

        Set<Map.Entry<String, Integer>> entry = nameMap.entrySet();
        for(Map.Entry<String,Integer> setEntry: entry){
            if(setEntry.getValue()>1){
                System.out.println("Duplicate element through Map is ::"+setEntry.getKey());
            }
        }
    }
}
