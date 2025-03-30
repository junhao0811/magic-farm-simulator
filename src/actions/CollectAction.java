package actions;

import capabilities.Collectible;
import farm.Farmer;
import items.Item;

public class CollectAction implements Action {
    private Collectible creature;

    public CollectAction(Collectible creature)  {
        this.creature = creature;
    }

    @Override
    public String execute(Farmer farmer) {
        Item item = creature.produce();
        if (item == null) {
            return creature + " is too hungry to produce anything.";
        }
        farmer.addItemToInventory(item);
        return "Farmer just collected " + item + " from " + creature + " and have added to the inventory.";
    }

    @Override
    public String menuDescription() {
        return "Collect from " + creature;
    }
}
