class Patient{
    String name;
    String symptoms;

    public Patient(String name,String symptoms){
        this.name=name;
        this.symptoms=symptoms;

    }
    public  void DisplayInfo(){
        System.out.println("Name: "+name);
        System.out.println("symptoms: "+symptoms);
    }
}
class Doctor{
    public void CheckPatient(Patient p) {
        System.out.println("patient name: " + p.name);
        System.out.println("Symptoms" + p.symptoms);
        if (p.symptoms.equalsIgnoreCase("fever")){
            System.out.println("advice, Take rest");
        }

    }
}

public class Problem5 {
    public static void main(String[] args) {
        Patient pt=new Patient("wahab","corona");
        Doctor d1=new Doctor();
        d1.CheckPatient(pt);
    }
}
