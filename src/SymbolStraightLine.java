import java.util.ArrayList;
import java.util.List;

public class SymbolStraightLine extends Symbols {
    @Override
    public Integer[][] getAffectedCoordinates(int x, int y, ArrayList<List<String>> grid) {
        try{
        if (symbols.contains(grid.get(x - 1).get(y)) && symbols.contains(grid.get(x - 2).get(y))) {
            return new Integer[][]{{x - 1, y}, {x - 2, y}};
        } }catch (IndexOutOfBoundsException e){}

        try{ if (symbols.contains(grid.get(x + 1).get(y)) && symbols.contains(grid.get(x + 2).get(y))) {
            return new Integer[][]{{x + 1, y}, {x + 2, y}};
        }}catch (IndexOutOfBoundsException e){}

        return null;

    }
}
