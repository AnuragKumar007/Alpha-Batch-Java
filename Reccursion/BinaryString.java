
// 

public class BinaryString {
    
    public static void printbinary(int n, int prevplace,  String str ){
        if(n==0){
            System.out.println(str);
            return;
        }

        // kaam
        printbinary(n-1, 0, str+"0");
        if(prevplace==0){
            printbinary(n-1, 1, str+"1");
        }
    }
    
    public static void main(String[] args) {
        printbinary(3, 0, "");
    }
}
