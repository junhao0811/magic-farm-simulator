import java.util.List;
import java.util.ArrayList;

public class MagicFarm {
    private List<Creature> creatures;

    public MagicFarm() {
        creatures = new ArrayList<>();
    }

    public void printStatus() {
        System.out.println("Welcome to FIT2099 Magic Farm");
        createCreatures();
        addActionsToMenu();
        System.out.println("Thank you for visiting FIT2099 Magic Farm!");
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

        // Store all actions
        for (Creature creature : creatures) {
            actions.addAll(creature.allowableActions());
        }

        System.out.println("############################################");

        Action action = Menu.showMenu(actions);
        System.out.println(action.execute());
    }
}
