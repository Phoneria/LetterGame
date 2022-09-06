import java.util.ArrayList;
import java.util.List;

public class LetterT extends AllLetters{

    //It first looks up coordinates, if there is no T then it looks down. If both doesn't have T than it will return nothing

    @Override
    public Integer[][] getAffectedCoordinates(int x,int y,ArrayList<List<String>> grid) {
        try{
        if(grid.get(x-1).get(y).equals("T")&&grid.get(x-2).get(y).equals("T")){
            return  new Integer[][]{{x-1,y},{x-2,y}};
        }}catch (IndexOutOfBoundsException e){}

        try{ if(grid.get(x+1).get(y).equals("T")&&grid.get(x+2).get(y).equals("T")){
            return  new Integer[][]{{x+1,y},{x+2,y}};
        }}catch (IndexOutOfBoundsException e){}

        return null;

    }
}
