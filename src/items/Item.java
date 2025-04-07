package items;

/**
 * The type Item.
 */
public abstract class Item {
    
    private int quantity;
    
    /**
     * Instantiates a new Item.
     *
     * @param quantity the quantity
     */
    public Item(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return String.format("Quantity: %d", quantity);
    }
}
