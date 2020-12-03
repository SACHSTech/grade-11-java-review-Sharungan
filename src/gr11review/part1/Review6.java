package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

/** 
* A program that asks the user for the price of items and adds the prices until user inputs zero, then it calculates the final subtotal, tax and total price of all the items. 
*@author: S. Umaipalan
*
*/

public class Review6 {
  public static DecimalFormat decimalFormat = new DecimalFormat("0.00");

  public static void main(String[] args) throws IOException {
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Variables
    double dblPrice;
    double dblSubtotal;
    double dblTax;
    double dblTotal;
    int intCount;

    dblPrice = -1;
    intCount = 0;
    dblSubtotal = 0;
    
    while(dblPrice != 0){
      //While the user doesn't input the price of an item is zero the loop will run
      intCount++;
      //Counter for how many items the person is buying
      System.out.print("Enter the price for item "+intCount+":");
      //Asks user for price of item
      dblPrice = Double.parseDouble(keyboard.readLine()); 
      //Reads the price of item
      dblSubtotal = dblSubtotal + dblPrice;
      //Subotal is equal to the previous subtotal plus the price of the new item
    }
    System.out.println("Subtotal: "+ decimalFormat.format(dblSubtotal));
    //prints out subtotal
    dblTax = dblSubtotal * 0.13;
    dblTotal = dblSubtotal *1.13;
    System.out.println("Tax: "+ decimalFormat.format(dblTax));
    //prints out tax
    System.out.println("Total: " + decimalFormat.format(dblTotal));
    //prints out total price
  }
}