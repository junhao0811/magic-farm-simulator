public class Creature {
    protected int age;
    protected String name;
    protected int hungerLevel;

    public Creature(String name, int age, int hungerLevel) {
        this.name = name;
        this.age = age;
        this.hungerLevel = hungerLevel;
    }

    public String toString() {
        return String.format("Name: %s, Age: %d days, Hunger Level: %d", name, age, hungerLevel);
    }
}
