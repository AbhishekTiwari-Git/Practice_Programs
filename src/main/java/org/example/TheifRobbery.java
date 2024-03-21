package org.example;

public class TheifRobbery {
    public static void main(String[] args) {
        int[] money = {2,7,9,3,1};
        int previous = money[0];
        int previousToPrevious = 0;
        for(int i=1;i<money.length;i++){
            int temp = previous;
            previous = Math.max(previous,previousToPrevious+money[i]);
            previousToPrevious = temp;
        }
        System.out.println(previous);
    }
}
