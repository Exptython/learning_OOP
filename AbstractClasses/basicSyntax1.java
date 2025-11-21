abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks...");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("cat meow...");
    }
}
public class basicSyntax1 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        Animal b=new Cat();
        b.sound();


    }
}
