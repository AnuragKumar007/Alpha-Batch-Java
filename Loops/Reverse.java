import java.util.Scanner;
public class Reverse{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= sc.nextInt();
        int rev=0;
        // while(n>0){
        //     int lastdigit = n%10;
        //     n = n/10;
        //     System.out.print(lastdigit);
        // }
        while(n>0){
            int lastdigit = n%10;
            rev = rev*10 + lastdigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}