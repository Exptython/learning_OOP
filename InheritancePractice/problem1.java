class Animal{
    public void eat(){
        System.out.println("Eating ....");
    }

}
class Dog extends Animal{
    public void bark(){
        System.out.println("dog is barking..");
    }
}
public class problem1 {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.bark();
        dog1.eat();
    }



}
