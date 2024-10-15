package org.example;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] num = {1,2,4,5,5,6,6,9,9,8};
        int largest = 0;
        int secondLargest = 0;
        int third = 0;
        for (int number : num) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }else if(number <secondLargest){
                third = number;
            }
        }
        System.out.println("Largest Number is :- "+largest);
        System.out.println("Second Largest Number is :- "+secondLargest);
        System.out.println("Third Largest Number is :- "+third);
    }
}