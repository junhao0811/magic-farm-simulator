package capabilities;

import items.Item;

/**
 * The interface Collectible.
 */
public interface Collectible {
    
    /**
     * Produce item.
     *
     * @return the item
     */
    Item produce();
    
    /**
     * Can produce boolean.
     *
     * @return the boolean
     */
    boolean canProduce();
}