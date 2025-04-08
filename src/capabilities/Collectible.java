package capabilities;

import items.Item;

/**
 * Collectible is an interface that represents the actions that can be done on the creatures
 *
 * @author Chong Jun Hao
 * @version 22.0.1
 */
public interface Collectible {
    
    /**
     * For the creature to be able to produce a collectible
     *
     * @return an Item collectible produced by the magic creature
     */
    Item produce();
    
    /**
     * Indicates whether the magic creature can produce collectibles or not
     *
     * @return true if the creature can produce; false otherwise
     */
    boolean canProduce();
}