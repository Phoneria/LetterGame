import java.util.ArrayList;
import java.util.List;

public class SymbolMinus extends Symbols{
    @Override
    public Integer[][] getAffectedCoordinates(int x, int y, ArrayList<List<String>> grid) {
        try{
        if (symbols.contains(grid.get(x).get(y - 1)) && symbols.contains(grid.get(x).get(y - 2))) {
            return new Integer[][]{{x, y - 1}, {x, y - 2}};
        }}catch (IndexOutOfBoundsException e){}

        try{ if (symbols.contains(grid.get(x).get(y + 1)) && symbols.contains(grid.get(x).get(y + 2))) {
            return new Integer[][]{{x, y + 1}, {x, y + 2}};
        }}catch (IndexOutOfBoundsException e){}



        return null;


    }
}
