class WeighedItem extends PurchaseItem {
    private double weight;

    // Constructor
    public WeighedItem(String name, double unitPrice, double weight) {
        super(name, unitPrice);
        this.weight = weight;
    }

    // Accessor and mutator for weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Override getPrice to calculate price based on weight
    @Override
    public double getPrice() {
        return super.getUnitPrice() * weight;
    }

    // Override toString
    @Override
    public String toString() {
        return super.toString() + " " + weight + "Kg " + String.format("%.2f", getPrice()) + " SR";
    }
}
