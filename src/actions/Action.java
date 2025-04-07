package actions;

import farm.Farmer;

/**
 * The interface Action.
 */
public interface Action {
    
    /**
     * Execute string.
     *
     * @param farmer the farmer
     * @return the string
     */
    String execute(Farmer farmer);
    
    /**
     * Menu description string.
     *
     * @return the string
     */
    String menuDescription();
}
