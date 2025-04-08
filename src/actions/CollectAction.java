package actions;

import capabilities.Collectible;
import farm.Farmer;
import items.Item;

/**
 * CollectAction is a concrete class which allows farmer to collect products which are produced by
 * magic creatures.
 *
 * @author Chong Jun Hao
 * @version 22.0.1
 */
public class CollectAction implements Action {
    
    private Collectible creature;
    
    /**
     * A constructor for the CollectAction class
     *
     * @param creature a Collectible which its product will be collected by the farmer
     */
    public CollectAction(Collectible creature) {
        this.creature = creature;
    }
    
    @Override
    public String execute(Farmer farmer) {
        Item item = creature.produce();
        // TODO: Maybe put this inside MagicCow and MagicDuck produce() method?
        if (item == null) {
            return creature + " is too hungry to produce anything.";
        }
        farmer.addItemToInventory(item);
        farmer.increaseXp(5);
        return "Farmer just collected " + item + " from " + creature
            + " and have added to the inventory.";
    }
    
    @Override
    public String menuDescription() {
        return "Collect from " + creature;
    }
}
