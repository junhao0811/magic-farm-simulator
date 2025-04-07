package main;

import farm.MagicFarm;

/**
 * The type Application.
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
