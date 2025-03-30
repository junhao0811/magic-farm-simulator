package farm;

import items.Item;

import java.util.List;
import java.util.ArrayList;

public class Farmer {
    private List<Item> inventory;

    public Farmer() {
        this.inventory = new ArrayList<>();
    }

    public void addItemToInventory(Item item) {
        inventory.add(item);
    }

    public void listInventoryItems() {
        System.out.println("Farmer's inventory now hold the following items");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.printf("( %d ) %s\n", i+1, inventory.get(i).toString());
        }
        System.out.println("-----------------------END-----------------------");
    }
}
