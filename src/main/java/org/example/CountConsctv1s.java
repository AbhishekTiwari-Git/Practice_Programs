package org.example;

public class CountConsctv1s {
    public static void main(String[] args) {
        int[] num = {0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1};
        int count = 0;
        int max = 0;

        for (int a : num) {
            count = a == 1 ? count + 1 : 0;
            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}
