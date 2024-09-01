package org.example;

import java.util.*;

public class Random {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        int n = num.length-1;
        int k =3;
        reverse(num,0,n-k-1);
        System.out.println("first==> "+Arrays.toString(num));
        reverse(num,n-k,n);
        System.out.println("second==> "+Arrays.toString(num));
        reverse(num,0,n);
        System.out.println("third==> "+Arrays.toString(num));
    }

    public static void reverse(int[] num,int start, int end){
        while(start<=end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }
}
