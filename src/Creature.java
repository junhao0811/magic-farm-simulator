public class Creature {
    private int age;
    private String name;
    private int hungerLevel;

    public Creature(String name, int age, int hungerLevel) {
        this.name = name;
        this.age = age;
        this.hungerLevel = hungerLevel;
    }

    public int hungerStatus() {
        return hungerLevel;
    }

    public void consumeFood(int amount) {
        // Handles invalid input (does nothing)
        if (amount <= 0)
            return;

        // Prevents the hungerLevel to go negative
        hungerLevel = Math.max(0, hungerLevel - amount);
    }

    public String formatAge(int totalDays) {
        final int DAYS_IN_YEAR = 365;
        final int DAYS_IN_MONTH = 30;

        if (totalDays == 0)
            return "0 days";

        int years = totalDays / DAYS_IN_YEAR;
        int remainingDays = totalDays % DAYS_IN_YEAR;
        int months = remainingDays / DAYS_IN_MONTH;
        int days = remainingDays % DAYS_IN_MONTH;

        StringBuilder res = new StringBuilder();

        if (years > 0)
            res.append(years).append(years > 1 ? " years " : " year ");

        if (months > 0)
            res.append(months).append(months > 1 ? " months " : " month ");

        if (days > 0)
            res.append(days).append(days > 1 ? " days " : " day ");

        // Remove any trailing whitespaces
        return res.toString().trim();
    }

    public String toString() {
        return String.format("Name: %s, Age: %s, Hunger Level: %d", name, formatAge(age), hungerStatus());
    }
}
