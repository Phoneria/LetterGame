import java.util.ArrayList;
import java.util.List;

public class SymbolPlus extends Symbols{
    @Override
    public Integer[][] getAffectedCoordinates(int x, int y, ArrayList<List<String>> grid) {
        try{
        if (symbols.contains(grid.get(x).get(y - 1)) && symbols.contains(grid.get(x).get(y - 2))) {
            return new Integer[][]{{x, y - 1}, {x, y - 2}};
        }}catch (IndexOutOfBoundsException e){}

        try{ if (symbols.contains(grid.get(x).get(y + 1)) && symbols.contains(grid.get(x).get(y + 2))) {
            return new Integer[][]{{x, y + 1}, {x, y + 2}};
        }}catch (IndexOutOfBoundsException e){}



        try{ if (symbols.contains(grid.get(x - 1).get(y)) && symbols.contains(grid.get(x - 2).get(y))) {
            return new Integer[][]{{x - 1, y}, {x - 2, y}};
        }}catch (IndexOutOfBoundsException e){}

        try{ if (symbols.contains(grid.get(x + 1).get(y)) && symbols.contains(grid.get(x + 2).get(y))) {
            return new Integer[][]{{x + 1, y}, {x + 2, y}};
        } }catch (IndexOutOfBoundsException e){}

        return null;



    }
}
