
class Vehicle{
    String brand="toyota";
   public void start(){
        System.out.println("vehicle is starting.....");
    }
}
class car extends Vehicle{
    int seats=4;
    public void showDetail(){
        System.out.println("Brand: "+brand);
        System.out.println("Seats: "+seats);
    }
}



public class ExamplePractice {
    public static void main(String[] args) {

        car car2=new car();

        car2.start();
        car2.showDetail();

    }
}
