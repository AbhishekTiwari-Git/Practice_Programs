package org.example;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,3,5,9,10,11,12,15,20,25,30};
        int numberToSearch = 31;
        System.out.println("Number found ? - "+searchNum(arr,numberToSearch));
    }

    public static boolean searchNum(int[] arr,int numberToSearch){

        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;

            if(numberToSearch == arr[mid]){
                return true;
            }

            if(numberToSearch > arr[mid]){
                left = mid+1;
            }else {
                right = mid-1;
            }

        }
        return false;
    }
}
