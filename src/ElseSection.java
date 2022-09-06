import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
/*
Burada hep aynı şeyi tekrar etmektense fonksiyon yazıp içine atabilirmişiz. Onu raporda belirtebilirsin
 */
public class ElseSection {

    // This class is unnecessary but it makes Main class look clean

    public ElseSection(String command, ArrayList<List<String>> grid, int score, SetScore totalScore, PrintWriter printWriter){
        AllLetters letterT = new LetterT();
        AllLetters letterD = new LetterD();
        AllLetters letterW = new LetterW();
        AllLetters letterS = new LetterS();

        Symbols plus = new SymbolPlus();
        Symbols minus = new SymbolMinus();
        Symbols reverseSlash =new SymbolReverseSlash();
        Symbols slash = new SymbolSlash();
        Symbols straightLine = new SymbolStraightLine();

        // We have created objects from class's

        String[] coordinates = command.split(" ");
        int x = (Integer.valueOf(coordinates[0]) );
        int y= (Integer.valueOf(coordinates[1]));// Take coordinate from command.txt

        if(grid.get(x).get(y).equals(" ")){
            printWriter.println("Please enter a valid number");
        }//If entered coordinate is empty, this will operate

        else if(grid.get(x).get(y).equals("T")){
            if(letterT.getAffectedCoordinates(x,y,grid)==null){
                // This checks if there is an effect. For example if T didn't affect any coordinate, this list will return null
                // If it affect any letter, this list will return effected coordinate
            }
            else {
                Integer[][] i = letterT.getAffectedCoordinates(x,y,grid);//This list keeps affected coordinate in matrix

                score+=Jewels.setScore(grid.get(i[0][0]).get(i[0][1]));// This line is increasing score according to letter in that cordinate
                score+=Jewels.setScore(grid.get(i[1][0]).get(i[1][1]));
                score+=Jewels.setScore(grid.get(x).get(y));

                Jewels.blowUp(x,y,i,grid);// This line is blowing up the coordinates and fill the blanks
            }
            MapWriter.writeMap(grid,printWriter);//It prints map
            printWriter.println();
            printWriter.println("Score : "+ score +" points " );
        }
        else if(grid.get(x).get(y).equals("S")){
            if(letterS.getAffectedCoordinates(x,y,grid)==null){

            }
            else {
                Integer[][] i = letterS.getAffectedCoordinates(x,y,grid);

                score+=Jewels.setScore(grid.get(i[0][0]).get(i[0][1]));
                score+=Jewels.setScore(grid.get(i[1][0]).get(i[1][1]));
                score+=Jewels.setScore(grid.get(x).get(y));

                Jewels.blowUp(x,y,i,grid);
            }
            MapWriter.writeMap(grid,printWriter);
            printWriter.println();
            printWriter.println("Score : "+ score +" points " );
        }
        else if(grid.get(x).get(y).equals("D")){
            if(letterD.getAffectedCoordinates(x,y,grid)==null){


            }
            else {
                Integer[][] i = letterD.getAffectedCoordinates(x,y,grid);

                score+=Jewels.setScore(grid.get(i[0][0]).get(i[0][1]));
                score+=Jewels.setScore(grid.get(i[1][0]).get(i[1][1]));
                score+=Jewels.setScore(grid.get(x).get(y));

                Jewels.blowUp(x,y,i,grid);
            }
            MapWriter.writeMap(grid,printWriter);
            printWriter.println();
            printWriter.println("Score : "+ score +" points " );
        }
        else if(grid.get(x).get(y).equals("W")){
            if(letterW.getAffectedCoordinates(x,y,grid)==null){

            }
            else {
                Integer[][] i = letterW.getAffectedCoordinates(x,y,grid);

                score+=Jewels.setScore(grid.get(i[0][0]).get(i[0][1]));
                score+=Jewels.setScore(grid.get(i[1][0]).get(i[1][1]));
                score+=Jewels.setScore(grid.get(x).get(y));

                Jewels.blowUp(x,y,i,grid);
            }
            MapWriter.writeMap(grid,printWriter);
            printWriter.println();
            printWriter.println("Score : "+ score +" points " );
        }
        else if(grid.get(x).get(y).equals("/")){
            if(slash.getAffectedCoordinates(x,y,grid)==null){

            }
            else {
                Integer[][] i = slash.getAffectedCoordinates(x,y,grid);

                score+=Jewels.setScore(grid.get(i[0][0]).get(i[0][1]));
                score+=Jewels.setScore(grid.get(i[1][0]).get(i[1][1]));
                score+=Jewels.setScore(grid.get(x).get(y));

                Jewels.blowUp(x,y,i,grid);
            }
            MapWriter.writeMap(grid,printWriter);
            printWriter.println();
            printWriter.println("Score : "+ score +" points " );
        }
        else if(grid.get(x).get(y).equals("-")){
            if(minus.getAffectedCoordinates(x,y,grid)==null){

            }
            else {
                Integer[][] i = minus.getAffectedCoordinates(x,y,grid);

                score+=Jewels.setScore(grid.get(i[0][0]).get(i[0][1]));
                score+=Jewels.setScore(grid.get(i[1][0]).get(i[1][1]));
                score+=Jewels.setScore(grid.get(x).get(y));

                Jewels.blowUp(x,y,i,grid);
            }
            MapWriter.writeMap(grid,printWriter);
            printWriter.println();
            printWriter.println("Score : "+ score +" points " );
        }
        else if(grid.get(x).get(y).equals("+")){
            if(plus.getAffectedCoordinates(x,y,grid)==null){

            }
            else {
                Integer[][] i = plus.getAffectedCoordinates(x,y,grid);

                score+=Jewels.setScore(grid.get(i[0][0]).get(i[0][1]));
                score+=Jewels.setScore(grid.get(i[1][0]).get(i[1][1]));
                score+=Jewels.setScore(grid.get(x).get(y));

                Jewels.blowUp(x,y,i,grid);
            }
            MapWriter.writeMap(grid,printWriter);
            printWriter.println();
            printWriter.println("Score : "+ score +" points " );

        }
        else if(grid.get(x).get(y).equals("\\")){
            if(reverseSlash.getAffectedCoordinates(x,y,grid)==null){

            }
            else {
                Integer[][] i = reverseSlash.getAffectedCoordinates(x,y,grid);

                score+=Jewels.setScore(grid.get(i[0][0]).get(i[0][1]));
                score+=Jewels.setScore(grid.get(i[1][0]).get(i[1][1]));
                score+=Jewels.setScore(grid.get(x).get(y));

                Jewels.blowUp(x,y,i,grid);
            }
            MapWriter.writeMap(grid,printWriter);
            printWriter.println();
            printWriter.println("Score : "+ score +" points " );
        }
        else if(grid.get(x).get(y).equals("|")){
            if(straightLine.getAffectedCoordinates(x,y,grid)==null){

            }
            else {
                Integer[][] i = straightLine.getAffectedCoordinates(x,y,grid);

                score+=Jewels.setScore(grid.get(i[0][0]).get(i[0][1]));
                score+=Jewels.setScore(grid.get(i[1][0]).get(i[1][1]));
                score+=Jewels.setScore(grid.get(x).get(y));

                Jewels.blowUp(x,y,i,grid);
            }
            MapWriter.writeMap(grid,printWriter);
            printWriter.println();
            printWriter.println("Score : "+ score +" points " );
        }
        totalScore.setScore(score);// It add score to totalcore


    }
}
