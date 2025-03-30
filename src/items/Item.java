package items;

public abstract class Item {
    private int quantity;

    public Item(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("Quantity: %d", quantity);
    }
}
