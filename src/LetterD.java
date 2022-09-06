import java.util.ArrayList;
import java.util.List;

public class LetterD extends AllLetters{
    @Override
    public Integer[][] getAffectedCoordinates(int x, int y, ArrayList<List<String>> grid) {
        try {
            if (grid.get(x - 1).get(y - 1).equals("D") && grid.get(x - 2).get(y - 2).equals("D")) {
                return new Integer[][]{{x - 1, y - 1}, {x - 2, y - 2}};
            }
        }catch (IndexOutOfBoundsException e){}
        try {
         if(grid.get(x+1).get(y+1).equals("D")&&grid.get(x+2).get(y+2).equals("D")){
            return  new Integer[][]{{x+1,y+1},{x+2,y+2}};
        }}catch (IndexOutOfBoundsException e){}



        try{
         if(grid.get(x-1).get(y+1).equals("D")&&grid.get(x-2).get(y+2).equals("D")){
            return  new Integer[][]{{x-1,y+1},{x-2,y+2}};
        }}catch (IndexOutOfBoundsException e){}
        try{
         if(grid.get(x+1).get(y-1).equals("D")&&grid.get(x+2).get(y-2).equals("D")){
            return  new Integer[][]{{x+1,y-1},{x+2,y-2}};
        }}catch (IndexOutOfBoundsException e){}
        return null;
    }
}
