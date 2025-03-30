public class MagicShark extends Creature {
    public MagicShark(String name, int age, int hungerLevel) {
        super(name, age, hungerLevel);
    }

    @Override
    public void feed() {
        this.consumeFood(2);
    }

    @Override
    public String toString() {
        return "MagicShark" + super.toString();
    }
}
