import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MapWriter {
    // This class writes map
    public static void writeMap(ArrayList<List<String>> grid, PrintWriter printWriter){

        for(int i = 0;i<grid.size();i++) {
            for (int j = 0; j < grid.get(i).size(); j++) {
                printWriter.print(grid.get(i).get(j)+" ");
            }
            printWriter.println();

        }
    }
}
