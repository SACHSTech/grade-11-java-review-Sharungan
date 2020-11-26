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
      if(intMonth == 1 && intDay <= 31){
        intCount = 0;
        if(intMonth == 2 && intDay <=28){
          intCount = 31;
          if(intMonth == 3 && intDay <=31){
            intCount = 59;
            if(intMonth == 4 && intDay <=30){
              intCount = 90;
              if(intMonth == 5 && intDay <=31){
                intCount = 120;
                if(intMonth == 6 && intDay <=30){
                  intCount = 151;
                  if(intMonth == 7 && intDay <=31){
                    intCount = 181;
                    if(intMonth == 8 && intDay <=31){
                      intCount = 212;
                      if(intMonth == 9 && intDay <=30){
                        intCount = 243;
                        if(intMonth == 10 && intDay <=31){
                          intCount = 273;
                          if(intMonth == 11 && intDay <=30){
                            intCount =304;
                            if(intMonth == 12 && intDay <=31){
                              intCount = 335;
                              intTotal = intCount + intDay;
                              System.out.println(intTotal);
                            }
                          }
                        }
                      }
                    }                             
                  }
                }
              } 
            }
          }
        }
      }
    }
  }
}