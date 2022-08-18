public class add{
    public static int calcsum(int num1, int num2) // Parameters
    {
        int sum= num1 + num2;
        System.out.println(sum);
        return 0;
    }
    public static int prod(int num1, int num2) // Parameters
    {
        int prod= num1 * num2;
        System.out.println(prod);
        return 0;
    }
    public static void main(String[] args){
        int a=5;
        int b=10;
        calcsum(a,b); // Arguments
        prod(a,b); //Argumenta
    }
}