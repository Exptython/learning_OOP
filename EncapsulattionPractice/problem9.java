class Teacher{
    String name;
    String subject;

    public Teacher(String name,String subject){
        this.name=name;
        this.subject=subject;
    }
    public void DisplayInfo(){
        System.out.println("name: "+name);
        System.out.println("subject: "+subject);
    }
}
class Professor1 extends Teacher{
    String researchArea;

    Professor1(String name,String subject,String researchArea){
        super(name,subject);
    }

    public void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("Research Area: "+researchArea);
    }

}
class Assistant extends Teacher{
    int labHour;
    Assistant(String name,String subject, int labHour){
        super(name,subject);
        this.labHour=labHour;
    }
    public void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("labHour: "+labHour);
    }
}

public class problem9 {
    public static void main(String[] args) {
        Professor1 pf=new Professor1("wahab","oop","quantum");
        pf.DisplayInfo();

    }
}
