public class MagicFarm {
    private Creature[] creatures;

    public MagicFarm() {
        creatures = new Creature[6];
    }

    public void printStatus() {
        System.out.println("Welcome to FIT2099 Magic Farm\n");
        createCreatures();
        displayCreatures();
        System.out.println("Thank you for visiting FIT2099 Magic Farm!");
    }

    // Creates six new Creature objects
    public void createCreatures() {
        creatures[0] = new MagicDuck("Donald", 10, 10, 3);
        creatures[1] = new MagicDuck("Quackers", 200, 10, 3);
        creatures[2] = new MagicCow("Moozy", 39, 10, 10);
        creatures[3] = new MagicCow("Sparkle", 432, 10, 10);
        creatures[4] = new MagicShark("Finn", 5, 10);
        creatures[5] = new MagicShark("Storm", 60, 10);
    }

    // Shows each creature's attributes
    public void displayCreatures() {
        for (int i = 0; i < creatures.length; i++) {
            System.out.printf("( %d ) %s\n\n", i+1, creatures[i].toString());
        }
    }
}
