// import java.util.Scanner;
public class TypeCast{
    public static void main(String[] args)throws Exception
    {
        // Scanner sc = new Scanner(System.in);
        int a = (int)50.25444f;
        System.out.println(a);
        System.out.println("");
        float cgpa= 8.54f;
        int cgpa2= (int)cgpa;
        System.out.println(cgpa2);

        char ch= 'a';
        int num = (int)ch;
        System.out.println(num);
        char ch2= 'm';
        int num2 = (int)ch2;
        System.out.println(num2);
    }
}