import java.util.Scanner;
public class BinaryToDecimal {
    public static int Binary(int n){
        int power =0;
        int dec =0;
        int ld=1;
        while(n>0){
            ld = n%10;
            dec = dec + (ld *  (int)Math.pow(2, power) );
            power++;
            n = n/10;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.close();
        System.out.println(Binary(n));
    }
}
