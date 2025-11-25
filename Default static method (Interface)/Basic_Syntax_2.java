

interface A{
    default void hello(){
        System.out.println("hello from A");
    }
}
interface B{
    default void hello(){
        System.out.println("Hellloo From B");
    }
}
class C implements A,B{
    public void hello(){
        A.super.hello();
        B.super.hello();
        System.out.println("hello from C(resolved)");
    }
}

public class Basic_Syntax_2 {
    public static void main(String[] args) {
        C c1=new C();
        c1.hello();
    }
}
