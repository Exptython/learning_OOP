interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class Duck implements Flyable,Swimmable{
    public void fly(){
        System.out.println("Duck flies...");
    }
    public void swim(){
        System.out.println("Duck swims...");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Flyable d=new Duck();
        d.fly();
        Swimmable s=new Duck();
        s.swim();
    }
}
