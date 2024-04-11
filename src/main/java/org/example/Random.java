package org.example;


import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class Random {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 10, 11, 12, 15, 20, 25, 30};
        Arrays.sort(arr);
        System.out.println(bs(arr));
    }

    public static boolean bs(int[] num) {
        int number = 90;
        int left = 0;
        int right = num.length-1;

        while(left<=right) {
            int mid = (left + right) / 2;

            if (num[mid] == number) {
                return true;
            }

            if (num[mid] > number) {
                right = mid - 1;
            }

            if (num[mid] < number) {
                left = mid + 1;
            }
        }

        return false;
    }
}
