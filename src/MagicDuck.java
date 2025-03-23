public class MagicDuck extends Creature {
    private int eggQuantity;

    public MagicDuck(String name, int age, int hungerLevel, int eggQuantity) {
        super(name, age, hungerLevel);
        this.eggQuantity = eggQuantity;
    }

    @Override
    public void feed() {
        this.consumeFood(3);
    }

    @Override
    public String toString() {
        return "MagicDuck " + super.toString() + String.format(", Egg Quantity: %d", eggQuantity);
    }
}
