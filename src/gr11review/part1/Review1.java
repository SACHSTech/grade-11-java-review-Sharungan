package gr11review.part1;
import java.io.*;

public class Review1{
	public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    
    //Variables
    int intMonth;
    int intDay;
    int intCount;
    int intTotal;

    //Getting info
    System.out.println("Enter month number");
    //asks for the number of the month
    intMonth = Integer.parseInt(keyboard.readLine());
    //reads what month number has been chosen
    if(intMonth <= 12 && intMonth >=1 ){
      //there are only 12 months so this restricts what numbers you can input 
      System.out.println("Enter day number");
      //asks for the day
      intDay = Integer.parseInt(keyboard.readLine());
      //reads what day it is

      // Calculations
      if(intMonth == 1 && intDay <= 31){
        intCount = 0;
        //if January start count at 0
        }else if(intMonth == 2 && intDay <=28){
          intCount = 31;
          //if Febuary start count at 31 because you add the days of the previous month
          }else if(intMonth == 3 && intDay <=31){
            intCount = 59;
            //if March start count at 59 becuase you add the days of the previous months
           }else if(intMonth == 4 && intDay <=30){
              intCount = 90;
              //if April start count at 90 becuase you add the days of the previous months
              }else if(intMonth == 5 && intDay <=31){
                intCount = 120;
                //if May start count at 120 because you add the days of the previous months
                }else if(intMonth == 6 && intDay <=30){
                  intCount = 151;
                  //if June start count 151 because you add the days of the previous months
                  }else if(intMonth == 7 && intDay <=31){
                    intCount = 181;
                    //if July start count at 181 becuase you add the days of the previous months
                    }else if(intMonth == 8 && intDay <=31){
                      intCount = 212;
                      //if August start count at 212 because you add the days of the previous months
                      }else if(intMonth == 9 && intDay <=30){
                        intCount = 243;
                        //if September start count at 243 because you add the days of the previous months
                        }else if(intMonth == 10 && intDay <=31){
                          intCount = 273;
                          //if October start count at 273 becuase you add the days of the previous months
                          }else if(intMonth == 11 && intDay <=30){
                            intCount =304;
                            //if November start count at 304 becuase you add the days of the previous months
                            }else if(intMonth == 12 && intDay <=31){
                              intCount = 335;
                              //if December start count at 335 because you add the days of the previous months
                              intTotal = intCount + intDay;
                              //Total number of days is equal to the sum of the previous months plus the day of the current month
                              System.out.println("Day "+intTotal);
                              //prints out the total number of days
      }
    }
  }
}