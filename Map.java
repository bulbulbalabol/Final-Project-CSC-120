import java.util.*;
/**
 * The Map class represents the collection of our 9 locations. 
 */

public class Map {
    /** 
     * A list to store all the location objects 
    */
    private final List<Location> locations;

    /**
     * Constructs a Map object and populates it with a fixed set of locations.
     */
    public Map() {
        locations = new ArrayList<>(); // Create a new ArrayList to hold Location objects
        populateLocations(); // Add all locations to the list
    }
    /**
     * Displays all available locations in the map, each with a numbered label.
     * This is typically used to show the player their travel options.
     */
    public void showLocations() {
        for (int i = 0; i < locations.size(); i++) {
            // Print the name of each location preceded by its index+1
            System.out.println((i + 1) + ". " + locations.get(i).getName());
        }
    }
    /**
     * Retrieves a Location object from the map based on its index.
     *
     * @param index the index of the location in the list (starting at 0)
     * @return the Location object at the specified index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public Location getLocationByIndex(int index) {
        return locations.get(index); // Assumes index is valid
    }
    /**
     * Populates the map with our 9 location instances.
     * These are hardcoded and created via static factory methods in LocationDescription.
     */
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


