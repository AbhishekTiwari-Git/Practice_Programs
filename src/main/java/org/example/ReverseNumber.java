package org.example;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 12345678;
        int rev = 0;

        while (number > 0) {
            rev = rev * 10 + number % 10;
            number = number / 10;
        }
        System.out.println("Reverse of a number is : " + rev);
    }


}
