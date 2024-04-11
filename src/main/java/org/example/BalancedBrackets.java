package org.example;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        BalancedBrackets bb = new BalancedBrackets();
        System.out.println(bb.isBalanced("(("));
    }

    public boolean isBalanced(String s1) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : s1.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}