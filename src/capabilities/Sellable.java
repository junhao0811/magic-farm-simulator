package capabilities;

import farm.Farmer;

/**
 * The interface Sellable.
 */
public interface Sellable {
    
    /**
     * Selling feature for things that can be sold
     *
     * @param farmer the farmer
     */
    void sell(Farmer farmer);
}
