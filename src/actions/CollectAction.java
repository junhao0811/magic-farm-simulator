package actions;

import capabilities.Collectible;
import farm.Farmer;
import items.Item;

/**
 * The type Collect action.
 */
public class CollectAction implements Action {
    
    private Collectible creature;
    
    /**
     * Instantiates a new Collect action.
     *
     * @param creature the creature
     */
    public CollectAction(Collectible creature) {
        this.creature = creature;
    }
    
    @Override
    public String execute(Farmer farmer) {
        Item item = creature.produce();
        if (item == null) {
            return creature + " is too hungry to produce anything.";
        }
        farmer.addItemToInventory(item);
        return "Farmer just collected " + item + " from " + creature
            + " and have added to the inventory.";
    }
    
    @Override
    public String menuDescription() {
        return "Collect from " + creature;
    }
}
