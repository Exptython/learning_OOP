import java.security.interfaces.DSAKey;

abstract class Employee{
    String name;
    double Salary;

    Employee(String name,double Salary){
        this.name=name;
        this.Salary=Salary;
    }
    abstract double calculateBonus();
}
class Manager extends Employee{
    Manager(String name,double Salary){
        super(name,Salary);
    }
    double calculateBonus(){
        return Salary*0.20;
    }
}
class Developer extends Employee{
    Developer (String name , double Salary){
        super(name,Salary);
    }
    double calculateBonus(){
        return Salary*0.30;
    }
}
class Salesperson extends Employee{
    Salesperson (String name,double Salary){
        super(name, Salary);

    }
    double calculateBonus(){
        return Salary*0.40;
    }
}




public class EmployeeBonusCalculator {
    public static void main(String[] args) {
       Employee E1=new Manager("Wahab",40000);
       E1.calculateBonus();
       Employee E2=new Developer("Sufi",300000);
       E2.calculateBonus();
       Employee E3=new Salesperson("Daniel",50000);
       E3.calculateBonus();

    }
}
