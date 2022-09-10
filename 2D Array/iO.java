import java.util.Scanner;

public class iO {
    public static void main(String[] args) {
        int matrix [] [] = new int [3][3];
        Scanner sc = new Scanner(System.in);
        int n = matrix.length, m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter key to search");
        int key = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        Search(matrix, key);
        maxMin(matrix);
    }
    public static void maxMin(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                max = Math.max(matrix[i][j], max);
                min = Math.min(matrix[i][j], min);
            }
        }
        System.out.println("Max -: "+max+ " & Min -: "+min);
    }
    public static void Search(int matrix[] [], int key){
        int flag=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(key==matrix[i][j]){
                    System.out.println("Key found at-: "+ i+","+j+ " index");
                    flag++;
                }
            }
        }
        if(flag==0)
        System.out.println("Element not found");
    }
}
