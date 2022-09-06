import java.util.ArrayList;
import java.util.Arrays;

public abstract class AllLetters extends Jewels{
    // This class provide us a list. In letterW section we check that, the chosen coordinate is letter or something else

    public ArrayList<String> allLetters = new ArrayList<String>(Arrays.asList("W","D","T","S"));


    // All letter classes check their neighbours situations according to their characteristic condition and return a list according to that situation
    // And also they all catch IndexOutOfBoundsException. If there is an exception, they are going to pass another line


}
