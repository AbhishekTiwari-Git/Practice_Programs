package org.example;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
       int[] arr = {12,13,14,10,17,20};
       int start = 0;
       int end = arr.length-1;
       int temp;

       while(start<end){
           temp = arr[start];
           arr[start] =arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
    System.out.println(Arrays.toString(arr));
    }

}
