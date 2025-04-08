package main;

import farm.MagicFarm;

/**
 * <h1> Magic Farm Simulator </h1>
 * The Magic Farm Simulator program implements a game that can simulate a magic farm and interact
 * with creatures
 *
 * @author Chong Jun Hao
 * @version 22.0.1
 * @since 2025-03-11
 */
public class Application {
    
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        MagicFarm magicFarm = new MagicFarm();
        magicFarm.printStatus();
    }
}
