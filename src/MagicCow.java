import java.util.List;

public class MagicCow extends Creature implements Collectible {
    private int milkAmount;

    public MagicCow(String name, int age, int hungerLevel, int milkAmount) {
        super(name, age, hungerLevel);
        this.milkAmount = milkAmount;
    }

    @Override
    public void feed() {
        this.consumeFood(4);
    }

    @Override
    public Item produce() {
        // TODO
    }

    @Override
    public boolean canProduce() {
        // TODO
    }

    @Override
    public List<Action> allowableActions() {
        List<Action> actions = super.allowableActions();
        actions.add(new CollectAction(this));
        return actions;
    }

    @Override
    public String toString() {
        return "MagicCow " + super.toString() + String.format(", Milk Quantity: %d", milkAmount);
    }
}
