import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Jewels {

     public static ArrayList<List<String>> blowUp(int firstX, int firstY,Integer[][] integerList, ArrayList<List<String>> grid){
          int secondX = integerList[0][0];
          int secondY = integerList[0][1];
          int thirdX = integerList[1][0];
          int thirdY = integerList[1][1];

          if(secondY == thirdY){
               ArrayList<Integer> numbers = new ArrayList<>();
               numbers.add(firstX);numbers.add(secondX);numbers.add(thirdX);
               Collections.sort(numbers);
               thirdX = numbers.get(2);
               secondX = numbers.get(1);
               firstX = numbers.get(0);

          }//If points places in same y-axis, then this section will sort the coordinates acoording to their x-axis for blowing up
          // If I didn't sort this elements according to their x-axis, there will be wrong output

          grid.get(firstX).set(firstY," ");// It blows chosen coordinate
          grid.get(secondX).set(secondY," ");
          grid.get(thirdX).set(thirdY," ");


          for(int i = firstX ; i>0;i--){
               grid.get(i).set(firstY,grid.get(i-1).get(firstY));
          }// It fills the blank

          grid.get(0).set(firstY," ");// The first coordinate was remaining same because of the 29th line. So that I have assign it as blank

          for(int i = secondX ; i>0;i--){
               grid.get(i).set(secondY,grid.get(i-1).get(secondY));
          }
          grid.get(0).set(secondY," ");
          for(int i = thirdX ; i>0;i--){
               grid.get(i).set(thirdY,grid.get(i-1).get(thirdY));
          }
          grid.get(0).set(thirdY," ");
          return grid;
     } // This function blows up the element and drops which elements up to that element
     //It is static, because I think it will be easier for me to use this function

     public abstract Integer[][] getAffectedCoordinates(int x,int y,ArrayList<List<String>> grid);
     //Every letter will bring different coordinate according to map. Because of that, this list must be abstract


     public static int setScore(String letter){
          int increase = 0;
          if(letter.equals("D") ){increase = 30;}
          else if(letter.equals("S")|| letter.equals("T")){increase =15;}
          else if(letter.equals("W")){increase = 10;}
          else {increase = 20;}

          return increase;
     }
     // It makes our job easier to calculate score according to letter in that coordinate


}
