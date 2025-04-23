public class Player {
    private Location currentLocation;
    private boolean alive = true;

    public Player(Location startLocation) {
        this.currentLocation = startLocation;
    }

    public void move(String direction) {
        Location newLocation = currentLocation);
        if (newLocation != null) {
            currentLocation = newLocation;
        } else {
            System.out.println("Can't go that way!");
        }
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public boolean isAlive() {
        return alive;
    }
}