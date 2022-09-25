public class OOps {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        System.out.println(p1.color+" & "+p1.tip);
        p1.setColor("Green");
        p1.setTip(7);
        System.out.println(p1.color+" & "+p1.tip);
        
        // Bank Account
        BankAccount myAcc = new BankAccount();
        myAcc.setUsername("Anurag Kumar");
        myAcc.setPassword("abcd1234");
        System.out.println("Account Name - "+ myAcc.Username);
        // System.out.println(myAcc.password); // Can't access Passwor bcs it's Private
        // Using Getters to Acess private Objects
        System.out.println(myAcc.getPwd());


        //Constructor - Students
        Student s1= new Student();
        s1.pwd = "abcd";
        // Student s2 = new Student("Anurag Kumar");
        // Student s3 = new Student(218330012);
        // System.out.println(s1.name+"\n"+s2.name+"\n"+s3.roll);
        Student s4 = new Student(s1); // Using Copy Constructor to copy all properties of s1 in s4, to create a new pwd;
        s4.pwd = "1234";
    }
}
class Pen{
    String color="Blue";
    int tip=5;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip= newTip;
    }
}
class BankAccount{
    String Username;
    private String password;

    //Setters
    void setUsername(String name){
        Username = name;
    }
    void setPassword(String pwd){
        password = pwd;
    }

    // Getters
    String getPwd(){
        return this.password; // this refers to the object for which funtion is called or Current Object
    }
}
class Student{
    String name;
    int roll;
    String pwd;

    //Copy Constructor

    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
    }
    // Non - Parameterised Constructor
    Student(){
        System.out.println("Constructor is Called");
    }
    //Parameterised
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll=roll;
    }
}