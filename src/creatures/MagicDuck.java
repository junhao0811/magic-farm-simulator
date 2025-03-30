package creatures;

import actions.*;
import capabilities.*;
import items.*;
import java.util.List;

public class MagicDuck extends Creature implements Collectible {
    private int eggQuantity;

    public MagicDuck(String name, int age, int hungerLevel, int eggQuantity) {
        super(name, age, hungerLevel);
        this.eggQuantity = eggQuantity;
    }

    @Override
    public void feed() {
        this.consumeFood(3);
    }

    @Override
    public Item produce() {
        if (canProduce()) {
            return checkStatus(Status.SICK) ? new Egg(eggQuantity, true)
                                            : new Egg(eggQuantity, false);
        }
        return null;
    }

    @Override
    public boolean canProduce() {
        return hungerStatus() < 3;
    }

    @Override
    public List<Action> allowableActions() {
        List<Action> actions = super.allowableActions();
        actions.add(new CollectAction(this));
        return actions;
    }

    @Override
    public String toString() {
        return "MagicDuck" + super.toString() + String.format(", Egg Quantity: %d", eggQuantity);
    }
}
