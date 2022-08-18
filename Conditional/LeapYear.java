import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int Year = sc.nextInt();
            if(Year % 4 == 0){
                if(Year % 100 == 0){
                    if( Year % 400 ==0 ){
                        System.out.println("Leap Year");
                    }
                    else{
                        System.out.println("Not a Leap Year");
                    }
                }    
                else {
                    System.out.println("Leap Year");
                }  
            }
            else {
                System.out.println("Not a Leap Year");
            }

    //     if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
    //      System.out.println("Specified year is a leap year");
    //   else
    //      System.out.println("Specified year is not a leap year");

    }
}