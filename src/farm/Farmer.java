package farm;

import items.Item;

import java.util.List;
import java.util.ArrayList;

/**
 * The type Farmer.
 */
public class Farmer {
    
    private List<Item> inventory;
    
    /**
     * Instantiates a new Farmer.
     */
    public Farmer() {
        this.inventory = new ArrayList<>();
    }
    
    /**
     * Add item to inventory.
     *
     * @param item the item
     */
    public void addItemToInventory(Item item) {
        inventory.add(item);
    }
    
    /**
     * List inventory items.
     */
    public void listInventoryItems() {
        System.out.println("Farmer's inventory now hold the following items");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.printf("( %d ) %s\n", i + 1, inventory.get(i).toString());
        }
        System.out.println("-----------------------END-----------------------");
    }
}
