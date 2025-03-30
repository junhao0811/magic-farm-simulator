public class Egg extends Item {
    private boolean isBroken;

    public Egg(int quantity, boolean isBroken) {
        super(quantity);
        this.isBroken = isBroken;
    }

    @Override
    public String toString() {
        return String.format("Egg %s %s", super.toString(), isBroken ? "BUT is broken!" : "AND is not broken!");
    }
}
