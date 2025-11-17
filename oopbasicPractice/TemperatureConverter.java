
class Temperature{
    double celsius;

    public Temperature(double celsius){
        this.celsius=celsius;
    }
    public double temperature(){
        return(celsius*9/5)+32;
    }
    public void DisplayInfo(){
        System.out.println(celsius+"C ="+temperature()+"F");
    }
}


public class TemperatureConverter {
    public static void main(String[] args) {
        Temperature temp=new Temperature(25);
        temp.DisplayInfo();
    }
}
