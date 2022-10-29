// Question 2
// You are given E number (eg - 2019), convert it into a String of english like
// "two zero one nine". Use recursive function to solve this problem.
// NOTE - The digits of the nunber will only be in the range 0-9 and the lest digit of a number can't be O.
// Sample Input : 1947
// Sample Output : "one nine four Seven"


public class PractiseQue2 {
    
    // public static void convert(String s, int idx, String str){
    //     //base
    //     if(idx== s.length()){
    //         System.out.println(str);
    //         return;
    //     }

    //     //kaam
    //     switch (s.charAt(idx)) {
    //         case '1':
    //             System.out.print("one ");
    //             break;
    //         case '2':
    //             System.out.print("two ");
    //             break;
    //         case '3':
    //             System.out.print("three ");
    //             break;
    //         case '4':
    //             System.out.print("four ");
    //             break;
    //         case '5':
    //             System.out.print("five ");
    //             break;
    //         case '6':
    //             System.out.print("six ");
    //             break;
    //         case '7':
    //             System.out.print("seven ");
    //             break;
    //         case '8':
    //             System.out.print("eight ");
    //             break;
    //         case '9':
    //             System.out.print("nine ");
    //             break;
    //         case '0':
    //             System.out.print("zero ");
    //             break;
    //     }
    //     convert(s, idx+1, str);
    // }

    //or

    static String digits[] ={"zero","one ","two","three "," four" ,"five " ,"six ","seven","eight","nine"};
    public static void printDigits (int number){
        if (number== 0) {
            return;
        }
        int lastDigit = number%10;
        printDigits (number/ 10);
        System.out.print(digits[lastDigit] +" ");
    }
    
    public static void main(String[] args) {
        printDigits(2003);
    }
}
