package creatures;

/**
 * The type Magic shark.
 */
public class MagicShark extends Creature {
    
    /**
     * Instantiates a new Magic shark.
     *
     * @param name        the name
     * @param age         the age
     * @param hungerLevel the hunger level
     */
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
