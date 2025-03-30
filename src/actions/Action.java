package actions;

import farm.Farmer;

public interface Action {
    String execute(Farmer farmer);
    String menuDescription();
}
