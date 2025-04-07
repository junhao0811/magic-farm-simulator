package farm;

import actions.Action;
import capabilities.ActionCapable;
import creatures.*;
import ui.Menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The type Magic farm.
 */
public class MagicFarm {
    
    private List<Creature> creatures;
    private Farmer farmer;
    
    /**
     * Instantiates a new Magic farm.
     */
    public MagicFarm() {
        creatures = new ArrayList<>();
        farmer = new Farmer();
    }
    
    /**
     * Create creatures.
     */
// Creates six new creatures.Creature objects
    public void createCreatures() {
        creatures.add(new MagicDuck("Donald", 2, 11, 3));
        creatures.add(new MagicDuck("Quackers", 3, 11, 3));
        creatures.add(new MagicCow("Moozy", 4, 11, 10));
        creatures.add(new MagicCow("Sparkle", 5, 11, 10));
        creatures.add(new MagicShark("Finn", 6, 11));
        creatures.add(new MagicShark("Storm", 7, 91));
    }
    
    /**
     * Display creatures.
     */
// Shows each creature's attributes
    public void displayCreatures() {
        for (int i = 0; i < creatures.size(); i++) {
            System.out.printf("( %d ) %s\n\n", i + 1, creatures.get(i).toString());
        }
    }
    
    /**
     * Add actions to menu.
     */
    public void addActionsToMenu() {
        List<Action> actions = new ArrayList<>();
        
        List<ActionCapable> actionCapables = new ArrayList<>(creatures);
        
        for (ActionCapable actionCapable : actionCapables) {
            actions.addAll(actionCapable.allowableActions());
        }
        
        System.out.println("############################################");
        System.out.println(farmer.toString());
        Action action = Menu.showMenu(actions);
        
        System.out.println(action.execute(farmer));
        
        Iterator<Creature> iterator = creatures.iterator();
        while (iterator.hasNext()) {
            Creature creature = iterator.next();
            
            // Remove option from the menu if it dies
            if (creature.checkStatus(Status.DEATH)) {
                iterator.remove();
            }
        }
        
        farmer.listInventoryItems();
    }
    
    /**
     * Print status.
     */
    public void printStatus() {
        System.out.println("Welcome to FIT2099 Magic Farm");
        createCreatures();
        while (!creatures.isEmpty()) {
            addActionsToMenu();
            if (farmer.hasMetXpRequirement()) {
                break;
            }
        }
        System.out.println("Thank you for visiting FIT2099 Magic Farm!");
    }
}
