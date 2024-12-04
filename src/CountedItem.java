class CountedItem extends PurchaseItem {
    private int quantity; // number of items

    // Constructor
    public CountedItem(String name, double unitPrice, int quantity) {
        super(name, unitPrice);
        this.quantity = quantity;
    }

    // Accessor and mutator for quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Override getPrice to calculate price based on quantity
    @Override
    public double getPrice() {
        return super.getUnitPrice() * quantity;
    }

    // Override toString
    @Override
    public String toString() {
        return super.toString() + " " + quantity + " units " + String.format("%.2f", getPrice()) + " SR";
    }
}