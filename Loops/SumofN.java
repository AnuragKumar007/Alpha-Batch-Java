import java.util.Scanner;
public class SumofN{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= sc.nextInt();
        int i=1;
        int sum=0;
        while (i<=n){
            sum += i;
            i++;
        }
        System.out.println("Sum of Numbers upto " + n + " is -: " + sum);
    }
}