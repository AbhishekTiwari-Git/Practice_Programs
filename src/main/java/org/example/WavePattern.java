package org.example;

public class WavePattern {
    public static void main(String[] args) {
        /*

         *    0 0
         *   1 1
         *  2 2
         *   3 1
         *    4 0

         */
        printPattern(5);

    }

    public static void printPattern(int row) {
        for (int i = 0; i <= row / 2; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();

        }
        for (int k = row - row / 2; k >= 2; k--) {
            for (int t = k - 2; t > 0; t--) {
                System.out.print(" ");

            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i <= row / 2; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();

        }
        for (int k = row - row / 2; k >= 2; k--) {
            for (int t = k - 2; t > 0; t--) {
                System.out.print(" ");

            }
            System.out.print("*");
            System.out.println();
        }
    }

}
