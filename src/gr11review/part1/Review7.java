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
    String StrChar;
    int intLength;
    int intCount = 0;
    int intSpace = 0;
    char charLet;


    System.out.println("Enter a sentence");
    strtheSentence = keyboard.readLine();
    intLength = strtheSentence.length();
    System.out.println("There are " + intLength +"   characters in the sentence");
    for(intCount = 0; intCount <=intLength; intCount++){ 
      charLet = strtheSentence.charAt(intCount);
      if(charLet == ' ' ){ 
        intSpace ++;
      }
      System.out.println("There are " + intSpace + " spaces in the sentence");
    }else if(charLet == 'a'||charLet =='b'||charLet =='c')


       

  

  }
}