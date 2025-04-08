package capabilities;

import actions.Action;

import java.util.List;

/**
 * ActionCapable is an interface that represents a generic capable actions that can be done on the
 * creatures or their products.
 *
 * @author Chong Jun Hao
 * @version 22.0.1
 */
public interface ActionCapable {
    
    /**
     * Returns a list of actions that certain classes could process
     *
     * @return a list of actions that certain classes could process
     */
    List<Action> allowableActions();
}
