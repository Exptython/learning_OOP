interface FlightCharges {
    double GST = 18;
    double Service_charges = 500;
    double calculateFare(double baseFare);
}

class FlightBook implements FlightCharges {

    @Override
    public double calculateFare(double baseFare) {
        double gstAmount = (baseFare * GST) / 100;
        double finalFare = baseFare + gstAmount + Service_charges;

        return finalFare;
    }
}

public class FlightBooking {
    public static void main(String[] args) {

        FlightBook booking = new FlightBook();

        double baseFare = 10000;
        double finalFare = booking.calculateFare(baseFare);

        System.out.println("Base Fare: " + baseFare);
        System.out.println("GST (18%): " + (baseFare * FlightCharges.GST) / 100);
        System.out.println("Service Charge: " + FlightCharges.Service_charges);
        System.out.println("Final Flight Fare: " + finalFare);
    }
}
