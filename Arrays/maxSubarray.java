import java.util.Scanner;
public class maxSubarray {

    //// Kadane's Algorithm Time Complexity - O(n)

    public static void kadanes(int array[], int n) {
        int max = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0;i<n;i++){
            currsum += array[i];
            if(currsum < 0){
                currsum = 0;
            }
            max = Math.max(currsum, max);

        }
        if(max == 0){
            max = Integer.MIN_VALUE; 
            for(int i=0;i<n;i++){
                max = Math.max(max, array[i]);
            }
        }
        System.out.println("Maximum Subarray sum = "+max);
    }

    //// Time Complexity - O(n^2)

    public static void maxSubarraySumOptimised(int array[], int n) {
        int max= Integer.MIN_VALUE;
        int currSum=0;
        int prefixSum [] = new int[n];
        prefixSum[0]= array[0];
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + array[i];
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                currSum = i == 0 ? prefixSum[j] : prefixSum[j]-prefixSum[i-1];
                
                if(max<currSum)
                max=currSum;
            }
        }
        System.out.println("Max Subarray Sum - "+ max);
    }

    ////Time Complexity - O(n^3)

    public static void maxSubarraySum(int array[], int n) {
        int max= Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                currSum =0;
                for(int k=i;k<=j;k++){
                    currSum += array[k];
                }
                System.out.println("Sum of Subarray "+ currSum);
                if(max<currSum)
                max=currSum;
            }
        }
        System.out.println("Max Subarray Sum - "+ max);
    }

    //Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[20];
        System.out.println("enter array Length");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        sc.close();

        kadanes(array, n);

    }
}
