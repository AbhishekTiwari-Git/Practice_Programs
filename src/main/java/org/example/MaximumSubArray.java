package org.example;

import java.util.Arrays;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] numbers = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            if (max < sum) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max);
        }
}
