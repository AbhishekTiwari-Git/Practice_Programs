package org.example;

interface lambda{
    void learn(String value);
}

public class LambdaExp {
    public static void main(String[] args) {
        lambda l = (value)-> System.out.println("I am Lambda "+value);
        l.learn("ABC");
        };
    }

