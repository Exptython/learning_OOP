
class pilot{
    String name;
    int age;

    pilot(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void displayInfo(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}
class Airplane{
    public void TakeOver(pilot p){
        System.out.println("pilot is ready to take over");
    }
}

public class problem11 {
    public static void main(String[] args) {
        pilot py=new pilot("wahab",10);
        py.displayInfo();
        Airplane ai=new Airplane();
        ai.TakeOver(py);
    }
}
