
    import java.util.ArrayList;
    import java.util.Scanner;
    
    public class GameEngine {
        private Player player;
        private Map map;
    
        public GameEngine() {
            this.map = new Map();
            this.player = new Player(map.getStartingLocation());
        }
    
        public void startGame() {
            Scanner scanner = new Scanner(System.in);
            while (player.isAlive()) {
                System.out.println("\nYou are at: " + player.getCurrentLocation().getName());
                System.out.println(player.getCurrentLocation().getDescription());
                MapDisplay.showMap("map.png");
    
                System.out.print("Move (N/S/E/W): ");
                String direction = scanner.nextLine();
                player.move(direction, map);
            }
            scanner.close();
        }
    }