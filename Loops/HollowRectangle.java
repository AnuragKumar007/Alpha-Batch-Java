import java.util.Scanner;
public class HollowRectangle{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n-1;i++){
            if(i==1 || i==n-1){
                for(int j=1; j<=n;j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j=1; j<=n;j++){
                    if(j==1 ){
                        System.out.print("* ");
                        for(int k=1;k<=n-2;k++){
                            System.out.print("  ");
                        }
                    }
                    else if(j==n)
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}