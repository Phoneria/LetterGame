import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class RankPrinter {
    // This constructor sort players and writes our player's place
    public RankPrinter(ArrayList<ComparePlayers> players,String name,int totalScore,PrintWriter printWriter,PrintWriter boardWriter){

        ArrayList<String> namesBefore = new ArrayList<>();
        ArrayList<Integer> scoresBefore = new ArrayList<>();

        players.add(new ComparePlayers(name,totalScore));


        for(ComparePlayers s: players) {
            namesBefore.add(s.getName());
            scoresBefore.add(s.getScore());
        }// This list's hold out first situation. It is important to write leaderboard with same way again


        Collections.sort(players);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();

        for(ComparePlayers s: players) {
            names.add(s.getName());
            scores.add(s.getScore());
        }



        if(names.get(0).equals(name)){
            printWriter.println("Your rank is 1/"+names.size()+", your score is " + (scores.get(0)-scores.get(1))+" points higher than "+names.get(1) );
        }
        else if(names.get(names.size()-1).equals(name)){
            printWriter.println("Your rank is "+names.size()+"/"+names.size()+", your score is "+ (scores.get(scores.size()-2)-scores.get(scores.size()-1))+" lower than "+ names.get(names.size()-2) );
        }

        else {
            printWriter.println("Your rank is "+ (names.indexOf(name)+1) + "/"+names.size() + ", your score is "+ (scores.get(names.indexOf(name)-1)-scores.get(names.indexOf(name))) +" lower than " + names.get(names.indexOf(name)-1)+ " "+ (scores.get(names.indexOf(name))-scores.get(names.indexOf(name)+1))+" points higher than " +names.get(names.indexOf(name)+1));

        }

        for(int i = 0;i<names.size();i++){
            boardWriter.println(namesBefore.get(i)+" "+ scoresBefore.get(i));
        }


    }
}
