package org.example;

public class fibonacci {
    static int n1=0,n2=1,n3=0,count=10;
    public static void main(String[] args) {

        int n= count-2;
        System.out.print(n1+" "+n2);
        fibo(n);
//        while(n>0){
//            n3 = n1+n2;
//            n1=n2;
//            n2=n3;
//            System.out.print(" "+n3);
//            n--;
//        }

    }
    static void fibo(int n){
        if(n>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            fibo(n-1);
        }
    }

}
