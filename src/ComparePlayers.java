public class ComparePlayers implements Comparable<ComparePlayers> {
    // This class compare players scores and list them according to their scores in compareTo section



    private String name;
    private int score;

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    public ComparePlayers(String name,int score){
        this.name=name;
        this.score=score;
    }



    @Override
    public int compareTo(ComparePlayers o1) {
        if(score>o1.score){
            return -1;
        }
        return 1;
    }
}
