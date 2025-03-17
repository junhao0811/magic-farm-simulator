public class MagicDuck extends Creature {
    private int eggQuantity;

    public MagicDuck(int age, String name, int hungerLevel, int eggQuantity) {
        super(age, name, hungerLevel);
        this.eggQuantity = eggQuantity;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Egg Quantity: %d", eggQuantity);
    }
}
