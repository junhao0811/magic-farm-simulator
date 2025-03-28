public class CollectAction implements Action {
    private Collectible creature;

    public CollectAction(Collectible creature)  {
        this.creature = creature;
    }

    @Override
    public String execute(Farmer farmer) {
        farmer.addItemToInventory(creature.produce());
        return "Farmer just collected " + creature.toString() + " and have added to the inventory";
    }

    @Override
    public String menuDescription() {
        return "Collect from " + creature;
    }
}
