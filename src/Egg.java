public class Egg extends Item {
    private boolean isBroken;

    public Egg() {
        super();
        this.isBroken = false;
    }

    @Override
    public String toString() {
        return String.format("Egg: %s %s\n", super.toString(),isBroken ? "BUT is broken!" : "AND is not broken!");
    }
}
