package org.example;

import java.util.Arrays;

public class ReverseStringNew {
    public static void main(String[] args) {
        revString("My Name is Abhishek");
        revStringAndChar("My Name is Abhishek");
        revChar("My Name is Abhishek");
    }

    public static void revStringAndChar(String str) {
        str = "My Name is Abhishek";
        char[] strCh = str.toCharArray();
        String rev = "";

        for (int i = strCh.length - 1; i >= 0; i--) {
            rev = rev + strCh[i];
        }
        System.out.println("Reversed String is 1 : " + rev);
    }

    public static void revString(String str) {
        str = "My Name is Abhishek";
        String revStr = "";
        String[] strArr = str.split(" ");
        for (int i = strArr.length - 1; i >= 0; i--) {
            revStr = revStr + " " + strArr[i];
        }
        System.out.println("Reversed String is 2 : " + revStr);
    }

    public static void revChar(String str) {
        String[] strArr = str.split(" ");
        String revChars = "";

        for (int i = 0; i <= strArr.length - 1; i++) {
            int start = 0;
            int end = strArr[i].length()-1;
            char[] c = strArr[i].toCharArray();
            while(i<=end){
                c[start] = (char) (c[start] ^ c[end]);
                c[end] = (char) (c[start] ^ c[end]);
                c[start] = (char) (c[start] ^ c[end]);
                start++;
                end--;
            }
            revChars = revChars + Arrays.toString(c);
        }
        System.out.println("Reversed Character String is 3 : " + revChars);
    }
}
