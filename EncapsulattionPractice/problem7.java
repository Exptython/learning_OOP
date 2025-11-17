
class car1{
    String model;
    String problem;

   public   car1(String model,String problem){
        this.model=model;
        this.problem=problem;
    }
    public void displayInfo(){
        System.out.println("model: "+model);
        System.out.println("problem: "+problem);
    }
}
class Mechanic{
    public void repairCar(car1 C){
        System.out.println("model name: "+C.model);
        System.out.println("problem: "+C.problem);
        System.out.println("Change the oil filter ");

    }
}

public class problem7 {
    public static void main(String[] args) {
        car1 cc=new car1("honda","oil filter change");
        cc.displayInfo();
        Mechanic mc=new Mechanic();
        mc.repairCar(cc);
    }
}
