import java.util.Scanner;
public class DecimalToBinary {
    public static int decimal(int n){
        int pow=0;
        int binary=0;
        while(n>0){
            int rem = n%2;
            binary = binary + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        // System.out.println(binary);
        // return 0;
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(decimal(n));
        // decimal(n);
    }
}