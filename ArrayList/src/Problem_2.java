
import java.util.ArrayList;

class Product{
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("%-15s $%-8.2f %-5d $%-8.2f",
                name, price, quantity, getTotalPrice());
    }
}

public class Problem_2 {
    public static void main(String[] args) {
        ArrayList<Product>carts=new ArrayList<>();
        carts.add(new Product("laptop",999.9,1));
        carts.add(new Product("Mouse", 25.50, 2));
        carts.add(new Product("Keyboard", 45.75, 1));
        carts.add(new Product("Monitor", 199.99, 1));

        System.out.println("=== SHOPPING CART ===");
        System.out.println("Item           Price     Qty    Total");
        System.out.println("--------------------------------------");

        double grandTotal=0;
        for (Product p:carts){
            System.out.println(p);
            grandTotal+=p.getTotalPrice();

        }
        System.out.println("--------------------------------------");
        System.out.printf("Grand Total: $%.2f\n", grandTotal);










    }
}
