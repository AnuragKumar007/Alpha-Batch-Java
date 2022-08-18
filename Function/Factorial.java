import java.util.Scanner;
public class Factorial{
    public static int factorial(int a){
        int ans=1;
        while(a>=2){
            ans *=a;
            a--;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= sc.nextInt();
        System.out.println(n + "! = " + factorial(n));
        sc.close();
    }
}