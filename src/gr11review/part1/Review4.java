package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

/** 
* A program that asks the user for how many items that they want to buy, then asks for the price of each item and calculates and outputs the tax, subtotal and total amount of their purchase.
*@author: S. Umaipalan
*
*/

public class Review4 {
  public static DecimalFormat decimalFormat = new DecimalFormat("0.00");

  public static void main(String[] args) throws IOException {
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Variables
    int intItems;
    double dblPrice;
    double dblSubtotal;
    double dblTax;
    double dblTotal;
    int intCount;

    System.out.println("How many items do you want to buy?");
    dblSubtotal = 0;
    // Ask how many items the person wants to buy
    intItems = Integer.parseInt(keyboard.readLine());
    //reads how many items there are
    for (intCount = 1; intCount <= intItems; intCount++) {
      System.out.println("What is the price for item " + intCount);
      //creates a loop to ask for the prices of each item
      dblPrice = Integer.parseInt(keyboard.readLine());
      //gets the price of each item
      dblSubtotal = dblSubtotal + dblPrice;
      //Adds the prices of each item together 
    }
    dblTax = dblSubtotal * 0.13;
    //how much the tax will be
    dblTotal = dblSubtotal * 1.13;
    //how much the total cost with tax is
    System.out.println("Subtotal " + decimalFormat.format(dblSubtotal));
    //prints out the subtotal
    System.out.println("Tax " + decimalFormat.format(dblTax));
    //prints out how much tax you pay
    System.out.println("intTotal " + decimalFormat.format(dblTotal));
    //prints out total amount 
  }
}