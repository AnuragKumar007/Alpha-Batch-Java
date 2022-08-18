import java.util.Scanner;
public class until_N{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("keep entering numbers");
        do{
            int n = sc.nextInt();
            if(n==10)
            break;
            System.out.println(n);
        } while(true);
    }
}