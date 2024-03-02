package org.example;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] num = {12, 35, 1, 10, 34, 1};
        int largest = 0;
        int secondLargest = 0;
        for (int number : num) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }
        System.out.println("Largest Number is :- "+largest);
        System.out.println("Second Largest Number is :- "+secondLargest);
    }
}