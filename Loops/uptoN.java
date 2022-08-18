import java.util.Scanner;
public class uptoN{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= sc.nextInt();
        int i=1;
        while (i<=n){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("Done");
    }
}