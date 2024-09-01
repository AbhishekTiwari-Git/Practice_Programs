package org.example;

import java.util.*;

public class abc {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = new HashMap<>();
        for (String st : strs) {
            char[] ch = st.toCharArray();
            Arrays.sort(ch);
            if (!map.containsKey(String.valueOf(ch))) {
                map.put(String.valueOf(ch), new ArrayList<>());
            }
            map.get(String.valueOf(ch)).add(st);
        }
        System.out.println(map.values());
    }
}
