public class Triangle{
    public static void main(String[] args)throws Exception{
        int n=50;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==1){
                    System.out.print("1 ");
                }
                else if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
}