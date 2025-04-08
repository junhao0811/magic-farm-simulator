package actions;

import farm.Farmer;
import creatures.Creature;

/**
 * FeedAction is a concrete class which allows farmer to feed magic creatures.
 *
 * @author Chong Jun Hao
 * @version 22.0.1
 */
public class FeedAction implements Action {
    
    private Creature creature;
    
    /**
     * A constructor for the FeedAction class
     *
     * @param creature a Creature which will be fed by the farmer
     */
    public FeedAction(Creature creature) {
        this.creature = creature;
    }
    
    @Override
    public String execute(Farmer farmer) {
        creature.feed();
        farmer.increaseXp(1);
        return creature + " has been fed";
    }
    
    @Override
    public String menuDescription() {
        return "Feed this " + creature;
    }
}
