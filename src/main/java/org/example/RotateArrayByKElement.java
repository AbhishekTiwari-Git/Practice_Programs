package org.example;

import java.util.Arrays;

public class RotateArrayByKElement {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int k = 4;
        reverse(arr1,0,arr1.length-1);
        reverse(arr1,0,k-1);
        reverse(arr1,k,arr1.length-1);

        System.out.println(Arrays.toString(arr1));
    }

    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
