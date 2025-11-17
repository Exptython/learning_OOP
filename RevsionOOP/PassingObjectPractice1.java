
class Student{
    String name;
    int marks;

    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }

    public void DisplayInfo(){
        System.out.println("Student specs:");
        System.out.println("name: "+name);
        System.out.println("marks: "+marks);
    }
}

public class PassingObjectPractice1 {
    static void printStudent(Student s){
        s.DisplayInfo();
    }

    static Student createStudent(){
        return  new Student("ali",95);
    }

    public static void main(String[] args) {
        Student s1=new Student("wahab",88);
        printStudent(s1);
        Student s2=createStudent();
        s2.DisplayInfo();
    }
}
