package actions;

import capabilities.Sellable;
import creatures.Creature;
import farm.Farmer;
import items.*;

/**
 * SellAction is a concrete class which allows the farmer to sell products in his inventory
 *
 * @author Chong Jun Hao
 * @version 22.0.1
 */
public class SellAction implements Action {
    
    private Sellable product; // DIP, uses abstraction layer + LSP
    
    /**
     * A constructor for the SellAction class
     *
     * @param product a Sellable which will be sold from the farmer's inventory
     */
    public SellAction(Sellable product) {  // DIP, uses abstraction layer + LSP
        this.product = product;
    }
    
    @Override
    public String execute(Farmer farmer) {
        product.sell(farmer);
        return "Attempt to sell is successful!";
    }
    
    @Override
    public String menuDescription() {
        return "Sell this " + product;
    }
}
