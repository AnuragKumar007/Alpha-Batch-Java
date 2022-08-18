import java.util.Scanner;
public class calc{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a= sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter Operator");
        char operator = sc.next().charAt(0);

        switch (operator)
        {
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                        break;
            case '*' : System.out.println(a*b);
                        break;
            case '/' : System.out.println(a/b);
                        break;
            case '%' : System.out.println(a%b);
                        break;
            default : System.out.println("Invalid operator");
        }

    }
}