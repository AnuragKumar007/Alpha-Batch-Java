public class Inheritance {
    public static void main(String[] args) {
        Fish Tuna = new Fish();
        System.out.println("Tuna Fish");
        Tuna.attack= false;
        Tuna.eats();
        System.out.println("Attack "+Tuna.attack);
        Tuna.swim();
        System.out.println("Peacock");
        Bird Peacock = new Bird();
        Peacock.fly();
        Peacock.breathe();
        System.out.println("Cow");
        Cow jhumki = new Cow();
        jhumki.legs = 4;
        System.out.println(jhumki.legs+" legs");
        jhumki.gives();
    }
}
class Animal{
    String color;
    void eats(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
    boolean attack;
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
class Mammals extends Animal{
    int legs;
    String Type;
}
class Cow extends Mammals{
    void gives(){
        System.out.println("Milk");
    }
}