package items;

import farm.Farmer;

/**
 * Milk is a class that represents the items produced by MagicCow.
 *
 * @author Chong Jun Hao
 * @version 22.0.1
 */
public class Milk extends Item {
    
    private int freshnessLevel;
    
    /**
     * A constructor for the Milk class
     *
     * @param quantity       the quantity of the milk produced
     * @param freshnessLevel the freshness level of the milk
     */
    public Milk(int quantity, int freshnessLevel) {
        super(quantity);
        this.freshnessLevel = freshnessLevel;
    }
    
    @Override
    public void sell(Farmer farmer) {
        super.sell(farmer);
        if (freshnessLevel <= 60) {
            farmer.increaseXp(1);
        } else {
            farmer.increaseXp(10); // OCP
        }
    }
    
    @Override
    public String toString() {
        return String.format("Milk %s with freshness level: %s", super.toString(), freshnessLevel);
    }
}
