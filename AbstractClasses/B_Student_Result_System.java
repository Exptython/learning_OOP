abstract class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    abstract String calculateResult();
}

class RegularStudent extends Student {

    RegularStudent(String name, int marks) {
        super(name, marks);
    }

    @Override
    String calculateResult() {
        if (marks >= 50) {
            return name + " (Regular) Passed";
        } else {
            return name + " (Regular) Failed";
        }
    }
}

class OnlineStudent extends Student {

    OnlineStudent(String name, int marks) {
        super(name, marks);
    }

    @Override
    String calculateResult() {
        if (marks >= 40)
            return name + " (Online) Passed";
        else
            return name + " (Online) Failed";
    }
}

public class B_Student_Result_System {
    public static void main(String[] args) {

        Student s1 = new RegularStudent("Ali", 55);
        Student s2 = new OnlineStudent("Sara", 38);

        System.out.println(s1.calculateResult());
        System.out.println(s2.calculateResult());
    }
}
