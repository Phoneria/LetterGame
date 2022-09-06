import java.util.ArrayList;
import java.util.List;

public class LetterS extends AllLetters{
    @Override
    public Integer[][] getAffectedCoordinates(int x, int y, ArrayList<List<String>> grid) {
        try{
        if(grid.get(x).get(y-1).equals("S")&&grid.get(x).get(y-2).equals("S")){
            return  new Integer[][]{{x,y-1},{x,y-2}};
        }}catch (IndexOutOfBoundsException e){}

        try{
         if(grid.get(x).get(y+1).equals("S")&&grid.get(x).get(y+2).equals("S")) {
            return  new Integer[][]{{x,y+1},{x,y+2}};
        }}catch (IndexOutOfBoundsException e){}
        return null;
    }
}
