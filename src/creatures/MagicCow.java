package creatures;

import actions.*;
import capabilities.*;
import items.*;
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
        if (canProduce()) {
            return checkStatus(Status.SICK) ? new Milk(milkAmount, 60)
                                            : new Milk(milkAmount, 100);
        }
        return null;
    }

    @Override
    public boolean canProduce() {
        return hungerStatus() < 10;
    }

    @Override
    public List<Action> allowableActions() {
        List<Action> actions = super.allowableActions();
        actions.add(new CollectAction(this));
        return actions;
    }

    @Override
    public String toString() {
        return "MagicCow" + super.toString() + String.format(", Milk Quantity: %d", milkAmount);
    }
}
