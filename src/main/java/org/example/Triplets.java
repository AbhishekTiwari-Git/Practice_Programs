package org.example;

import java.util.*;

public class Triplets {
    public static void main(String[] args) {
        int[] num = {7, 12, 3, 1, 2, -6, 5, -8, 6}; // 0 = a+b+c : 0-a = b+c : -a-b =c
        List<Integer[]> result = new ArrayList<>();
        int targetSum = 0;
        for (int i = 0; i < num.length; i++) {
            int currentTarget = targetSum - num[i]; // -7
            Set<Integer> existingSum = new HashSet<>();
            for (int j = i + 1; j < num.length; j++) {
                if (existingSum.contains(currentTarget - num[j])) {
                    result.add(new Integer[]{num[i], num[j], currentTarget - num[j]});
                } else {
                    existingSum.add(num[j]);
                }
            }

        }
        for(int i=0;i<result.size();i++){
            System.out.println(Arrays.toString(result.get(i)));
        }
    }
}
