
class Appliance{
    String brand;
    int power;

    public Appliance (String brand,int power){
        this.brand=brand;
        this.power=power;
    }
    public void DisplayInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("power: "+power);
    }
}
class WashingMachine extends Appliance{

    WashingMachine(String brand,int power){
       super(brand, power);
    }
    void washClothes(){
        System.out.println(brand+"washing machine is washing....");

    }
}
class Refrigerator extends Appliance{
    Refrigerator(String brand,int power){
        super(brand,power);
    }
    void keepCold(){
        System.out.println(brand+"refrigerator is keeping fod cold");
    }
}

public class problem3 {
    public static void main(String[] args) {

        WashingMachine wm=new WashingMachine("haier",2000);
        wm.DisplayInfo();
        wm.washClothes();

        Refrigerator rf=new Refrigerator("dawlence",16600);
        rf.DisplayInfo();
        rf.keepCold();

    }
}

