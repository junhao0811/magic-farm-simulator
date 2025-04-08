package items;

import capabilities.Sellable;

/**
 * The type Item.
 */
public abstract class Item implements Sellable {
    
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
    public void sell() {
        System.out.println(toString() + "has been sold!");
        System.out.println("Attempt to sell is successful!");
    }
    
    @Override
    public String toString() {
        return String.format("Quantity: %d", quantity);
    }
}
