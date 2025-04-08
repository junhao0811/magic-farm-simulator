package items;

import actions.Action;
import actions.SellAction;
import capabilities.ActionCapable;
import capabilities.Sellable;
import farm.Farmer;
import java.util.ArrayList;
import java.util.List;

/**
 * Item is a base class that represents the items produced by generic creatures.
 *
 * @author Chong Jun Hao
 * @version 22.0.1
 */
public abstract class Item implements Sellable, ActionCapable {
    
    private int quantity;
    
    /**
     * A constructor for the Item class
     *
     * @param quantity the quantity of item produced by the creature
     */
    public Item(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public void sell(Farmer farmer) {
        System.out.println(toString() + " has been sold!"); // LSP
        farmer.removeItemFromInventory(this); // OCP
    }
    
    @Override
    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        actions.add(new SellAction(this));
        return actions;
    }
    
    @Override
    public String toString() {
        return String.format("Quantity: %d", quantity);
    }
}
