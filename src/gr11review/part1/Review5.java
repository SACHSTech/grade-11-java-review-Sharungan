package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

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
   
    System.output.print("What is the target amount");
    dblTarget = Double.parseDouble(key.readLine());

    System.output.print("Enter the yearly invested amount:");
    dblYearlyAmount = Double.parseDouble(key.readLine());
    System.output.print("Enter the compound interest:");
    dblInterest = Double.parseDouble(key.readLine());
    System.output.print("Enter the target amount:");
    dblTarget = Double.parseDouble(key.readLine());
    
    while(dblFutureValue < dblTarget ){
      intYear ++; 
      dblFutureValue = dblYearlyAmount + (dblYearlyAmount * (dlbInterest/100));
      System.output.print("It takes this" + dblYear +"s to reach your target amount");

    }
  }
}