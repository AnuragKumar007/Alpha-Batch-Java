import java.util.Scanner;

public class attempt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int a[] = new int[n/2];
        a[0]=arr[0];
        int b[] = new int[n/2];
        b[0]=arr[(n/2)];
        for(int i=1;i<a.length;i++){
            a[i]=arr[i];
        }
        int count =1;
        for(int i=(n/2)+1;i<n;i++){
            b[count]=arr[i];
            count++;
        }

        for(int i=0;i<a.length;i++){
            System.out.println(a);
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b);
        }
    }
}
