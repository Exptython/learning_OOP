class Employee{
    String name;
    double salary;

    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public void DisplayInfo(){
        System.out.println("name: "+name);
        System.out.println("salary: "+salary);
    }
}
class Manager extends Employee{
    double bonus;

    public Manager(String name,double salary,double bonus){
        super(name,salary);
        this.bonus=bonus;
    }
    public void DisplayInfo1(){
        super.DisplayInfo();
        System.out.println("bonus: "+bonus);
    }
}

class Clerk extends Employee{
    int workhour;

    public Clerk(String name,double salary,int workhour){
        super(name,salary);
        this.workhour=workhour;
    }
    public void DisplayInfo2(){
        super.DisplayInfo();

        System.out.println("workhour: "+workhour);
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Manager mn=new Manager("wahab",25000,2500);
        mn.DisplayInfo1();
        Clerk cl=new Clerk("exp",28000,18);
        cl.DisplayInfo2();
    }

}
