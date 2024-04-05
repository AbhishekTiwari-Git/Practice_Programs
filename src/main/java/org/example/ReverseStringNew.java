package org.example;

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
        char[] strCh = str.toCharArray();
        String revChars = "";
        for (int i = 0; i < strArr.length - 1; i++) {
            revChars = revChars + strCh[i];
        }
        System.out.println("Reversed Character String is 3 : " + revChars);
    }
}
