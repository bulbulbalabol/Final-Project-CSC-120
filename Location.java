import java.util.List;

public class Location {
    // The name of the location (e.g., "Skull Rock")
    private final String name;
    // A description shown to the player when they arrive at this location
    private final String description;
    // A list of possible player choices (e.g., "Explore the cave", "Talk to the pirate")
    private final List<String> choices;
    // A list of outcomes corresponding to each choice
    private final List<String> outcomes;
    
    // Constructor to initialize all the location attributes
    public Location(String name, String description, List<String> choices, List<String> outcomes) {
        this.name = name;
        this.description = description;
        this.choices = choices;
        this.outcomes = outcomes;
    }
    // Getter for the location name
    public String getName() {
        return name;
    }
    // Getter for the location description
    public String getDescription() {
        return description;
    }
    // Getter for the list of available choices
    public List<String> getChoices() {
        return choices;
    }
    // Returns the outcome associated with the given choice index
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
