package org.example;

import java.util.*;

public class Sample {

    public static void main(String[] args) {
        String a = "Abhishek";
        String b = "Tiwari";


       a = a+b;
       b = a.substring(0,a.length()-b.length());
       a = a.substring(b.length());

        System.out.println(a +" "+ b);


    }
}
