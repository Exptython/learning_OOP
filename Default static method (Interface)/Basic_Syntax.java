
interface Greeter{
    void sayName(String name);

    default void greet(String name){
        System.out.println("Hello,"+name+"(from default greet)");
    }

    static String formatName(String first ,String last){
        return first+" "+last;
    }
}
class Person implements Greeter {
    public void sayName(String name) {
        System.out.println("my name " + name);
    }
}

public class Basic_Syntax {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.sayName(Greeter.formatName("Abdul","Wahab"));
        p1.greet("Abdul");
    }
}
