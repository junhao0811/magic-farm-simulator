package creatures;

import capabilities.Sellable;

/**
 * The type Magic shark.
 */
public class MagicShark extends Creature implements Sellable {
    
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
    public void sell() {
        if (Math.random() < 0.5) {
            System.out.println("Shark becomes angry and terminates the farmer. Game over!");
            System.exit(0);
        } else {
            // farmer.increaseXp(5) TODO: Put in SellAction?
            System.out.println("5 XP gained from selling the shark!");
        }
    }
    
    @Override
    public String toString() {
        return "MagicShark" + super.toString();
    }
}
