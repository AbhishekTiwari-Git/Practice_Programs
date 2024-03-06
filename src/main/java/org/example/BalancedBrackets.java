package org.example;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        if (checkBalance() == "Yes") {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }

    static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')' ||
                open == '[' && close == ']' ||
                open == '{' && close == '}');
    }

    public static String checkBalance() {
        String brackets = "([{}])";
        char[] bracArr = brackets.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (Character ch : bracArr) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return "NO";
                }
            }

        }
        return stack.isEmpty() ? "Yes" : "No";
    }
}