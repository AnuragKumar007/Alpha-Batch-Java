import java.util.Scanner;

public class Hollow_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i == n || j==1 || j ==n ){
                    System.out.print("* ");
                }
                else
                System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
