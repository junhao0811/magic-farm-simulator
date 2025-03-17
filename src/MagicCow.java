public class MagicCow extends Creature {
    private int milkAmount;

    public MagicCow(int age, String name, int hungerLevel, int milkAmount) {
        super(age, name, hungerLevel);
        this.milkAmount = milkAmount;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Milk Quantity: %d", milkAmount);
    }
}
