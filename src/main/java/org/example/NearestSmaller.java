package org.example;

import java.util.Stack;

public class NearestSmaller {
    public static void main(String[] args) {
        int arr[] = {1, 3, 0, 2, 5};
        Stack<Integer> stack = new Stack<>();
        for (int j : arr) {
            while (!stack.isEmpty() && stack.peek() >= j) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                System.out.print("_" + " ");
            } else {
                System.out.print(stack.peek() + " ");
            }
            stack.push(j);
        }
    }
}
