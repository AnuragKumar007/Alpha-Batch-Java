import java.util.Scanner;

public class IO{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        int array[]= new int [5];
        System.out.println("Enter 5 Element of the array");
        for(int i=0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        sc.close();
        // Output
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
}