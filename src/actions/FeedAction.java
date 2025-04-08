package actions;

import creatures.Status;
import farm.Farmer;
import creatures.Creature;

/**
 * The type Feed action.
 */
public class FeedAction implements Action {
    
    private Creature creature;
    
    /**
     * Instantiates a new Feed action.
     *
     * @param creature the creature
     */
    public FeedAction(Creature creature) {
        this.creature = creature;
    }
    
    @Override
    public String execute(Farmer farmer) {
        creature.feed();
        // TODO: Put sick logic in creature class, feed method
        // In the case where the creature is already sick, feeding can have a 50% chance of recovering
        if (creature.checkStatus(Status.SICK) && Math.random() < 0.5) {
            creature.recover();
        }
        // Feeding causes 35% chance that the creature will get SICK
        else if (creature.checkStatus(null) && Math.random() < 0.35) {
            creature.updateStatus(Status.SICK);
        }
        return creature + " has been fed";
    }
    
    @Override
    public String menuDescription() {
        return "Feed this " + creature;
    }
}
