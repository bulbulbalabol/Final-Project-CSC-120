import java.util.*;

public class Map {
    private List<Location> locations;

    public Map() {
        locations = new HashMap<>();

        Location skullRock = new Location("Skull Rock", "A rocky outcrop shaped like a skull.", true);
        Location blueMountains = new Location("Blue Mountains", "Majestic mountains covered in mist.", false);
        Location monsterCove = new Location("Monster Cove", "Dark waters rumored to have sea monsters.", true);
        Location tropicalForest = new Location("Tropical Forest", "Lush greenery with exotic animals.", false);
        Location mermaidLagoon = new Location("Mermaid Lagoon", "Glimmering waters inhabited by mermaids.", true);
        Location pixieHollow = new Location("Pixie Hollow", "A magical place filled with pixies.", false);
        Location iceLand = new Location("Ice Land", "Frozen land with icy winds.", true);
        Location pirateCamp = new Location("Pirate Camp", "A rugged camp full of pirate gear.", false);
        Location desert = new Location("Desert", "A scorching desert with endless sand dunes.", true);

        
        locations.put("Skull Rock", skullRock);
        locations.put("Blue Mountains", blueMountains);
        locations.put("Monster Cove", monsterCove);
        locations.put("Tropical Forest", tropicalForest);
        locations.put("Mermaid Lagoon", mermaidLagoon);
        locations.put("Pixie Hollow", pixieHollow);
        locations.put("Ice Land", iceLand);
        locations.put("Pirate Camp", pirateCamp);
        locations.put("Desert", desert);
    }

    public Location getStartingLocation() {
        return locations.get("Skull Rock");
    }
}

