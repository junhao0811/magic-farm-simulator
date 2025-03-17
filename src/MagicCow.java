public class MagicCow extends Creature {
    private int milkAmount;

    public MagicCow(String name, int age, int hungerLevel, int milkAmount) {
        super(name, age, hungerLevel);
        this.milkAmount = milkAmount;
    }

    @Override
    public String toString() {
        return "MagicCow " + super.toString() + String.format(", Milk Quantity: %d", milkAmount);
    }
}
