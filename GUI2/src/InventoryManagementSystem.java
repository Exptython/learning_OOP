public class InventoryManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== ADVANCED: INVENTORY MANAGEMENT SYSTEM ===");

        // Data Structures using basic variables and data types
        String[] products = {"Laptop", "Mouse", "Keyboard", "Monitor", "Headphones"};
        double[] prices = {999.99, 25.50, 75.00, 299.99, 89.95};
        int[] quantities = {15, 100, 45, 30, 60};
        int[] reorderLevels = {5, 20, 10, 8, 15};

        // Variables for tracking
        String[] lowStockItems = new String[products.length];
        int lowStockCount = 0;
        double totalInventoryValue = 0.0;

        // Operators and Control Flow for inventory analysis
        System.out.println("\n--- CURRENT INVENTORY STATUS ---");
        int i = 0;
        while (i < products.length) {
            double productValue = prices[i] * quantities[i];
            totalInventoryValue += productValue;

            // If/else for stock alerts
            if (quantities[i] <= reorderLevels[i]) {
                lowStockItems[lowStockCount] = products[i];
                lowStockCount++;
                System.out.println("⚠️  LOW STOCK: " + products[i] + " - Only " + quantities[i] +
                        " left (Reorder at: " + reorderLevels[i] + ")");
            } else if (quantities[i] > reorderLevels[i] * 3) {
                System.out.println("✅ Good Stock: " + products[i] + " - " + quantities[i] + " units");
            } else {
                System.out.println("📊 Normal: " + products[i] + " - " + quantities[i] + " units");
            }

            i++;
        }

        // Inventory calculations using operators
        System.out.println("\n--- FINANCIAL SUMMARY ---");
        System.out.printf("Total Inventory Value: $%.2f%n", totalInventoryValue);

        // Restocking simulation
        System.out.println("\n--- RESTOCKING SIMULATION ---");
        double restockBudget = 2000.0;
        double currentBudget = restockBudget;

        int j = 0;
        while (j < lowStockCount && currentBudget > 0) {
            int k = 0;
            while (k < products.length) {
                if (products[k].equals(lowStockItems[j])) {
                    int unitsToRestock = reorderLevels[k] * 2 - quantities[k];
                    double restockCost = unitsToRestock * prices[k];

                    if (restockCost <= currentBudget) {
                        quantities[k] += unitsToRestock;
                        currentBudget -= restockCost;
                        System.out.printf("🔄 Restocked %d %s for $%.2f%n",
                                unitsToRestock, products[k], restockCost);
                    } else {
                        // Calculate max affordable units
                        int maxUnits = (int)(currentBudget / prices[k]);
                        if (maxUnits > 0) {
                            quantities[k] += maxUnits;
                            currentBudget -= maxUnits * prices[k];
                            System.out.printf("💰 Partial restock: %d %s for $%.2f%n",
                                    maxUnits, products[k], maxUnits * prices[k]);
                        }
                    }
                    break;
                }
                k++;
            }
            j++;
        }

        System.out.printf("Remaining budget: $%.2f%n", currentBudget);

        // Final inventory display
        System.out.println("\n--- UPDATED INVENTORY ---");
        int m = 0;
        while (m < products.length) {
            System.out.println(products[m] + ": " + quantities[m] + " units");
            m++;
        }
    }
}
