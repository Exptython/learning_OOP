class Flight {
    int flightNumber;
    String destination;
    double ticketPrice;

    // Constructor with an extra parameter for business class
    public Flight(int flightNumber, String destination, double ticketPrice, boolean isBusinessClass) {
        this.flightNumber = flightNumber;
        this.destination = destination;

        // If it's business class, add 30% extra
        if (isBusinessClass) {
            this.ticketPrice = ticketPrice + (ticketPrice * 0.30);
        } else {
            this.ticketPrice = ticketPrice;
        }
    }

    // Method to display flight info
    public void displayInfo() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Ticket Price: $" + ticketPrice);
        System.out.println("-----------------------------------");
    }
}

public class FlightBooking {
    public static void main(String[] args) {
        // Economy ticket (default price)
        Flight economy = new Flight(101, "Dubai", 50000, false);

        // Business ticket (30% extra)
        Flight business = new Flight(101, "Dubai", 50000, true);

        System.out.println("Economy Class Ticket:");
        economy.displayInfo();

        System.out.println("Business Class Ticket:");
        business.displayInfo();
    }
}
