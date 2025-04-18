
public class Location {
    
    //Attributes
    private String name;
    private String description;
    private Boolean hasPuzzlePiece;
    private Boolean hasSword;

        /*Default constructor */
        public Location(String name, String description, Boolean hasPuzzlePiece) {
            this.name = name;
            this.description = description;
            this.hasPuzzlePiece = hasPuzzlePiece;
        }
    
        /* Overloaded constructor with sword */
        public Location(String name, String description, Boolean hasPuzzlePiece, Boolean hasSword) {
            this.name = name;
            this.description = description;
            this.hasPuzzlePiece = hasPuzzlePiece;
            this.hasSword = hasSword; // Override
        }

        public Location(String name, String description, Boolean hasPuzzlePiece, Boolean hasSword, Boolean hasEnemy) {
            this.name = name;
            this.description = description;
            this.hasPuzzlePiece = hasPuzzlePiece;
            this.hasSword = hasSword; // Override


        }
    














        
    








    private void Location(String name, String description, Boolean hasPuzzlePiece){
        this.name = name;
        this.description = description;
        this.hasPuzzlePiece = hasPuzzlePiece;

        if(name == "Skull Rock"){
            //what happens at this location
        }
        else if(name == "Blue Mountains"){

        }
        else if(name == "Mermaid Lagoon"){

        }
        else if(name == "Tropical Forest"){

        }
        else if(name == "Desert"){

        }
        else if(name == "Pirate Camp"){

        }
        else if(name == "Monster Cove"){

        }
        else if(name == "Toadstool Field"){

        }
        else if(name == "Ice Land"){

        }
    }
}
