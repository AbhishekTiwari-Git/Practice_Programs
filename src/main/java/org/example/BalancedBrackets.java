package org.example;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        BalancedBrackets bb = new BalancedBrackets();
        String brackets = "([{}])";
        if (bb.isBalanced(brackets)) {
            System.out.println("Brackets are balanced");
        } else {
            System.out.println("Brackets are not balanced");
        }

    }

    public boolean isBalanced(String s1) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : s1.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isMatchingPair(Character Open, Character close) {
        return (Open == '{' && close == '}'
                || Open == '[' && close == ']'
                || Open == '(' && close == ')');
    }
}