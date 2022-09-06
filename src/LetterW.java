import java.util.ArrayList;
import java.util.List;

public class LetterW extends AllLetters{
    @Override
    public Integer[][] getAffectedCoordinates(int x, int y, ArrayList<List<String>> grid) {
        try{
        if(((((grid.get(x-1).get(y)).equals((grid.get(x-2).get(y))))&& allLetters.contains(grid.get(x-1).get(y)) )   || grid.get(x-1).get(y).equals("W") || grid.get(x-2).get(y).equals("W"))){
            return  new Integer[][]{{x-1,y},{x-2,y}};
        }}catch (IndexOutOfBoundsException e){}

        try{ if((((grid.get(x+1).get(y)).equals(grid.get(x+2).get(y))&&allLetters.contains(grid.get(x+1).get(y)))|| grid.get(x+1).get(y).equals("W") ||grid.get(x+2).get(y).equals("W")) ){
            return  new Integer[][]{{x+1,y},{x+2,y}};
        }}catch (IndexOutOfBoundsException e){}


        try{ if( (((grid.get(x).get(y-1)).equals(grid.get(x).get(y-2))&&allLetters.contains(grid.get(x).get(y-1)) ))|| grid.get(x).get(y-1).equals("W") || grid.get(x).get(y-2).equals("W")){
            return  new Integer[][]{{x,y-1},{x,y-2}};
        }}catch (IndexOutOfBoundsException e){}

        try {if( (((grid.get(x).get(y+1)).equals(grid.get(x).get(y+2))&&allLetters.contains(grid.get(x).get(y+1)) )) || grid.get(x).get(y+1).equals("W") || grid.get(x).get(y+2).equals("W") ) {
            return  new Integer[][]{{x,y+1},{x,y+2}};
        }}catch (IndexOutOfBoundsException e){}



        try{ if((((grid.get(x-1).get(y-1)).equals(grid.get(x-2).get(y-2))&&allLetters.contains(grid.get(x-1).get(y-1)) ))  || grid.get(x-1).get(y-1).equals("W") || grid.get(x-2).get(y-2).equals("W")  ){
            return  new Integer[][]{{x-1,y-1},{x-2,y-2}};
        }}catch (IndexOutOfBoundsException e){}

        try {if((((grid.get(x+1).get(y+1)).equals(grid.get(x+2).get(y+2))&&allLetters.contains(grid.get(x+1).get(y+1)) )) || grid.get(x+1).get(y+1).equals("W") || grid.get(x+2).get(y+2).equals("W")  ){
            return  new Integer[][]{{x+1,y+1},{x+2,y+2}};
        }}catch (IndexOutOfBoundsException e){}


        try{ if((((grid.get(x-1).get(y+1)).equals(grid.get(x-2).get(y+2))&&allLetters.contains(grid.get(x-1).get(y+1)) )) || grid.get(x-1).get(y+1).equals("W") || grid.get(x-2).get(y+2).equals("W") ){
            return  new Integer[][]{{x-1,y+1},{x-2,y+2}};
        }}catch (IndexOutOfBoundsException e){}

        try{ if((((grid.get(x+1).get(y-1)).equals(grid.get(x+2).get(y-2))&&allLetters.contains(grid.get(x+1).get(y-1)) )) || grid.get(x+1).get(y-1).equals("W") || grid.get(x+2).get(y-2).equals("W")){
            return  new Integer[][]{{x+1,y-1},{x+2,y-2}};
        }}catch (IndexOutOfBoundsException e){}

        return null;
    }
}
