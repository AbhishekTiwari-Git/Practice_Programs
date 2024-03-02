package org.example;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String str = "My name is Abhishek";
        char strCh1[] = str.toCharArray();
        String str1[] = str.split(" ");
        String newWord = "";
        for(int i= str1.length-1;i>=0;i--){
            System.out.print(" "+str1[i]);
        }

        for(String strCh : str1){
            for(int i=0;i<strCh.length();i++){
                if((strCh.charAt(i) == 'a') || (strCh.charAt(i) == 'e') || (strCh.charAt(i) == 'i') || (strCh.charAt(i) == 'o') || (strCh.charAt(i) == 'u')) {
                    strCh.replace(strCh.charAt(i), ' ');
                }else {
                    newWord = newWord +strCh.charAt(i);
                }
            }
            newWord = newWord + " ";
        }
        System.out.println(newWord);


        Map<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('a',0);
        map.put('e',1);
        map.put('i',2);
        map.put('o',3);
        map.put('u',4);

        char vow[] = {'a','e','i','o','u'};

        for(int i=0;i<str.length();i++){
            if((strCh1[i]=='a')||(strCh1[i]=='e')||(strCh1[i]=='i')||(strCh1[i]=='o')||(strCh1[i]=='u')){
                int Index = map.get(strCh1[i]) +1;
                strCh1[i]=vow[Index];
            }
        }
        System.out.println(strCh1);


    }
}
