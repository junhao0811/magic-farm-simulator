package creatures;

import actions.*;
import capabilities.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Creature is a base class that represents the generic magic creatures that stays in the magic farm.
 *
 * @author Chong Jun Hao
 * @version 22.0.1
 */
public abstract class Creature implements ActionCapable {
    
    private int age;
    private String name;
    private int hungerLevel;
    private Status status;
    
    /**
     * A constructor for the Creature class
     *
     * @param name        the name of the creature
     * @param age         the age of the creature
     * @param hungerLevel the hunger level of the creature
     */
    public Creature(String name, int age, int hungerLevel) {
        this.name = name;
        this.age = age;
        this.hungerLevel = hungerLevel;
    }
    
    /**
     * A getter for the creature's hunger status
     *
     * @return an int representing the creature's hunger status
     */
    public int hungerStatus() {
        return hungerLevel;
    }
    
    /**
     * A setter to satisfy the creature's craving/hunger
     *
     * @param amount the amount of food consumed by the creature
     */
    public void consumeFood(int amount) {
        // Handles invalid input (does nothing)
        if (amount <= 0) {
            return;
        }
        
        // Prevents the hungerLevel to go negative
        hungerLevel = Math.max(0, hungerLevel - amount);
    }
    
    /**
     * A setter of the creature's status
     *
     * @param status the creature's current status
     */
    public void updateStatus(Status status) {
        this.status = status;
    }
    
    /**
     * A setter of the creature's status which always sets to null (healthy)
     */
    public void recover() {
        this.status = null;
    }
    
    /**
     * Indicates whether the creature has the corresponding status or not
     *
     * @param status the status to pass in for checking
     * @return true if the status matches the current one; false otherwise
     */
    public boolean checkStatus(Status status) {
        return this.status == status;
    }
    
    /**
     * Feeds the creature
     */
    public abstract void feed();
    
    /**
     * Formats the age string to look more readable.
     *
     * @param totalDays the total days
     * @return the string represents the formatted output
     */
    public String formatAge(int totalDays) {
        final int DAYS_IN_YEAR = 365;
        final int DAYS_IN_MONTH = 30;
        
        if (totalDays == 0) {
            return "0 days";
        }
        
        int years = totalDays / DAYS_IN_YEAR;
        int remainingDays = totalDays % DAYS_IN_YEAR;
        int months = remainingDays / DAYS_IN_MONTH;
        int days = remainingDays % DAYS_IN_MONTH;
        
        StringBuilder res = new StringBuilder();
        
        if (years > 0) {
            res.append(years).append(years > 1 ? " years " : " year ");
        }
        
        if (months > 0) {
            res.append(months).append(months > 1 ? " months " : " month ");
        }
        
        if (days > 0) {
            res.append(days).append(days > 1 ? " days " : " day ");
        }
        
        // Remove any trailing whitespaces
        return res.toString().trim();
    }
    
    @Override
    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        
        // If the hungerLevel is over 100, then the creature will have DEATH status (can't be reverted)
        if (hungerStatus() >= 100) {
            status = Status.DEATH;
        } else {
            actions.add(new FeedAction(this));
            incrementHungerLevel();
            incrementAge();
        }
        return actions;
    }
    
    /**
     * Increments creature's hunger level.
     */
    public void incrementHungerLevel() {
        if (checkStatus(Status.SICK)) {
            hungerLevel += 2;
        } else if (checkStatus(null)) {
            hungerLevel += 1;
        }
    }
    
    /**
     * Increments creature's age.
     */
    public void incrementAge() {
            age++;
    }
    
    @Override
    public String toString() {
        return String.format("%s Name: %s, Age: %s, Hunger Level: %d",
            status == Status.SICK ? "[SICK]" : "",
            name, formatAge(age), hungerStatus());
    }
}
