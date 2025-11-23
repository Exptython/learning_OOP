
interface TrafficRules{
    int SpeedLimit=120;
    void checkSpeed(int speed);
}
class car implements TrafficRules{
    public void checkSpeed(int speed){
        System.out.println("car seed: "+speed+"km/h");
        System.out.println("Speed Limit:"+SpeedLimit+"km/h");

        if (speed<=SpeedLimit){
            System.out.println("status:safe Driving");

        }else {
            System.out.println("status: Over speeding,you have a challan of 2000Rs");
        }
    }
}


public class TrafficRule {
    public static void main(String[] args) {
        car car1=new car();

        car1.checkSpeed(300);
    }
}
