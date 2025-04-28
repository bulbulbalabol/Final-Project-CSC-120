import java.util.List;

public class Location {
    private String name;
    private String description;
    private List<String> choices;
    private List<String> outcomes;
    private Boolean hasPuzzlePiece;

    public Location(String name, String description, List<String> choices, List<String> outcomes, Boolean hasPuzzlePiece) {
        this.name = name;
        this.description = description;
        this.choices = choices;
        this.outcomes = outcomes;
        this.hasPuzzlePiece = hasPuzzlePiece;
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
    public Boolean getHasPuzzlePiece(){
        return hasPuzzlePiece;
    }

    public void setHasPuzzlePiece(Boolean hasPuzzlePiece){
        this.hasPuzzlePiece = hasPuzzlePiece;
    }
}
