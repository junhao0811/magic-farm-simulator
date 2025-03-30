import java.util.List;
import java.util.ArrayList;

public class MagicFarm {
    private List<Creature> creatures;
    private Farmer farmer;

    public MagicFarm() {
        creatures = new ArrayList<>();
        farmer = new Farmer();
    }

    // Creates six new Creature objects
    public void createCreatures() {
        creatures.add(new MagicDuck("Donald", 10, 10, 3));
        creatures.add(new MagicDuck("Quackers", 200, 10, 3));
        creatures.add(new MagicCow("Moozy", 39, 10, 10));
        creatures.add(new MagicCow("Sparkle", 432, 10, 10));
        creatures.add(new MagicShark("Finn", 5, 10));
        creatures.add(new MagicShark("Storm", 60, 10));
    }

    // Shows each creature's attributes
    public void displayCreatures() {
        for (int i = 0; i < creatures.size(); i++) {
            System.out.printf("( %d ) %s\n\n", i+1, creatures.get(i).toString());
        }
    }

    public void addActionsToMenu() {
        List<Action> actions = new ArrayList<>();

        List<ActionCapable> actionCapables = new ArrayList<>(creatures);

        for (ActionCapable actionCapable: actionCapables) {
            actions.addAll(actionCapable.allowableActions());
        }

        System.out.println("############################################");

        Action action = Menu.showMenu(actions);

        System.out.println(action.execute(farmer));

        for (Creature creature: creatures) {
            creature.incrementHungerLevel();
            creature.incrementAge();
        }

        farmer.listInventoryItems();
    }

    public void printStatus() {
        System.out.println("Welcome to FIT2099 Magic Farm");
        createCreatures();
        while (!creatures.isEmpty()) {
            addActionsToMenu();
        }
        System.out.println("Thank you for visiting FIT2099 Magic Farm!");
    }
}
