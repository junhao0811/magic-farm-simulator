package creatures;

import actions.*;
import capabilities.*;
import farm.Farmer;
import items.*;
import java.util.List;

/**
 * MagicCow is a class that represents the magic cows that stays in the magic farm.
 *
 * @author Chong Jun Hao
 * @version 22.0.1
 */
public class MagicCow extends Creature implements Collectible, Sellable {
    
    private int milkAmount;
    
    /**
     * A constructor for the MagicCow class
     *
     * @param name        the name of the MagicCow
     * @param age         the age of the MagicCow
     * @param hungerLevel the hunger level of the MagicCow
     * @param milkAmount  the milk amount of the MagicCow
     */
    public MagicCow(String name, int age, int hungerLevel, int milkAmount) {
        super(name, age, hungerLevel);
        this.milkAmount = milkAmount;
    }
    
    @Override
    public void feed() {
        this.consumeFood(4);
        // In the case where the creature is already sick, feeding can have a 50% chance of recovering
        if (checkStatus(Status.SICK) && Math.random() < 0.5) {
            recover();
        }
        // Feeding causes 35% chance that the creature will get SICK
        else if (checkStatus(null) && Math.random() < 0.35) {
            updateStatus(Status.SICK);
        }
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
        return hungerStatus() < 10 && milkAmount > 0;
    }
    
    @Override
    public void sell(Farmer farmer) {
        System.out.println("This cow will refuse to produce milk in the future.");
        milkAmount = 0;
    }
    
    @Override
    public List<Action> allowableActions() {
        List<Action> actions = super.allowableActions();
        actions.add(new CollectAction(this));
        actions.add(new SellAction(this));
        return actions;
    }
    
    @Override
    public String toString() {
        return "MagicCow" + super.toString() + String.format(", Milk Quantity: %d", milkAmount);
    }
}
