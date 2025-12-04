
class Engine{
    void start(){
        System.out.println("Engine Started..");
    }
}

class ElectricEngine extends Engine{
    void start(){
        System.out.println("Electric engine started");
    }
}

class Car1{
    Engine engine;
    Car1(Engine engine){
        this.engine=engine;
    }
    void startCar(){
        engine.start();
    }
}
public class Poly_Composition {
    public static void main(String[] args) {
        Car1 ev=new Car1(new ElectricEngine());
        Car1 petrol =new Car1(new Engine());

        ev.startCar();
        petrol.startCar();
    }
}
