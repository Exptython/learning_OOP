

class UniversityMember{
    private String memberID;
    private String name;
    private String email;

    UniversityMember(String memberID,String name,String email){
        this.memberID=memberID;
        this.name=name;
        this.email=email;
    }
    public String getMemberID(){
        return memberID;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setMemberID(String memberID){
        this.memberID=memberID;

    }
    public void setName(String name){
        this.name=name;

    }
    public void setEmail(String email){
        this.email=email;
    }
}

class Student extends UniversityMember{
    private String program;
    private int semster;
    private double CGPA;
    private  double initialFee;

    Student(String memberID,String name,String email,String program ,int semster,double CGPA,double initialFee){
        super(memberID,name,email);
        this.program=program;
        this.semster=semster;
        this.CGPA=CGPA;
        this.initialFee=initialFee;
    }
    public String getProgram(){
        return program;
    }
    public int getSemster(){
        return semster;
    }
    public double getCGPA(){
        return  CGPA;
    }
    public double getInitialFee(){
        return initialFee;
    }
    public void setProgram(String program){
        this.program=program;
    }
    public void setSemster(int semster){
        this.semster=semster;
    }
    public void setCGPA(double CGPA){
        this.CGPA=CGPA;
    }
    public void setInitialFee(double initialFee){
        this.initialFee=initialFee;
    }

    public void calculateFee(){
        System.out.println("======full detail--------");
        System.out.println("MemberId"+getMemberID());
        System.out.println("name"+getName());
        System.out.println("email"+getEmail());
        System.out.println("program"+getProgram());
        System.out.println("semster"+getSemster());
        System.out.println("CGPA"+getCGPA());
        System.out.println("initialFee"+getInitialFee());
    }
}
class ScholarShipStudent extends Student{
    private double scholarshipAmount;

    ScholarShipStudent(String numberID, String name,String email,String program , int semster, double CGPA,double initialFee,double scholarshipAmount){
        super(numberID,name,email,program,semster,CGPA,initialFee);
        this.scholarshipAmount=scholarshipAmount;

    }
    public double getScholarshipAmount(){
        return scholarshipAmount;
    }
    public void setScholarshipAmount(double scholarshipAmount){
        this.scholarshipAmount=scholarshipAmount;
    }
    public double AfterScholarShip(){
        double total=getInitialFee()-getScholarshipAmount();
        return total;
    }
    public void calculateFee(){
        super.calculateFee();
        System.out.println("your total amount after Scholarship:"+AfterScholarShip());
    }
}
class Teacher extends UniversityMember{
    private String department;
    private String designation;
    private double salary;

    Teacher (String numberID,String name,String email,String department,String designation,double salary){
        super(numberID,name,email);
        this.department=department;
        this.designation=designation;
        this.salary=salary;
    }
    public String getDepartment(){
        return department;
    }
    public String getDesignation(){
        return designation;
    }
    public double getSalary(){
        return salary;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double AddBonus(){
        double Bonus=getSalary()*(100/30);
        return Bonus;
    }
    public void calculateSalary(){
        System.out.println("======Teacher detail====");
        System.out.println("memberID"+getMemberID());
        System.out.println("Name"+getName());
        System.out.println("email"+getEmail());
        System.out.println("department"+getDepartment());
        System.out.println("designation"+getDesignation());
        System.out.println("salary"+getSalary());
        System.out.println("salary after bonus(Eid special)"+AddBonus());
    }
}

class AdminStaff extends UniversityMember{
    private String office;
    private double workingHours;

    AdminStaff(String numberID, String name,String email,String office ,double workingHours){
        super(numberID,name,email);
        this.office=office;
        this.workingHours=workingHours;
    }
    public String getOffice(){
        return office;
    }
    public double getWorkingHours(){

        return workingHours;
    }
    public void setOffice(String office){
        this.office=office;
    }
    public void setWorkingHours(double workingHours){
        this.workingHours=workingHours;
    }
    public double calculateSalary(){

        return getWorkingHours()+30*100;
    }
    public void DetailedInfo(){
        System.out.println("=====Admin office====");
        System.out.println("memberID"+getMemberID());
        System.out.println("name"+getName());
        System.out.println("email"+getEmail());
        System.out.println("office"+getOffice());
        System.out.println("working hour in one day"+getWorkingHours());
        System.out.println("your salary"+calculateSalary());
    }
}

public class Problem_1 {
    public static void main(String[] args) {
        Student s1=new Student("SP25-Bcs-042","Abdul wahab","exptython123@gmail.com","Computer science",2,3.23,135000);
        s1.calculateFee();
        ScholarShipStudent s2=new ScholarShipStudent("Sp25-BCs-042","mohavia","exptython123@gmail.com","Software Engineer",3,3.76,135000,30000);
        s2.calculateFee();
        Teacher t1=new Teacher("A1234","Babar","babar@gmail.com","AI","attock",250000);
        t1.AddBonus();
        t1.calculateSalary();
        AdminStaff A1=new AdminStaff("1234AA","iqrar","amu@gmail.com","clerk",13);
        A1.calculateSalary();
        A1.DetailedInfo();

    }
}
