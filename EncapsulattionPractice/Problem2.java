class Professor{
    String name;
    String subject;

    public Professor(String name,String subject){
        this.name=name;
        this.subject=subject;
    }
    public void DisplayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Subject: "+subject);
    }

}
class University{
    String universityName;

    University(String universityName){
        this.universityName=universityName;
    }
    public void AppointProfessor(Professor p){
        System.out.println("university: "+universityName);
        System.out.println("Appointing new professor....");
        System.out.println("Professor Name: "+p.name);
        System.out.println("Subject: "+p.subject);
        System.out.println("Appointment confirmed");
    }

}

public class Problem2 {
    public static void main(String[] args) {
        Professor p1=new Professor("wahab","AI");
        University u1=new University("Comsat isl");

        u1.AppointProfessor(p1);
    }
    }