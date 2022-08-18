public class InvertedRotatedPyramid{
    public static void main(String[] args)throws Exception{
        int n=4;
        for(int i=1; i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}