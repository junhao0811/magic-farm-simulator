import java.util.List;

public interface ActionCapable {
    // Returns a list of actions that certain classes could process
    List<Action> allowableActions();
}
