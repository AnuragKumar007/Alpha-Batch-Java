import java.util.*;
public class HalfPyramid{
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Pattern");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}