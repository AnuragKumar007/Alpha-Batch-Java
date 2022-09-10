import java.util.Scanner;

public class Subarray {
    public static void subarray(int arr[], int n){
        int ts=0;
        for(int i=0;i<n;i++){
          
            for(int j=i;j<n;j++){    
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+ " ");
                }             
                ts++;
                System.out.println("");
            }
        }
        
        System.out.println("Total Subarrays -: "+ ts);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int array[] = new int[10];
        System.out.println("Enter the Length of the array b/w 1-10");
        int n = sc.nextInt();
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        sc.close();
        System.out.println("Subarrays are -:");
        subarray(array, n);

    }
}
