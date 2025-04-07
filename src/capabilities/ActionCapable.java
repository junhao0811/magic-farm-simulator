package capabilities;

import actions.Action;

import java.util.List;

/**
 * The interface Action capable.
 */
public interface ActionCapable {
    
    /**
     * Allowable actions list.
     *
     * @return the list
     */
// Returns a list of actions that certain classes could process
    List<Action> allowableActions();
}
