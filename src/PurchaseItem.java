public class PurchaseItem {
    private String name;
    private double unitPrice;

    // Default constructor
    public PurchaseItem() {
        this("no item", 0.0);
    }

    // Parameterized constructor
    public PurchaseItem(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    // Accessor and mutator methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Accessor and mutator methods for unitPrice
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Method to get price
    public double getPrice() {
        return unitPrice;
    }

    // toString method
    @Override
    public String toString() {
        return name + " @ " + unitPrice;
    }
}