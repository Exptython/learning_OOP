class Car{
    String model;
    int price;

    public Car(String model,int price){
        this.model=model;
        this.price=price;
    }
    public void DisplayInfo() {
        System.out.println("model: " + model);
        System.out.println("price: " + price);
    }
}

public class Problem5 {
    static Car CreateCar(String model,int price){
        Car c=new Car(model,price);
        return c;
    }

    public static void main(String[] args) {
        Car car1=CreateCar("Toyota",120000);
        car1.DisplayInfo();
    }
}
