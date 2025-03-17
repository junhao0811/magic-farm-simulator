public class Creature {
    protected int age;
    protected String name;
    protected int hungerLevel;

    public Creature (int age, String name, int hungerLevel) {
        this.age = age;
        this.name = name;
        this.hungerLevel = hungerLevel;
    }

    public String toString() {
        return String.format("Age: %d, Name: %s, Hunger level: %d", age, name, hungerLevel);
    }
}
