package org.example;

import java.util.HashSet;
import java.util.*;

public class Random {

    public static void main(String[] args) {

        String str = "ABCABCD";
        int left =0;
        int max = 0;
        for(int i=0;i<str.length();i++){
            int indexOfFirstAppearance = str.indexOf(str.charAt(i),left);
            if(indexOfFirstAppearance!=i){
                max = Math.max(max,i-indexOfFirstAppearance+1);
                left = left +1;
            }
        }
        System.out.println(max);
    }
}
