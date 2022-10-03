
// nth Finonacci Term
// O(2^n) exponentioal
public class Fibonacci_Series {
    public static int fib(int n) {
        if(n==0 || n==1)
            return n;
        int fibn = fib(n-1) + fib(n-2);
        return fibn;
    }
    public static void main(String[] args) {
        int n =25;
        System.out.print(fib(n));
    }
}
