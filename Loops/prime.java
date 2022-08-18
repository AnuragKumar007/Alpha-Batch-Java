import java.util.Scanner;
import java.lang.Math;
public class prime{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for(int i=2; i<= Math.sqrt(n); i++){
            if(i%n==0){
                System.out.println("Not Prime");
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }
        
    }
}