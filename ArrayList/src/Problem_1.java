
import java.util.ArrayList;

class Student{
    private int id;
    private String name;
    private double grade;

    public Student(int id ,String name ,double grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
    }
    public int getId(){
        return id;

    }
    public String getName(){
        return name;

    }
    public double getGrade(){
        return grade;
    }
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade=" + grade + "}";
    }

}public class Problem_1 {
    public static void main(String[] args) {

        ArrayList<Student>students=new ArrayList<>();
        students.add(new Student(101,"alice",85.5));
        students.add(new Student(102, "Bob", 72.0));

        System.out.println("-----All Students----");

        int searchID=103;
        System.out.println("---search for student id"+searchID);

        for (Student s :students){
            if (s.getId()==searchID){
                System.out.println("found:"+s);
                break;
            }
        }

    }
}
