import java.util.Scanner;
public class custom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // Upper Half of ButterFly Pattern
        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            // Repeating the Above Pattern on X-axis
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            // Again Reapeating on X-axis
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        //Lower Half of Butterfly
        for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            // Repeating on X-axis in Lower Half 
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //Repeating again
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        // Printing Above Pattern again!!
        
        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            // Repeating the Above Pattern on X-axis
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            // Again Reapeating on X-axis
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        //Lower Half of Butterfly
        for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            // Repeating on X-axis in Lower Half 
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //Repeating again
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
