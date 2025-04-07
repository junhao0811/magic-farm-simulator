package items;

/**
 * The type Milk.
 */
public class Milk extends Item {
    
    private int freshnessLevel;
    
    /**
     * Instantiates a new Milk.
     *
     * @param quantity       the quantity
     * @param freshnessLevel the freshness level
     */
    public Milk(int quantity, int freshnessLevel) {
        super(quantity);
        this.freshnessLevel = freshnessLevel;
    }
    
    @Override
    public String toString() {
        return String.format("Milk %s with freshness level: %s", super.toString(), freshnessLevel);
    }
}
