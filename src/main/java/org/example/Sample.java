package org.example;

import java.util.*;

public class Sample {
    public static void main(String[] args) {
        int[] num = {7, 12, 3, 1, 2, -6, 5, -8, 6};
        List<Integer[]> result = new ArrayList<>();
        int targetSum = 0; // ts = a+b+c | ts-a =b+c |
        int currentTarget;
        for(int i=0;i<num.length;i++){
            currentTarget = targetSum - num[i];
            Set<Integer> existingSet = new HashSet<>();
            for(int j = i+1;j<num.length;j++){
                if(existingSet.contains(currentTarget-num[j])){
                    result.add(new Integer[]{num[i],num[j],currentTarget-num[j]});
                }else {
                    existingSet.add(num[j]);
                }
            }
        }
        for(int i=0;i<result.size();i++){
            System.out.println(Arrays.toString(result.get(i)));
        }

    }
}
