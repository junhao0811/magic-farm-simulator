public class FeedAction implements Action {
    private Creature creature;

    public FeedAction(Creature creature) {
        this.creature = creature;
    }

    @Override
    public String execute(Farmer farmer) {
        creature.feed();

        switch (creature.currentCondition()) {
            case DEATH -> {
                return "";
            }
            case SICK -> {
                // In the case where the creature is already sick, feeding can have a 50% chance of recovering
                if (Math.random() < 0.5) {
                    creature.recover();
                    return creature + " has been fed";
                }
                return "[SICK] " + creature + " has been fed";
            }
            default -> {
                // Feeding causes 35% chance that the creature will get SICK
                if (Math.random() < 0.35) {
                    creature.updateStatus(Status.SICK);
                    return "[SICK] " + creature + " has been fed";
                }
                return creature + " has been fed";
            }
        }
    }

    @Override
    public String menuDescription() {
        return "Feed this " + creature;
    }
}
