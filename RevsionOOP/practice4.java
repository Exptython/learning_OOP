class Employee{
    String name;
    double salary;

    Employee ( String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    void DisplayInfo(){
        System.out.println("name: "+name);
        System.out.println("salary: "+salary);
    }
}

public class practice4 {
    static Employee promote(EMployee e){
        if (e.salary <50000) {
            return new Employee(e.name, e.salary + 10000);
        else
            return e;
        }
    }

    public static void main(String[] args) {
        Employee emp1=new Employee("wahab",40000);
        Employee emp2=promote(emp1);
        emp2.DisplayInfo();

    }
}
