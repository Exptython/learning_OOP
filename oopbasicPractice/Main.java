class Car{
    String brand;
    String model;
    int year;

    public Car(String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    public void displayInfo(){
        System.out.println("car detail:");
        System.out.println("brand: "+brand);
        System.out.println("model: "+model);
        System.out.println("year: "+ year);

    }


}

public class Main {
    public static void main(String[] args) {
        Car car1=new Car("toyota","Corolla",2020);


    car1.displayInfo();




    }


}
