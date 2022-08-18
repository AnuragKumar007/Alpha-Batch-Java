import java.util.Scanner;
public class Binomial{
    public static int BinomialCoef(int n, int r){
        int nfact = fact(n);
        int rfact = fact(r);
        int nrfact = fact(n-r);
        return nfact/(rfact * nrfact);
    }
    public static int fact(int num){
        int factorial = 1;
        while(num>=2){
            factorial *= num;
            num--;
        }
        return factorial;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'n' & 'r' to find's it Binomial Coefficient");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ans=1;
        ans = fact(n)/ (fact(r)*fact(n-r));
        System.out.println("nCr = "+ ans);
        System.out.println("nCr = "+ BinomialCoef(n,r));
        sc.close();
        
    }
}