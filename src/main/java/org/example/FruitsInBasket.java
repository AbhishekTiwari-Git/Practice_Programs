package org.example;

import java.util.*;

public class FruitsInBasket {
    public static void main(String[] args) {
        int[] fruitsArr = {1, 2, 1, 1, 3, 4, 2, 2, 2, 2, 4};
        int left = 0;
        int max = 0;
        Map<Integer, Integer> basket = new HashMap<>();
        for (int i = 0; i < fruitsArr.length; i++) {
            int currentCount = basket.getOrDefault(fruitsArr[i], 0);
            basket.put(fruitsArr[i], currentCount + 1);

            while (basket.size() > 2) {
                int fruitCount = basket.get(fruitsArr[left]);
                if (fruitCount == 1) {
                    basket.remove(fruitsArr[left]);
                } else {
                    basket.put(fruitsArr[left], fruitCount - 1);
                }
                left++;
            }
            max = Math.max(max, i - left + 1);
        }
        System.out.println(max);
    }
}
