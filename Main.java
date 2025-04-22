public class Main {
   public static void main(String[] args) {
    System.out.println("WELCOME TO WONDERLAND");

    //Insert image of map
    MapDisplay.showMap("map.png");

    GameEngine engine = new GameEngine();
        engine.startGame();
   }
}



