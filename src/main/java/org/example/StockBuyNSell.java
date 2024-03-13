package org.example;

public class StockBuyNSell {
    public static void main(String[] args) {
        int arr[] = {1, 1, 9, 3, 4, 4};
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]-min);
        }
        System.out.println(max);
    }
}
