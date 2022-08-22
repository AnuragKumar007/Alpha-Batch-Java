import java.util.Scanner;
public class Pallindrome {
    public static boolean isPalleindrome(int n) {
        int revnum= reverse(n);
        boolean pd= true;
        if(n != revnum){
            pd=false;
            return pd;
        }
        else{
        return pd;
        }
    }
    public static int reverse(int n) {
        int rev=0;
        while(n>0){
            int ld = n%10;
            rev = (rev*10) + ld;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= sc.nextInt();
        sc.close();
        System.out.println("Is " +n+ " a Pallindrome Number -: " + isPalleindrome(n));
    }
    
}
