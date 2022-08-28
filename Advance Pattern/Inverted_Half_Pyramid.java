import java.util.Scanner;
public class Inverted_Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            int count=1;
            for(int j=i;j<=n;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println("");
        }
    }
}
