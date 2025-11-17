class Employee{
    String name;
    Employee(String name){
        this.name=name;
    }
}

class Manager extends Employee{
    double bonus;
    Manager(String name,double bonus){
        super(name);
        this.bonus=bonus;
    }
    void displayInfo() {
        // overriding parent displayInfo() method
        System.out.println("Manager Name: " + name);
        System.out.println("Bonus: " + bonus);
    }
}



public class ExamplePractice3 {
    public static void main(String[] args) {
        Manager e1=new Manager("Ahmed",5000);

        e1.displayInfo();
    }
}
