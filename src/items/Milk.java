package items;

public class Milk extends Item {
    private int freshnessLevel;

    public Milk(int quantity, int freshnessLevel) {
        super(quantity);
        this.freshnessLevel = freshnessLevel;
    }

    @Override
    public String toString() {
        return String.format("Milk %s with freshness level: %s", super.toString(), freshnessLevel);
    }
}
