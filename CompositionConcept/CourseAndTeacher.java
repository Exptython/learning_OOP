class Person2 {
    String name;

    Person2(String name) {
        this.name = name;
    }
}
    class Teacher1 extends Person2{
        Teacher1(String name){
            super(name);

        }
    }
    class Course{
    String title;
    Teacher1 teacher;

    Course(String title,Teacher1 teacher){
        this.title=title;
        this.teacher=teacher;
    }
        void showCourse() {
            System.out.println(title + " is taught by " + teacher.name);
        }
    }







public class CourseAndTeacher {
    public static void main(String[] args) {
        Teacher1 t1=new Teacher1("Umair hassan");
        Course c1=new Course("java",t1);
        c1.showCourse();
    }
}
