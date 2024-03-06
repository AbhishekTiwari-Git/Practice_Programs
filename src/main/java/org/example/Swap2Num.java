package org.example;

public class Swap2Num {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        System.out.println("Value of a is :- "+a+" "+"Value of b is :- "+b);
        a= a^b;
        b=a^b;
        a=a^b;

        System.out.println("Value of a is :- "+a+" "+"Value of b is :- "+b);
    }
}
