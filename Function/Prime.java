import java.util.Scanner;
public class Prime {
    public static boolean isPrime(int a) {
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0)
            isPrime = false;
            break;
        }
        // System.out.println();
        return isPrime;
    }
    public static void PrimeInRange(int n) {
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
        PrimeInRange(n);
    }
}
