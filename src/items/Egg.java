package items;

import farm.Farmer;

/**
 * Egg is a class that represents the items produced by MagicDuck.
 *
 * @author Chong Jun Hao
 * @version 22.0.1
 */
public class Egg extends Item {
    
    private boolean isBroken;
    
    /**
     * A constructor for the Egg class
     *
     * @param quantity the quantity of eggs produced
     * @param isBroken the condition of the egg
     */
    public Egg(int quantity, boolean isBroken) {
        super(quantity);
        this.isBroken = isBroken;
    }
    
    @Override
    public void sell(Farmer farmer) {
        super.sell(farmer);
        if (isBroken) {
            farmer.increaseXp(1);
        } else {
            farmer.increaseXp(10);
        }
    }
    
    @Override
    public String toString() {
        return String.format("Egg %s %s", super.toString(),
            isBroken ? "BUT is broken!" : "AND is not broken!");
    }
}
