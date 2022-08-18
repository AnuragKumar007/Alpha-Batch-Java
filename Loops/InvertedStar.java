import java.util.Scanner;
public class InvertedStar{
    public static void main(String [] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Pattern");
        int n = sc.nextInt();
        for(int i=n;i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}