import java.util.*;

public class GameEngine {
    // Reference to the game map object
    private final Map map;
    // Scanner object for user input
    private final Scanner scanner;
    // Tracks whether the player has collected the sword
    private boolean hasSword = false;

    // Stores names of locations where puzzle pieces have been collected
    private final Set<String> collectedPieces;
    
    // Constructor to initialize map, scanner, and set for collected pieces
    public GameEngine() {
        map = new Map();
        scanner = new Scanner(System.in);
        collectedPieces = new HashSet<>();
    }

    // Y/N
    // Starts the game loop
    public void startGame() {
        // Continue looping until all 9 puzzle pieces are collected
        while(collectedPieces.size() < 9){
            // First-time introduction
            if (collectedPieces.isEmpty()){
                System.out.println(" WELCOME TO WONDERLAND");
                System.out.println("\n You are on your journey.");
                MapDisplay.showMap("map.png"); // Show the map image
                map.showLocations(); // Display all location options
    
                System.out.print("\nChoose a location by entering its number (1-9): ");
                int choice = Integer.parseInt(scanner.nextLine());
                Location selected = map.getLocationByIndex(choice - 1);
                handleLocation(selected);
            }
            // Repeat prompt after the first piece is collected but before all 9
            if (!collectedPieces.isEmpty() && collectedPieces.size() < 9) {
                System.out.println("\n You are on your journey.");
                System.out.println("Would you like to see the map? Respond with Y or N.");
                String response = scanner.nextLine();
                    if(response.equals("Y") || response.equals("y")){
                        MapDisplay.showMap("map.png"); 
                        map.showLocations();
                    }
                        System.out.print("\nChoose a location by entering its number (1-9): ");
                        int choice = Integer.parseInt(scanner.nextLine());
                        Location selected = map.getLocationByIndex(choice - 1);
                        handleLocation(selected);
    
                }
            
            // Once all pieces are collected, show final puzzle
            if(collectedPieces.size() == 9){
                showFinalPuzzle();
            }
        }
        

    }
    // Handles logic for interacting with a selected location
    private void handleLocation(Location location) {
        // If piece from this location is already collected, skip interaction
        if (collectedPieces.contains(location.getName())) {
            System.out.println("You've already found the puzzle piece here. Move to a new place!");
            return;
        }
        // Display location description and action choices
        System.out.println("\n " + location.getDescription());
        System.out.println("What will you do?");
        List<String> options = location.getChoices();
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        // Ask user for their action choice
        System.out.print("Pick an action (1-3): ");
        int action = Integer.parseInt(scanner.nextLine());
        String result = location.getOutcome(action - 1);
        String locName = location.getName();
        // If at special locations and outcome contains a puzzle, grant the sword
        if ((locName.equals("Skull Rock") || locName.equals("Pirate Camp") || locName.equals("Pixie Hollow"))
            && result.toLowerCase().contains("puzzle")) {
            System.out.println("\nYou find a shimmering sword hidden nearby! You take it with you.");
            hasSword = true;
            }

        // If outcome ends the game but the player has the sword, they survive
        if (result.toLowerCase().contains("game over") && hasSword) {
            System.out.println("\nResult: " + result);
            System.out.println("But wait! Your sword helps you fight your way out and survive!");
            System.out.println("You escape and continue your journey.");
            return;
        }

        // Display result of action
        System.out.println("\n Result: " + result);
        // If puzzle piece was found, mark this location as completed
        if (result.contains("puzzle")) {
            collectedPieces.add(location.getName());
        }
    }
    // Displays the final puzzle and ending message once all pieces are collected
    private void showFinalPuzzle() {
        System.out.println("\n All puzzle pieces collected!");
        System.out.println("Assembling final riddle...");
        System.out.println("\nFinal Puzzle:");
        System.out.println("System.out.println(\"Y0u_have_b34ten_th3_j0urney_\");");
        System.out.println("System.out.println(\"return A_plus;\");");
        System.out.println("\n CONGRATS! You earned an A+ in CSC120!");
        System.out.println(" Your prize: Unlimited coffee and debugging wisdom.");
        GifDisplay.showGif("treasure.gif");
    }
}

