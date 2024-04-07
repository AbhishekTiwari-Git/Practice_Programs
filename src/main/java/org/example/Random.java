package org.example;


import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class Random {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, -5, 6, -1, 4};
        int leftProduct = 1;
        int rightProduct = 1;
        int n = nums.length;
        int ans = nums[0];

        for (int i = 0; i < n; i++) {
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            leftProduct = leftProduct * nums[i];
            rightProduct = rightProduct * nums[n - 1 - i];

            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }
        System.out.println(ans);
    }
}
