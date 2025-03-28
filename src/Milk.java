public class Milk extends Item {
    private int freshnessLevel;

    public Milk() {
        super();
        this.freshnessLevel = 0;
    }

    @Override
    public String toString() {
        return String.format("Milk: %s with freshness level: %s\n", super.toString(), freshnessLevel);
    }
}
