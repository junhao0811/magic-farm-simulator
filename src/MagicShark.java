public class MagicShark extends Creature {
    public MagicShark(String name, int age, int hungerLevel) {
        super(name, age, hungerLevel);
    }

    @Override
    public String toString() {
        return "MagicShark " + super.toString();
    }
}
