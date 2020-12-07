package gr11review.part1;

import java.io.*;

/** 
* A program that asks the user for a sentence and then stores it and collects the following data from it; # of characters, # of spaces, #of letter "a" in the sentence, and the number of odd numbered characters. 
*@author: S. Umaipalan
*
*/

public class Review7 {
  public static void main(String[] args) throws IOException {
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    String strtheSentence;
    int intLength;
    int intCount = 0;
    int intSpace = 0;
    char charLet;
    int intletterCount = 0;
    int intCount2 = 0;
    

    System.out.println("Enter a sentence");
    //Asks user for a sentence
    strtheSentence = keyboard.readLine();
    //Reads the sentence
    intLength = strtheSentence.length();
    //Counts how many characters are in the sentence and changes it into a number
    System.out.println("There are " + intLength +" characters in the sentence");
    //Prints out how many characters there are 
    for(intCount = 0; intCount < intLength; intCount++){ 
      charLet = strtheSentence.charAt(intCount);
      //As long as intCount is less then the lenght of the sentence run the loop and add one count to intCount after each time is runs the loop
      if(charLet == ' ' ){ 
        intSpace ++;
        //Counts how many spaces there are in the sentence
      System.out.println("There are " + intSpace + " spaces in the sentence");
      //Prints out how many spaces there are in the sentence
      }else if(charLet == 'a'||charLet == 'A'){
        intletterCount ++;
        //If charLet = to a or A then add a count to intletterCount
        System.out.println("There are "+ intletterCount +" letter 'a' in the sentence");
        //Print out how many letter a's are in a sentence
      }
    }
      for(intCount2 = 0; intCount2 <= strtheSentence.length(); intCount2++){ 
        //Run loop until intCount2 is less or equal to the length of the sentence
        if(intCount2%2 != 0){
          strtheSentence = strtheSentence.substring(0,intCount2-1) + "-" + strtheSentence.substring(intCount2, strtheSentence.length());
          //Check if a letter is odd and if so replace it with a dash and write the rest of the sentence each time the loop runs. 
        }
    }  
   System.out.println(strtheSentence);
   //print out the sentence with all the odd letters being replaced with dashes
  }
}