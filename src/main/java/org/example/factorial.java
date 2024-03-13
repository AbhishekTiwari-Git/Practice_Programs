package org.example;

public class factorial {
    public static void main(String[] args) {
//        factorials(5);
        System.out.println(factorials(10));
    }

    static int factorials(int num){
        if (num==0){
            return 1;
        }
        return num*factorials(num-1);
    }
}
