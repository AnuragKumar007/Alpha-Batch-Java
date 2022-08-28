import java.util.Scanner;

public class InvertedRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        int count=1;
        // Inverted Rotated half Pyramid
        for(int i=1; i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        // Floyd's Triangle
        System.out.println("");
        System.out.println("");
        for(int i=1; i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(+count +" ");
                count++;
            }
            System.out.println("");
        }
    }
}
