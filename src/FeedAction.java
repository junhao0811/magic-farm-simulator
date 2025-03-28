public class FeedAction implements Action {
    private Creature creature;

    public FeedAction(Creature creature) {
        this.creature = creature;
    }

    @Override
    public String execute(Farmer farmer) {
        creature.feed();
        return creature + " has been fed";
    }

    @Override
    public String menuDescription() {
        return "Feed this " + creature;
    }
}
