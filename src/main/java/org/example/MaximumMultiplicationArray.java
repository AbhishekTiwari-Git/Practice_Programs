package org.example;

public class MaximumMultiplicationArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, -5, 6, -1, 4};
        int leftProduct = 1;
        int rightProduct = 1;
        int ans = nums[0];
        for (int i = 0; i < nums.length; i++) {
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            leftProduct = leftProduct * nums[i];

            rightProduct = rightProduct * nums[nums.length - 1 - i];

            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }
        System.out.println(ans);

    }
}