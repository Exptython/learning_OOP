class Vehicle1{
    String brand;

    Vehicle1(String brand){
        this.brand=brand;

    }
    public void showVehicleInfo(){
        System.out.println("Brand: "+brand);
    }
}
class Car1 extends Vehicle1{
    String model;

    Car1(String brand, String model) {
        super(brand); // calls Vehicle's constructor
        this.model = model;
    }

    void showCarInfo() {
        // call parent info + add its own
        showVehicleInfo();
        System.out.println("Model: " + model);
    }

}
class ElectricCar extends Car1 {
    int batteryCapacity; // in kWh

    ElectricCar(String brand, String model, int batteryCapacity) {
        super(brand, model); // calls Car’s constructor
        this.batteryCapacity = batteryCapacity;
    }

    void showElectricCarInfo() {
        // call Car info + add its own
        showCarInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}



public class AdvancedProblem3 {
    public static void main(String[] args) {
        ElectricCar e1 = new ElectricCar("Tesla", "Model S", 100);

        System.out.println("--- Electric Car Details ---");
        e1.showElectricCarInfo();
    }
}
