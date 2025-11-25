
class Parent{
    public void show(){
        System.out.println("parent.show()");
    }
}
interface I{
    default void sow (){
        System.out.println("I.show()");
    }
}
class Child extends Parent implements I{

}
public class Intermediate_Example {
    public static void main(String[] args) {
        Child c=new Child();
        c.show();

    }

}
