package farm;

import items.Item;

import java.util.List;
import java.util.ArrayList;

/**
 * Farmer class is a class that represents the main character of the game
 *
 * @author Chong Jun Hao
 * @version 22.0.1
 */
public class Farmer {
    
    private List<Item> inventory;
    private int xp;
    
    /**
     * A constructor for the Farmer class
     */
    public Farmer() {
        this.inventory = new ArrayList<>();
    }
    
    /**
     * Adds item to the farmer's inventory.
     *
     * @param item the item to be added to the inventory
     */
    public void addItemToInventory(Item item) {
        inventory.add(item);
    }
    
    /**
     * A getter for all the items from the farmer's inventory
     *
     * @return List<Item> a list of Items collected by the farmer
     */
    public List<Item> getItemsFromInventory() {
        return inventory;
    }
    
    /**
     * Remove item from the farmer's inventory.
     *
     * @param item the item to be removed from the inventory
     */
    public void removeItemFromInventory(Item item) {
        inventory.remove(item);
    }
    
    /**
     * Lists out all farmer's inventory items.
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
     *
     * @param amount an int representing the amount of XP the farmer has gained
     */
    public void increaseXp(int amount) {
        xp += amount;
    }
    
    /**
     * XP state check method to verify completion conditions
     *
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
