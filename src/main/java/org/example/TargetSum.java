package org.example;

public class TargetSum {
    public static void main(String[] args) {
        int[] numbers = {7, 12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum = 0;
        int thirdNum;
        boolean flag = false;
        for(int i =0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length-1;j++){
                thirdNum = targetSum - (numbers[i]+numbers[j]);
                for(int k=j+1;k<numbers.length;k++){
                    if(thirdNum==numbers[k]){
                        System.out.println("Numbers are :"+numbers[i]+" "+numbers[j]+" "+numbers[k]);
                        flag = true;
                    }
                }
            }
        }

    }
}
