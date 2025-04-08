package creatures;

import actions.Action;
import actions.SellAction;
import capabilities.Sellable;
import farm.Farmer;
import java.util.List;

/**
 * MagicShark is a class that represents the magic sharks that stays in the magic farm.
 *
 * @author Chong Jun Hao
 * @version 22.0.1
 */
public class MagicShark extends Creature implements Sellable {
    
    /**
     * A constructor for the MagicShark class
     *
     * @param name        the name of the MagicShark
     * @param age         the age of the MagicShark
     * @param hungerLevel the hunger level of the MagicShark
     */
    public MagicShark(String name, int age, int hungerLevel) {
        super(name, age, hungerLevel);
    }
    
    @Override
    public void feed() {
        this.consumeFood(2);
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
    public void sell(Farmer farmer) {
        if (Math.random() < 0.5) {
            System.out.println("Shark becomes angry and terminates the farmer. Game over!");
            System.exit(0);
        } else {
            farmer.increaseXp(5); // OCP
            System.out.println("5 XP gained from selling the shark!");
        }
    }
    
    @Override
    public List<Action> allowableActions() {
        List<Action> actions = super.allowableActions();
        if (!checkStatus(Status.DEATH)) {
            actions.add(new SellAction(this));
        }
        return actions;
    }
    
    @Override
    public String toString() {
        return "MagicShark" + super.toString();
    }
}
