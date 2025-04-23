import java.util.List;

public class Location {
    private String name;
    private String description;
    private List<String> choices;
    private List<String> outcomes;

    public Location(String name, String description, List<String> choices, List<String> outcomes) {
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

    














        
    








    private void Location(String name, String description, Boolean hasPuzzlePiece){
        this.name = name;
        this.description = description;
        this.hasPuzzlePiece = hasPuzzlePiece;

        if(name == "Skull Rock"){
            //what happens at this location
        }
        else if(name == "Blue Mountains"){

        }
        else if(name == "Mermaid Lagoon"){

        }
        else if(name == "Tropical Forest"){

        }
        else if(name == "Desert"){

        }
        else if(name == "Pirate Camp"){

        }
        else if(name == "Monster Cove"){

        }
        else if(name == "Pixie Hollow"){

        }
        else if(name == "Ice Land"){

        }
    }
}
