public class FeedAction extends Action{
    private Creature creature;

    public FeedAction(Creature creature) {
        this.creature = creature;
    }

    @Override
    public String execute() {
        creature.feed();
        return creature + " has been fed";
    }

    @Override
    public String menuDescription() {
        return "Feed this " + creature;
    }
}
