import java.util.ArrayList;

public class Inventory {
    //Atributes
    private ArrayList<Integer> puzzlePieceList;

    private Inventory(ArrayList<Integer> puzzlePieceList){
        this.puzzlePieceList = puzzlePieceList;
    }

    private void addPuzzlePiece(Location location, int index){
        if(location.getHasPuzzlePiece() == true){
            if(location.getOutcome(index).toString().contains("puzzle") == true){
                puzzlePieceList.add(Map.getIndexByLocation(location));
            }
        }
        location.setHasPuzzlePiece(false);
    }





}
