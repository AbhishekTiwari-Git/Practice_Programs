package org.example;

import java.util.Arrays;

public class Plus1 {
    public static void main(String[] args) {
        int[] arr = {9};
        for(int i=arr.length-1;i>=0;i--){
        if(arr[i]<9){
            arr[i]+= 1;
        }
        arr[i]=0;
        }
        arr = new int[arr.length+1];
        arr[0]=1;
        System.out.println(Arrays.toString(arr));
    }

}
