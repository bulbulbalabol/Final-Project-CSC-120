import java.util.List;
/**
 * Represents a game location with a name, description, possible choices, and outcomes.
 * Each location provides the player with a set of actions and consequences.
 */
public class Location {
    // The name of the location (e.g., "Skull Rock")
    private final String name;
    // A description shown to the player when they arrive at this location
    private final String description;
    // A list of possible player choices (e.g., "Explore the cave", "Talk to the pirate")
    private final List<String> choices;
    // A list of outcomes corresponding to each choice
    private final List<String> outcomes;
    
    /**
     * Constructs a new Location with the given parameters.
     *
     * @param name        the name of the location
     * @param description a brief narrative describing the setting
     * @param choices     a list of possible actions the player can take
     * @param outcomes    a list of corresponding outcomes for each choice
     */
    public Location(String name, String description, List<String> choices, List<String> outcomes) {
        this.name = name;
        this.description = description;
        this.choices = choices;
        this.outcomes = outcomes;
    }
    /**
     * Returns the name of the location.
     *
     * @return the location's name
     */
    public String getName() {
        return name;
    }
    /**
     * Returns the description of the location.
     *
     * @return a narrative description of the location
     */
    public String getDescription() {
        return description;
    }
    /**
     * Returns the list of choices available to the player at this location.
     *
     * @return a list of player choices
     */
    public List<String> getChoices() {
        return choices;
    }
    /**
     * Returns the outcome corresponding to the specified choice index.
     *
     * @param index the index of the player's choice (0-based)
     * @return the outcome of the chosen action, or "Invalid choice." if the index is out of bounds
     */
    public String getOutcome(int index) {
        // If index is valid, return the corresponding outcome
        if (index >= 0 && index < outcomes.size()) {
            return outcomes.get(index);
        } else {
            // If index is out of bounds, return an error message
            return "Invalid choice.";
        }
    }
}
