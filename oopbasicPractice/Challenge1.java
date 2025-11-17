
class Student{
    String name;
    int rollNo;
    int age;
    int bornYear;

    public Student(String name,int rollNo,int age,int bornYear){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
        this.bornYear=bornYear;
    }
    public void displayInfo(){
        System.out.println("Students detail:");
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("bornYear: "+bornYear);
        System.out.println("RollNo: "+rollNo);
    }

}

public class Challenge1 {
    public static void main(String[] args) {
        Student[] students=new Student[5];
        students[0]=new Student("Abdul",22,19,2026);
        students[1]=new Student("sufi",24,29,2025);
        students[2]=new Student("Ali",26,24,2024);
        students[3]=new Student("Ahmed",28,14,2023);
        students[4]=new Student("wahab",29,15,2022);

        System.out.println("------Student detail-----");
        for (int i=0;i<students.length;i++){
            students[i].displayInfo();
        }







    }
}
