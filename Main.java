import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
    System.out.println("WELCOME TO WONDERLAND");

    //Insert image of map
    MapDisplay.showMap("map.png");

    Scanner input = new Scanner(System.in);
    System.out.println("Where would you like to go?");
    String response = input.nextLine();


   }
}









