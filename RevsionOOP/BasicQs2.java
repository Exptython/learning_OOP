
class Employee{
    private String name;
    private String employeeId;

    public Employee(String name,String employeeID) {
        this.name = name;
        this.employeeId = employeeID;
    }
    public String getName(){
        return name;
    }
    public String getEmployeeId(){
        return employeeId;
    }
    public void DisplayInfo(){
        System.out.println("=====Employee Detail====");
        System.out.println("name: "+name);
        System.out.println("EmployeeId: "+employeeId);
    }
}

class SalariedEmployee extends Employee{
    private double salary;
   ;

    public SalariedEmployee(String name,String employeeId,double salary){
        super(name,id);
        this.salary=salary;

    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double calculatePay(){
        return  salary;
    }
    public void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("salary of a month: "+ salary);
    }

}
class HourEmployee extends Employee{
    private double hourly;
    private double hourWorked;


    public HourEmployee(String name,String employeeId , double hourly,double hourWorked){
        super(name,employeeId);
        this.hourly=hourly;
        this.hourWorked=hourWorked;
    }
    public double getHourly() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hourWorked;
    }

    // Setters
    public void setHourlyRate(double hourly) {
        this.hourly = hourly;
    }

    public void setHoursWorked(double hourWorked) {
        this.hourWorked = hourWorked;
    }
    public double calculatePay(){
        double regularHour=Math.min(hourWorked,40);
        double overTimeHour=Math.min(hourWorked-40,0);
        double overTimeRate=hourly*1.5;
        return (regularHour*hourly)+(overTimeHour*overTimeRate);
    }
    public  void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("hours: "+hourly+ "/hr"+hourWorked);
    }
}
public class BasicQs2 {
    public static void main(String[] args) {
        Employee[] emp=new Employee[4];
        emp[0]=new Employee("john","6688I",5000.0);
    }
}
