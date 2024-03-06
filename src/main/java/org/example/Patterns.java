package org.example;

public class Patterns {
    public static void main(String[] args) {
//    printHourGlass(5);
    pascalTriangle();
    }
/*
    * * * *     4 0
     * * *      3 1
      * *       2 2
       *        1 3
      * *
     * * *
    * * * *

 */
public static void printHourGlass(int row) {
    for (int i = 1; i <= row; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
            for (int k = row; k >= i; k--) {
                System.out.print("* ");
            }
        System.out.println();
        }
    for (int i = 2; i <= row; i++) {
        for (int j = 0; j <= row-i; j++) {
            System.out.print(" ");
        }
        for (int k = i; k >0 ; k--) {
            System.out.print("* ");
        }
        System.out.println();
    }

    }
    /*
                1
               2 3
              4 5 6
             7 8 9 10
     */
    public static void pascalTriangle() {
        int c= 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }

}
