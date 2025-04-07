package farm;

import items.Item;

import java.util.List;
import java.util.ArrayList;

/**
 * The type Farmer.
 */
public class Farmer {
    
    private List<Item> inventory;
    private int xp;
    
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
    
    /**
     * Increases XP for different actions
     * @param amount an int representing the amount of XP the farmer has gained
     */
    public void increaseXp(int amount) {
        xp += amount;
    }
    
    /**
     * XP state check method to verify completion conditions
     * @return true if the farmer reaches/exceeds 100 XP; false otherwise
     */
    public boolean hasMetXpRequirement() {
        return xp >= 100;
    }
    
    @Override
    public String toString() {
        return String.format("Farmer [Experience: %d out of 100]", xp);
    }
}
