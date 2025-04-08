package creatures;

import actions.*;
import capabilities.*;
import items.*;
import java.util.List;

/**
 * MagicDuck is a class that represents the magic ducks that stays in the magic farm.
 *
 * @author Chong Jun Hao
 * @version 22.0.1
 */
public class MagicDuck extends Creature implements Collectible {
    
    private int eggQuantity;
    
    /**
     * A constructor for the MagicDuck class
     *
     * @param name        the name of the MagicDuck
     * @param age         the age of the MagicDuck
     * @param hungerLevel the hunger level of the MagicDuck
     * @param eggQuantity the egg quantity of the MagicDuck
     */
    public MagicDuck(String name, int age, int hungerLevel, int eggQuantity) {
        super(name, age, hungerLevel);
        this.eggQuantity = eggQuantity;
    }
    
    @Override
    public void feed() {
        this.consumeFood(3);
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
        return checkStatus(Status.SICK) ? new Egg(eggQuantity, true)
            : new Egg(eggQuantity, false);
    }
    
    @Override
    public boolean canProduce() {
        return hungerStatus() < 3;
    }
    
    @Override
    public List<Action> allowableActions() {
        List<Action> actions = super.allowableActions();
        if (!checkStatus(Status.DEATH)) {
            actions.add(new CollectAction(this));
        }
        return actions;
    }
    
    @Override
    public String toString() {
        return "MagicDuck" + super.toString() + String.format(", Egg Quantity: %d", eggQuantity);
    }
}
