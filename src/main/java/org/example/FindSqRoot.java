package org.example;

public class FindSqRoot {

    public static void main(String[] args) {
        int number = 8;
        int left = 1;
        int right = number;
        int ans = 0;

        while(left<=right){
            int mid = (left + right)/2;
            if((mid*mid) == number){
                ans = mid;
                break;
            }
            if((mid*mid)>number){
                right = (mid-1);
            }
            if((mid*mid)<number){
                left = (mid+1);
                ans =  mid;
            }
        }
        System.out.println(ans);
    }

}
