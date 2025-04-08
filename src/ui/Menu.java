package ui;

import actions.Action;

import java.util.*;

/**
 * The type Menu.
 */
public class Menu {
    
    /**
     * Show menu action.
     *
     * @param actions the actions to be shown in the menu
     * @return the action with the key to trigger it
     */
    public static Action showMenu(List<Action> actions) {
        Scanner scanner = new Scanner(System.in);
        List<Character> freeChars = new ArrayList<>();
        Map<Character, Action> keyToActionMap = new HashMap<>();
        
        for (char j = 'a'; j <= 'z'; j++) {
            freeChars.add(j);
        }
        
        for (Action action : actions) {
            char c = freeChars.get(0);
            freeChars.remove(Character.valueOf(c));
            keyToActionMap.put(c, action);
            System.out.println(c + ": " + action.menuDescription());
        }
        
        char key;
        do {
            key = scanner.next().charAt(0);
        } while (!keyToActionMap.containsKey(key));
        
        return keyToActionMap.get(key);
    }
}