public class Abstraction {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
    }
}
abstract class Animal{
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
    String color;
    Animal(){ // Constructor for Initializing Color
        System.out.println("Animal Constructor Called");
         color = "Brown";
    }
}
class Horse extends Animal{
    void walk(){
        System.out.println("with 4 legs");
    }
    void changeColor(){
        color = "White";
    }
    Horse(){
        System.out.println("Horse Constructor Called");
    }
}
