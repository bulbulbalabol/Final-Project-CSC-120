import java.util.List;

public class location {
    private String name;
    private String description;
    private List<String> choices;
    private List<String> outcomes;

    public location(String name, String description, List<String> choices, List<String> outcomes) {
        this.name = name;
        this.description = description;
        this.choices = choices;
        this.outcomes = outcomes;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getChoices() {
        return choices;
    }

    public String getOutcome(int index) {
        if (index >= 0 && index < outcomes.size()) {
            return outcomes.get(index);
        } else {
            return "Invalid choice.";
        }
    }
}
