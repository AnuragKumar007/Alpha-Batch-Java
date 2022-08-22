import java.util.Scanner;

public class SumOfDigits {
    public static int Sum(int n) {
        int sum =0;
        while(n>0){
            int ld= n%10;
            sum += ld;
            n /=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(Sum(n));
    }
}
