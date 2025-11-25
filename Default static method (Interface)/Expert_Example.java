
interface A1{
    default void describe(){
        System.out.println("this is a Description..");
    }

}
interface B2{
    default void describe(){
        System.out.println("This is B's description..");
    }
}
class D4 implements A1,B2{
    public void describe(){
        A1.super.describe();
        B2.super.describe();
    }
}



public class Expert_Example {
    public static void main(String[] args) {
        D4 obj =new D4();
        obj.describe();
    }
}
