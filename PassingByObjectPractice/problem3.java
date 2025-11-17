class Student{
    int marks;
    String name;

    public Student(int marks,String name){
        this.marks=marks;
        this.name=name;
    }
    public void DisplayInfo(){
        System.out.println("marks: "+marks);
        System.out.println("name: "+name);
    }
}

public class problem3 {
    static Student AssigningMarks(int marks,String name){
        Student s=new Student(marks,name);
        return s;
    }

    public static void main(String[] args) {
        Student s1=AssigningMarks(90,"wahab");
        s1.DisplayInfo();

    }
}
