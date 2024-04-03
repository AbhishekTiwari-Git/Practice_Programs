package org.example;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] num = {7, 12, 3, 1, 2, -6, 5, -8, 6};
        int target = 4;

//        List<Integer[]> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        Set<List<Integer>> list = new HashSet<>();
        for(int i=0;i<num.length;i++){
            int complement = target - num[i];
            if(map.containsKey(complement)){
                list.add(Arrays.asList(map.get(complement),i));
            }else {
                map.put(num[i],i);
            }
        }
            System.out.println(list);
    }
}
