import java.util.Scanner;

public class LargestNumber {

    public static int MaxNum(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
    public static int MinNum(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        System.out.println("Largest number in the array = "+ MaxNum(arr));
        System.out.println("Smallest number in the array = "+ MinNum(arr));
    }
}
