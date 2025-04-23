import java.awt.Image;
import java.util.ArrayList;
public class Treasure {

    //Attributes
    private String currentLocation;
    private Image map;
    private ArrayList<String> inventory;

    private Treasure(String currentLocation, Image map, ArrayList<String> inventory){
      this.currentLocation = currentLocation;
      this.map = map;
      this.inventory = inventory;

    }

    


    
    private void Treasure(Boolean isFound){
        if(isFound == true){
           // Eva suggested an image of the trasure pop up, saying something along the lines of "you have won the game!"
        }
        else{
           System.out.println("The treasure has yet to be found!");
        }
     }
     
    


}
