package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] numArr = {1,2,3,4};
        int[] left = new int[4];
        int[] right = new int[4];
        int[] ans = new int[4];
        left[0] = 1;
        right[numArr.length-1]=1;
        for(int i=1;i<numArr.length;i++){
            left[i]= left[i-1]*numArr[i-1];
        }
        for(int j=numArr.length-2;j>-1;j--){
            right[j]= right[j+1]*numArr[j+1];
        }

        for(int k=0;k<numArr.length;k++){
            ans[k] = left[k]*right[k];
        }

        System.out.println(Arrays.toString(ans));
    }
}
