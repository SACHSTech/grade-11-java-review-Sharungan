package gr11review.part1;

import java.io.*;

/** 
* A program that asks for a yearly amount, annual compound interest rate and outputs the number of years.
*@author: S. Umaipalan
*
*/

public class Review5 {
  public static void main(String[] args) throws IOException {
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    //Variables
    double dblYearlyAmount;
    double dblTarget;
    double dblInterest;
    double dblYear;
    double dblFutureValue;
    dblYear = 0;
    dblFutureValue = 0;
   
    System.out.print("What is the target amount: ");
    dblTarget = Double.parseDouble(keyboard.readLine());
    //Asks user for target amount and then reads dblTarget

    System.out.print("Enter the yearly invested amount: ");
    dblYearlyAmount = Double.parseDouble(keyboard.readLine());
    //Asks user for yearly amount and then reads dblYearlyAmount
    System.out.print("Enter the compound interest: ");
    dblInterest = Double.parseDouble(keyboard.readLine());
    //Asks for interest and then reads dblInterest
   
    while(dblFutureValue < dblTarget ){ 
      //while my Future value is less then the target value continue to run loop
      dblFutureValue += dblYearlyAmount;
      //dblFutureValue equals to itself plus dblYearlyAmount
      dblFutureValue = dblFutureValue + (dblFutureValue*(dblInterest/100));
      //dblFutureValue is now equal to its self plus its interest rate
      dblYear += 1;
      //adds a year for everytime this loop is run
    }
      System.out.print("It takes this " + dblYear +" years to reach your target amount");
      //prints out how many years it takes to reach target amount 

    
  }
}