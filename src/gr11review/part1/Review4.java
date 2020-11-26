package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

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
    // Ask how many items the person wants to buy
    intItems = Integer.parseInt(keyboard.readLine());
    for (intCount = 0; intCount <= intItems; intCount++) {
      System.out.println("What is the price for item " + intCount);
      dblSubtotal = 0;
      dblPrice = Integer.parseInt(keyboard.readLine());
      dblSubtotal = dblSubtotal + dblPrice;
      dblTax = dblSubtotal * 0.13;
      dblTotal = dblSubtotal * 1.13;
      System.out.println("Subtotal " + dblSubtotal);
      System.out.println("Tax " + dblTax);
      System.out.println("intTotal " + dblTotal);
    }
  }
}