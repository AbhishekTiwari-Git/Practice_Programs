package org.example;

public class MeanArraySum {
    public static float findMean(int arr[], int n,
                                 int m) {

        // declare sum and winSum (window sum)
        float sum = 0, winSum = 0;
        int i = 0;

        // find sum for 1st m-length window
        for (; i < m; i++)
            winSum += arr[i];
        sum += (winSum / m);

        // iterate over array to find sum
        // of all m-length means
        for (; i < n; i++) {
            winSum = winSum - arr[i - m] + arr[i];
            sum += (winSum / m);
        }

        // mean of means will be sum of means
        // divided by no of such means
        return (sum / (n - m + 1));
    }

    // driver code
    public static void main(String argc[]) {
        int arr[] = {2, 5, 7, 1, 9, 3, 9};
        int n = 7 ;
        int m = 4;
        System.out.println("Mean = " +
                findMean(arr, n, m));
    }
}
