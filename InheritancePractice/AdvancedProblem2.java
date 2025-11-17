import java.sql.SQLOutput;

class person1{
    String name;
    int age;

    public person1(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void displayInfo(){
        System.out.println("----person Info:");
        System.out.println("Name: "+name);
        System.out.println("age:"+ age);

    }
}
class Student1 extends person1{
    String StudentID;
    String course;

    Student1(int age,String name,String StudentID,String course){

        super(name,age);
        this.course=course;
        this.StudentID=StudentID;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Student id: "+StudentID);
        System.out.println("course: "+course);

    }
}
class Teacher extends person1{
    String subject;
    int salary;

    Teacher (String name,int age, String subject,int salary){
        super (name,age);
        this.subject=subject;
        this.salary=salary;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("subject: "+subject);
        System.out.println("salary: "+salary);
    }
}

public class AdvancedProblem2 {
    public static void main(String[] args) {
        Student1 s1=new Student1(20,"ali","S123","computerScience");
        Teacher t1 = new Teacher("Mr. Khan", 45, "Java Programming", 90000);


        s1.displayInfo();
        t1.displayInfo();


    }

}
