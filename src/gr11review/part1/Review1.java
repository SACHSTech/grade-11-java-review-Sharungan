package gr11review.part1;
import java.io.*;

public class Review1{
	public static void main(String[] args) throws IOException{
    
    //Variables
    int intMonth;
    int intDay;
    int intCount;
    int intTotal;

    //Getting info
    System.out.print("Enter month number");
    //asks for the number of the month
    intMonth = Integer.parseInt(keyboard.readLine());
    //reads what month number has been chosen
    if(intMonth <= 12){
      //there are only 12 months so this restricts what numbers you can input 
      System.out.print("Enter day number");
      //asks for the day
      intDay = Integer.parseInt(keyboard.readLine());
      //reads what day it is
      if(intMonth == 1 || intMonth == 3 || intMonth == 5 || intMonth == 7 || intMonth == 8 || intMonth == 10 || intMonth == 12){
        intCount = 31;
      }
      if(intMonth == 4 || intMonth == 6 || intMonth == 9 || intMonth == 11){
        intCount = 30;
      }
      if(intMonth == 2){
        intCount = 28;
      }

      intTotal = intCount + intDay;
      System.out.println(intTotal);
    }
  }
}