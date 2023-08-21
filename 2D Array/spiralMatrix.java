import java.util.Scanner;

public class spiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][]= new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int rowst = 0, colst=0, rowend=n-1, colend=m-1;
        while(rowst <=rowend && colst<=colend){
            //top
            for(int j=colst;j<=colend;j++){
                System.out.print(matrix[rowst][j]+" ");
            }
            rowst++;
            //right
            for(int i=rowst;i<=rowend;i++){
                System.out.print(matrix[i][colend]+" ");
            }
            colend--;
            //bottom
            for(int j=colend;j>=colst;j--){
                System.out.print(matrix[rowend][j]+" ");
            }
            rowend--;
            //left
            for(int i=rowend;i>=rowst;i--){
                System.out.print(matrix[i][colst]+" ");
            }
            colst++;
            
            
        }

        
    }
}
