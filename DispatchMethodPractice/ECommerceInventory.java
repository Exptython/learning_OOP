import java.util.Arrays;

// Base class with encapsulation
class Product {
    private String productId;
    private String name;
    private double price;
    private int stock;

    // Constructor overloading
    public Product(String productId, String name) {
        this(productId, name, 0.0, 0);
    }

    public Product(String productId, String name, double price) {
        this(productId, name, price, 0);
    }

    public Product(String productId, String name, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Encapsulated getters/setters
    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    // Method to be overridden - Dynamic Dispatch
    public double calculateDiscount() {
        return 0.0; // No discount by default
    }

    // Method overloading - Static Dispatch
    public void updateStock(int newStock) {
        this.stock = newStock;
        System.out.println(name + " stock updated to: " + newStock);
    }

    public void updateStock(int newStock, String reason) {
        this.stock = newStock;
        System.out.println(name + " stock updated to: " + newStock + " - Reason: " + reason);
    }

    public void displayInfo() {
        System.out.println("ID: " + productId + ", Name: " + name +
                ", Price: $" + price + ", Stock: " + stock);
    }
}

// Electronics product with special discount
class Electronics extends Product {
    private int warrantyMonths;

    public Electronics(String productId, String name, double price, int stock, int warrantyMonths) {
        super(productId, name, price, stock);
        this.warrantyMonths = warrantyMonths;
    }

    // Dynamic Dispatch - Method overriding
    @Override
    public double calculateDiscount() {
        // Electronics get 15% discount if warranty > 12 months
        return warrantyMonths > 12 ? getPrice() * 0.15 : getPrice() * 0.05;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty: " + warrantyMonths + " months, Discount: $" + calculateDiscount());
    }
}

// Clothing product with seasonal discount
class Clothing extends Product {
    private String size;
    private String season;

    public Clothing(String productId, String name, double price, int stock, String size, String season) {
        super(productId, name, price, stock);
        this.size = size;
        this.season = season;
    }

    // Dynamic Dispatch - Method overriding
    @Override
    public double calculateDiscount() {
        // Clothing gets 30% discount if out of season
        double discount = getPrice() * 0.10; // Default 10%
        if (isOutOfSeason()) {
            discount = getPrice() * 0.30; // 30% for out of season
        }
        return discount;
    }

    private boolean isOutOfSeason() {
        String currentSeason = "Winter"; // Simulating current season
        return !season.equalsIgnoreCase(currentSeason);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size: " + size + ", Season: " + season +
                ", Discount: $" + calculateDiscount());
    }
}

// Grocery product with expiry-based discount
class Grocery extends Product {
    private int daysToExpiry;

    public Grocery(String productId, String name, double price, int stock, int daysToExpiry) {
        super(productId, name, price, stock);
        this.daysToExpiry = daysToExpiry;
    }

    // Dynamic Dispatch - Method overriding
    @Override
    public double calculateDiscount() {
        // Higher discount for items close to expiry
        if (daysToExpiry <= 2) return getPrice() * 0.50;
        else if (daysToExpiry <= 5) return getPrice() * 0.25;
        else return getPrice() * 0.05;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Days to expiry: " + daysToExpiry + ", Discount: $" + calculateDiscount());
    }
}

public class ECommerceInventory {
    public static void main(String[] args) {
        // Creating array of products - Using polymorphism
        Product[] inventory = {
                new Electronics("E001", "Smartphone", 699.99, 50, 24),
                new Clothing("C001", "Winter Jacket", 89.99, 100, "M", "Winter"),
                new Clothing("C002", "Summer Dress", 49.99, 75, "S", "Summer"),
                new Grocery("G001", "Organic Milk", 4.99, 200, 3),
                new Electronics("E002", "Laptop", 999.99, 30, 12),
                new Grocery("G002", "Bread", 2.99, 150, 1)
        };

        // Problem 1: Calculate total inventory value with discounts
        System.out.println("=== INVENTORY ANALYSIS ===");
        double totalValue = 0;
        double totalDiscountValue = 0;

        for (Product product : inventory) {
            product.displayInfo();
            totalValue += product.getPrice() * product.getStock();
            totalDiscountValue += (product.getPrice() - product.calculateDiscount()) * product.getStock();
        }

        System.out.println("\nTotal Inventory Value: $" + totalValue);
        System.out.println("Total Value After Discount: $" + totalDiscountValue);
        System.out.println("Total Discount Amount: $" + (totalValue - totalDiscountValue));

        // Problem 2: Find products that need restocking
        System.out.println("\n=== RESTOCK ALERTS ===");
        for (Product product : inventory) {
            if (product.getStock() < 20) {
                System.out.println("LOW STOCK: " + product.getName() + " - Only " +
                        product.getStock() + " left!");
            }
        }

        // Problem 3: Apply bulk discount for specific categories
        System.out.println("\n=== BULK DISCOUNT ANALYSIS ===");
        applyBulkDiscount(inventory, "Electronics", 0.10); // Extra 10% for electronics

        // Problem 4: String processing - Generate product codes
        System.out.println("\n=== PRODUCT CODES ===");
        generateProductCodes(inventory);
    }

    // Using arrays and loops with dynamic dispatch
    public static void applyBulkDiscount(Product[] products, String category, double extraDiscount) {
        for (Product product : products) {
            if (product.getClass().getSimpleName().equalsIgnoreCase(category)) {
                double originalPrice = product.getPrice();
                double discountedPrice = originalPrice - (originalPrice * extraDiscount);
                System.out.println("Bulk discount applied to " + product.getName() +
                        ": $" + originalPrice + " → $" + discountedPrice);
            }
        }
    }

    // String manipulation with arrays
    public static void generateProductCodes(Product[] products) {
        String[] generatedCodes = new String[products.length];

        for (int i = 0; i < products.length; i++) {
            String name = products[i].getName();
            String category = products[i].getClass().getSimpleName();

            // Create code: First 3 letters of category + First 2 letters of name + index
            String code = category.substring(0, 3).toUpperCase() +
                    name.replace(" ", "").substring(0, Math.min(2, name.length())).toUpperCase() +
                    i;

            generatedCodes[i] = code;
            System.out.println(products[i].getName() + " → Code: " + code);
        }
    }
}