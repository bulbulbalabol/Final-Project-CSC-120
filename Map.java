import java.util.*;

public class Map {
    private final List<Location> locations;

    public Map() {
        locations = new ArrayList<>();
        populateLocations();
    }

    public void showLocations() {
        for (int i = 0; i < locations.size(); i++) {
            System.out.println((i + 1) + ". " + locations.get(i).getName());
        }
    }

    public Location getLocationByIndex(int index) {
        return locations.get(index);
    }

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


