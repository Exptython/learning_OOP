class Vehicle{
    void start(){
        System.out.println("vehicle starting..");
    }
}
class Car extends Vehicle{
    void start(){
        super.start();
        System.out.println("car engine Started..");
    }
}

public class Advanced_level {
    public static void main(String[] args) {
        Vehicle v1=new Car();
        v1.start();

    }
}
