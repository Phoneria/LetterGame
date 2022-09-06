import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Reader class reads txt file and convert them an array
        Reader gridReader = new Reader(args[0]);// It reads gridGame.txt file
        ArrayList<List<String>> grid = new ArrayList<>();

        for(String s:gridReader.getReadFile()){
            String[] tempGrid = s.split(" ");
            List<String> tempList = new ArrayList<>();

            for(String i:tempGrid){
                tempList.add(i);
            }
            grid.add(tempList);
        }// It converts txt array matrix to arrayList matrix


        ArrayList<String> commands = new ArrayList<>();
        Reader commandReader = new Reader(args[1]);


        for(String s: commandReader.getReadFile()){
            commands.add(s);
        }// It adds command.txt lines to commands arraylist


        Reader leaderBoardReader = new Reader("leaderboard.txt");// It reads leaderboard.txt file

        ArrayList<ComparePlayers> players = new ArrayList<>();
        for(String s:leaderBoardReader.getReadFile()){
            String[] features = s.split(" ");
            players.add(new ComparePlayers(features[0],Integer.valueOf(features[1])));
        }// It appends all players to players list as a ComparePlayers object


        // Writer class provides us to writes outputs to chosen txt file
        Writer writer = new Writer("monitoring.txt");
        PrintWriter printWriter= new PrintWriter(writer.getFileWriter());



        Writer boardwriter = new Writer("leaderboard.txt");
        PrintWriter boardWriter= new PrintWriter(boardwriter.getFileWriter(),true);// true means that, file will append new object


        Iterator<String> iterator = commands.iterator();// I have convert commands to iterator to read file with easier way

        SetScore totalScore = new SetScore(0);// Total score assigned as zero. It will be increasing according to opertors
        printWriter.println("Game grid : ");
        printWriter.println();
        MapWriter.writeMap(grid,printWriter);// It writes map



        while(iterator.hasNext()){
            String command = iterator.next();
            int score = 0;
            printWriter.println();
            printWriter.println("Select coordinate or enter E to end the game: " + command);
            printWriter.println();
            if(command.equals("E")){
                String name = iterator.next();
                printWriter.println("Total score: "+ totalScore.getScore() + " points");
                printWriter.println();
                printWriter.println("Enter name: "+ name);
                printWriter.println();
                new RankPrinter(players,name,totalScore.getScore(),printWriter,boardWriter);
                //It compares players and write our player's place
                printWriter.println();
                printWriter.println("Good Bye!");
            }

            else{new ElseSection(command,grid,score,totalScore,printWriter);}
            // Else section was too long. So that, I have separate it with a constructor to make Main class look clear

        }



        try {
            writer.getFileWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }//It closes monitoring.txt
        try {
            boardwriter.getFileWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }//It closes leaderboard.txt















    }

}
