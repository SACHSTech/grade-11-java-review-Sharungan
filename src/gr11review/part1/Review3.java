package gr11review.part1;
import java.io.*;

/** 
* A program prints out all odd numbers from 20 to 100 and then prints out all numbers from 29 to 2 in descending order.
*@author: S. Umaipalan
*
*/

public class Review3{
	public static void main(String[] args) throws IOException{

    //Variables
    int intCount;

    //Calculations    
    for(intCount = 21; intCount < 100; intCount = intCount + 2){
      System.out.println(intCount);
      }
      //intCount starts at 21 and stops at 99 but only prints out every other number
      System.out.println(" ");
    for(intCount = 29; intCount > 1 ; intCount--){
      System.out.println(intCount);
      //intCount starts at 29 and ends at 2 and prints out every number inbetween it in descending order
    }    
  }
}