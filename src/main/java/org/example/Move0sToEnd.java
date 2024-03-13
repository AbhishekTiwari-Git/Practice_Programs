package org.example;

import java.util.Arrays;

public class Move0sToEnd {
    public static void main(String[] args) {
        int[] num = {0, 0, 0, 1, 0, 1, 1};
        int nonZeroIndex = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                int temp = num[i];
                num[i] = num[nonZeroIndex];
                num[nonZeroIndex] = temp;
                nonZeroIndex++;
            }


        }
        System.out.println(Arrays.toString(num));
    }
}
