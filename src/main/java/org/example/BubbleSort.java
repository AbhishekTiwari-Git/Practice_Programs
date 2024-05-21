package org.example;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        boolean swapper = false;
        for(int i = arr.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapper = true;
                }
            }
                if(!swapper)
                    break;
        }
//        System.out.println("Sorted Array is :- " + Arrays.toString(arr));
//        System.out.println("--------------------------------------");
//        arr = new int[]{13, 46, 24, 52, 20, 9};
//        for (int i = arr.length - 1; i >= 0; i--) {
//            for (int j = 0; j <= i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
        System.out.println("Sorted Array is :- " + Arrays.toString(arr));
    }
}
