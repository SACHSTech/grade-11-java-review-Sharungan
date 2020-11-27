package gr11review.part1;
import java.io.*;

/** 
* A program that asks the user for what kind of joke they want to hear and then outputing a corresonponding joke.
*@author: S. Umaipalan
*
*/

public class Review2{
	public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    
    //variables
    int intJoke;
    
    System.out.println("What kind of joke do you wanna hear?");
    System.out.println("0 - print an joke about your hair");
    System.out.println("1 - print a joke about your feet");
    System.out.println("2 - print a joke about your clothes");
    System.out.println("3 - print a joke about your teacher");
    
    //Calculations 
    intJoke = Integer.parseInt(keyboard.readLine());
    //reads what intJoke value was inputed
    switch(intJoke){
      case 0:
        System.out.println("How does the man on the moon cut his hair?");
        System.out.println("Eclipes it!");
        break;
        //if intJoke = 0 then a joke about hair will be outputed
      case 1:
        System.out.println("My boyfriend told me to stop acting like a flamingo. So I had to put my foot down.");
        break;
        //if intJoke = 1 then a joke about feet will be outputed
      case 2: 
        System.out.println("What kind of clothing should you wear on “ hump day”?");
        System.out.println("Camelflouge!");
        break;
        //if intJoke = 2 then a joke about clothes will be outputed 
      case 3:
        System.out.println("My science teacher makes horrible science jokes, but only periodically");
        break;
        //if intJoke = 3 then a joke about teachers will be outputed
        default:
        //if intJoke is not equal to 0,1,2,3 then invalid menu option will be outputed
          System.out.println("Invalid menu option");

    }
  }
}
