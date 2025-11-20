class Engine{
    public void StartEngine(){
        System.out.println("Engine is starting...");
    }
}
class Car{
    Engine engine;

    Car(){
        engine=new Engine();
    }
    public void StartCar(){
        System.out.println("car is staring...");
        engine.StartEngine();
    }
}
public class PracticeSyntax {
    public static void main(String[] args) {
        Car car=new Car();
        car.StartCar();
    }
}
