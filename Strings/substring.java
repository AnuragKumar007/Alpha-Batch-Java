import java.util.Scanner;
public class substring {

    public static String substring(String str, int si, int ei) {
        String substr="";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        // Inbuilt function
        System.out.println(str.substring(0, 5));
        int si = sc.nextInt();
        int ei = sc.nextInt();
        // BruteForce
        System.out.println(substring(str, si, ei));
    }
}
