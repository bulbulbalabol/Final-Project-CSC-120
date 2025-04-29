
import java.util.*;

public class GameEngine {
    private Map map;
    private Scanner scanner;

    private Set<String> collectedPieces;

    public GameEngine() {
        map = new Map();
        scanner = new Scanner(System.in);
        collectedPieces = new HashSet<>();
    }

    // Y/N

    public void startGame() {
        while(collectedPieces.size() < 9){
            if (collectedPieces.size() == 0){
                System.out.println(" WELCOME TO WONDERLAND QUEST ");
                System.out.println("\n You are on your journey.");
                MapDisplay.showMap("map.png"); 
                map.showLocations();
    
                System.out.print("\nChoose a location by entering its number (1-9): ");
                int choice = Integer.parseInt(scanner.nextLine());
                Location selected = map.getLocationByIndex(choice - 1);
                handleLocation(selected);
            }
            if (collectedPieces.size() != 0 && collectedPieces.size() < 9) {
                System.out.println("\n You are on your journey.");
                System.out.println("Would you like to see the map? Respond with Y or N.");
                String response = scanner.nextLine();
                    if(response.equals("Y") || response.equals("y")){
                        MapDisplay.showMap("map.png"); 
                        map.showLocations();
                        System.out.print("\nChoose a location by entering its number (1-9): ");
                        int choice = Integer.parseInt(scanner.nextLine());
                        Location selected = map.getLocationByIndex(choice - 1);
                        handleLocation(selected);
                    }
                    else{
                        System.out.print("\nChoose a location by entering its number (1-9): ");
                        int choice = Integer.parseInt(scanner.nextLine());
                        Location selected = map.getLocationByIndex(choice - 1);
                        handleLocation(selected);
                    }
    
                }
            
        
            if(collectedPieces.size() == 9){
                showFinalPuzzle();
            }
        }
        

    }

    private void handleLocation(Location location) {
        if (collectedPieces.contains(location.getName())) {
            System.out.println("You've already found the puzzle piece here. Move to a new place!");
            return;
        }

        System.out.println("\n " + location.getDescription());
        System.out.println("What will you do?");
        List<String> options = location.getChoices();
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }

        System.out.print("Pick an action (1-3): ");
        int action = Integer.parseInt(scanner.nextLine());
        String result = location.getOutcome(action - 1);
        System.out.println("\n Result: " + result);

        if (result.contains("puzzle")) {
            collectedPieces.add(location.getName());
        }
    }

    private void showFinalPuzzle() {
        System.out.println("\n All puzzle pieces collected!");
        System.out.println("Assembling final riddle...");
        System.out.println("\nFinal Puzzle:");
        System.out.println("System.out.println(\"Y0u_have_b34ten_th3_j0urney_\");");
        System.out.println("System.out.println(\"return A_plus;\");");
        System.out.println("\n CONGRATS! You earned an A+ in CSC120!");
        System.out.println(" Your prize: Unlimited coffee and debugging wisdom.");
    }
}
