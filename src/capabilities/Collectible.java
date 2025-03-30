package capabilities;

import items.Item;

public interface Collectible {
    Item produce();
    boolean canProduce();
}