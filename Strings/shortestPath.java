import java.util.Scanner;

public class shortestPath{

    public static void displacement(String str) {
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='E')
            x++;
            if(str.charAt(i)=='W')
            x--;
            if(str.charAt(i)=='N')
            y++;
            if(str.charAt(i)=='S')
            y--;
        }
        // double sq = Math.pow(x, 2)+ Math.pow(y, 2);
        // System.out.println(Math.sqrt(sq));
        System.out.println(Math.sqrt(x*x + y*y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        displacement(str);
        sc.close();
    }
}