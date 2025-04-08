package actions;

import farm.Farmer;

/**
 * Action is an interface that represents a generic action that the farmer can do
 *
 * @author Chong Jun Hao
 * @version 22.0.1
 */
public interface Action {
    
    /**
     * Executes the action
     *
     * @param farmer the farmer
     * @return a string to be shown in the output after the execution of the action
     */
    String execute(Farmer farmer);
    
    /**
     * A menu description to be shown in the output which allows user to choose
     *
     * @return a String which represents description of the action
     */
    String menuDescription();
}
