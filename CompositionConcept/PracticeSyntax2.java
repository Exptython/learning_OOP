
class Heart{
    void beat(){
        System.out.println("heart is beating....");
    }
}
class Person{
    Heart heart=new Heart();

    void Live(){
        heart.beat();
        System.out.println("Person is alive..");
    }
}



public class PracticeSyntax2 {
    public static void main(String[] args) {
        Person person=new Person();
        person.Live();

    }
}
