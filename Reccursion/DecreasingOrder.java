public class DecreasingOrder {
    public static void printDec(int n){
        if(n==1){ // Base
            System.out.println(n);
            return;
        }
        System.out.print(n+ " ");
        printDec(n-1); // Calling Inner Function
    }
    public static void printIncr(int n){
        if(n==1){ // Base
            System.out.print(n);
            return;
        }
        printIncr(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
        printIncr(n);
    }
}
