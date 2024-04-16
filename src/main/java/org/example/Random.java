package org.example;

import java.util.*;

public class Random {
    public static void main(String[] args) {
        int[] num = {7, -12, 4, 4, 2, 6, 5, -8, 6};
        Arrays.sort(num);
        int target = 0;
        Set<List<?>> result = new HashSet<>();
        for(int i=0;i<num.length-2;i++){
            int left = i+1;
            int right = num.length-1;

            while(left<right){
                int sum = num[i]+num[left]+num[right];

                if(sum == target){
                    result.add(Arrays.asList(num[i],num[left],num[right]));
                    left++;
                    right--;
                }else if(sum<target){
                    left++;
                }else {
                    right--;
                }
            }
        }
        System.out.println(result);
    }
}
