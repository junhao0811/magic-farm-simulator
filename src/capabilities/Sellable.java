package capabilities;

import farm.Farmer;

/**
 * Sellable is an interface that represents the actions that can be done on the creatures or their
 * products
 *
 * @author Chong Jun Hao
 * @version 22.0.1
 */
public interface Sellable {
    
    /**
     * Selling feature for things that can be sold
     *
     * @param farmer a Farmer which sells the sellable product
     */
    void sell(Farmer farmer);
}
