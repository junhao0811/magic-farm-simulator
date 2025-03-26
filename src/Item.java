public abstract class Item {
    private int quantity;

    public Item() {
        this.quantity = 0;
    }

    @Override
    public String toString() {
        return String.format("Quantity: %d", quantity);
    }
}
