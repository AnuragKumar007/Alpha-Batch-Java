import java.util.Scanner;

public class Even {
    public static boolean isEven(int n) {
        boolean num = true;
        if(n%2!=0){
            num = false;
            return num;
        }
        else 
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(isEven(n));
    }
}
