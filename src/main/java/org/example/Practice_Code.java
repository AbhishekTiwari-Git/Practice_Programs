package org.example;

import java.util.*;

public class Practice_Code {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
//        bubbleSort(arr);
//        insertionSort(arr);
//        isIso();
//        for(int i=0;i<=100;i++){
//            if(isPri(i)){
//                System.out.print(" "+i);
//            }
//        }
        abc();
//        addNum();
    }

    public static void bubbleSort(int[] arrNum) {
        for (int i = arrNum.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arrNum[j] > arrNum[j + 1]) {
                    int temp = arrNum[j];
                    arrNum[j] = arrNum[j + 1];
                    arrNum[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrNum));
    }

    public static void insertionSort(int[] arrNum) {
        for(int i=0;i<arrNum.length;i++){
            int j = i;
            while(j>0 && arrNum[j]>arrNum[j-1]){
                int temp = arrNum[j-1];
                arrNum[j-1]=arrNum[j];
                arrNum[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arrNum));
    }

    public static void isIso(){
        String s = "foo";
        String t = "bar";

        int[] indexS = new int[200];
        int[] indexT = new int[200];

        for(int i=0;i<s.length();i++){
            if(indexS[s.charAt(i)]!=indexT[t.charAt(i)]){
                System.out.println(false);
            }
            indexS[s.charAt(i)] = i+1;
            indexT[t.charAt(i)] = i+1;
        }

    }

    public static boolean isPri(int n){
        if(n == 0 || n == 1){
            return false;
        }
        for(int j =2;j<n;j++){
            if(n%j==0){
               return false;
            }
        }
        return true;

    }

    public static void abc(){
        String str = "my name is abhishek";
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length-1;

        while(left<right){
            ch[left] = (char) (ch[left]^ch[right]);
            ch[right] = (char) (ch[left]^ch[right]);
            ch[left] = (char) (ch[left]^ch[right]);
            left++;
            right--;
        }
        System.out.println("chhhhh==> "+ Arrays.toString(ch));
    }

    public static void addNum(){

    }
}
