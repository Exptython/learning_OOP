class person{
    String name;
    person(String name){
        this.name=name;
    }
}
class Employee1 extends person{
    int salary;

    Employee1(String name, int salary){
        super(name);
        this.salary=salary;
    }
    public void DisplayInfo(){
        System.out.println("name: "+name);
        System.out.println("salary: "+salary);
    }
}

public class problem2 {
    public static void main(String[] args) {
        Employee1 E1=new Employee1("wahab",550);

        E1.DisplayInfo();
    }

}
