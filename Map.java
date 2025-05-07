import java.util.*;

public class Map {
    // A list to store all the location objects
    private final List<Location> locations;
    // Constructor initializes the list and fills it with predefined locations
    public Map() {
        locations = new ArrayList<>(); // Create a new ArrayList to hold Location objects
        populateLocations(); // Add all locations to the list
    }
    // Displays all available locations with numbered listing
    public void showLocations() {
        for (int i = 0; i < locations.size(); i++) {
            // Print the name of each location preceded by its index+1
            System.out.println((i + 1) + ". " + locations.get(i).getName());
        }
    }
    // Returns a specific location based on its index in the list
    public Location getLocationByIndex(int index) {
        return locations.get(index); // Assumes index is valid
    }
    // Adds all predefined locations to the locations list
    private void populateLocations() {
        locations.add(LocationDescription.createSkullRock());
        locations.add(LocationDescription.createBlueMountains());
        locations.add(LocationDescription.createMonsterCove());
        locations.add(LocationDescription.createTropicalForest());
        locations.add(LocationDescription.createMermaidLagoon());
        locations.add(LocationDescription.createPixieHollow());
        locations.add(LocationDescription.createIceLand());
        locations.add(LocationDescription.createPirateCamp());
        locations.add(LocationDescription.createDesert());
    }
}


