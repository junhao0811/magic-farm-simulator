public class Creature {
    private int age;
    private String name;
    private int hungerLevel;

    public Creature(String name, int age, int hungerLevel) {
        this.name = name;
        this.age = age;
        this.hungerLevel = hungerLevel;
    }

    public int hungerStatus() {
        return hungerLevel;
    }

    public void consumeFood(int amount) {
        // Handles invalid input (does nothing)
        if (amount <= 0)
            return;

        // Prevents the hungerLevel to go negative
        hungerLevel = Math.max(0, hungerLevel - amount);
    }

    public String toString() {
        return String.format("Name: %s, Age: %s, Hunger Level: %d", name, age, hungerStatus());
    }
}
