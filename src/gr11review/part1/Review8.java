package gr11review.part1;

import java.io.*;

/** 
* A program that does 1000 slot pulls and shows the 3 numbers you pull each time and counts how many triples you get and displays it at the end.  
*@author: S. Umaipalan
*
*/

public class Review8 {

  public static void main(String[] args) throws IOException {
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    //variables
    int intPull1;
    int intPull2;
    int intPull3;
    int intCount;
    int intTriple;

    intCount = 0;
    intTriple = 0;

    //loop to pull 1000 times 
    for(intCount = 0; intCount <= 1000; intCount++){
      intPull1 = (int)(Math.random()*9) + 0;
      //gets a random number for pull1
      intPull2 = (int)(Math.random()*9) + 0;
      //gets a random number for pull2
      intPull3 = (int)(Math.random()*9) + 0;
      //gets a random number for pull3
      System.out.print(intPull1 + " ");
      //prints out pull1 results
      System.out.print(intPull2 + " ");
      //prints out pull2 results
      System.out.print(intPull3 + " ");
      //prints out pull3 results
      System.out.println("");
      if(intPull1 == intPull2 && intPull3 == intPull1){
        intTriple ++; 
        //Checks if intPull1, intPull2, intPull3 are all equal, if so then add a counter to intTriple
      }
    }
      System.out.println("...");
      System.out.println("You got "+ intTriple + " Triple Pulls");
      //Prints out how many triples you got 
  }
}