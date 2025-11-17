class Laptop{
    String brand;
    String processor;
    int ram;

    public Laptop(String brand,String processor,int ram){
        this.brand=brand;
        this.processor=processor;
        this.ram=ram;
    }
    public Laptop(String brand, String processor){
        this.brand=brand;
        this.processor=processor;
    }
    public void DisplayInfo(){
        System.out.println("Laptop specs");
        System.out.println("brand: "+ brand);
        System.out.println("processor: "+processor);
        System.out.println("ram: "+ ram);
    }
}
public class IntermediateLevel {
    public static void main(String[] args) {
        Laptop laptop1=new Laptop("dell","RTX",125);
        Laptop laptop2=new Laptop("invidia","RTX100");

        laptop2.DisplayInfo();
        laptop1.DisplayInfo();
    }
}
