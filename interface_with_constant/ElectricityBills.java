
interface  Electricity{
    double UnitRate=34;
    double calculateBill();
}

class Bill implements Electricity{

    String customerName;
     int units;

    Bill (String customerName,int units){
        this.customerName=customerName;
        this.units=units;
    }


    public double calculateBill(){

        return units*UnitRate;
    }
    public void displayBill() {
        System.out.println("Customer: " + customerName);
        System.out.println("Units: " + units);
        System.out.println("Rate per Unit: " + UnitRate);
        System.out.println("Total Bill: " + calculateBill());
    }
}




public class ElectricityBills {

    public static void main(String[] args) {
        Bill b=new Bill("ali ",250);
        b.displayBill();

    }
}
