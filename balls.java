import java.util.Scanner;

public class balls {
    
    public static void interstingSubarray(int [] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
                if(arr[i]>max)
                max=arr[i];
                if(arr[i]<min)
                min= arr[i];
            }
            int flag=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<0){
                    flag++;
                }
            }    
            
            if(flag==arr.length)
            System.out.println((long)max*max+" " +(long)min*min);
            else if(flag>0 && flag<arr.length)
            System.out.println((long)min*max+" "+(long)max*max);
            else
            System.out.print((long)min*min+" "+ (long)max*max);
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
            int n =sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            interstingSubarray(arr);
            
        }
    }
}
