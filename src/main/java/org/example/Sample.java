package org.example;

import java.util.*;

public class Sample {
    public static void main(String[] args) {
        int[] num = {7, 12, 3, 1, 2, -6, 5, -8, 6};
        int target = 4;
        Arrays.sort(num);
        Set<List<Integer>> list = new HashSet<>();
        for(int i=0;i<num.length-2;i++){
            int left = i+1, right = num.length-1;
            while(left<right){
                int sum = num[i]+num[left]+num[right];
                if(sum == 0){
                    list.add(Arrays.asList(num[i],num[left],num[right]));
                    left++;
                    right--;
                }
               else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        System.out.println(list);
    }
}
