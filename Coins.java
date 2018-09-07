// CLass: CSE 1321L
//Section:20
//Term: Fall
//Instructor: Kristin Hegna
//Name: Joshua Merlin
//Lab#: 2
import java.util.Scanner;
public class Coins
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of quarters: ");
      int quarters = input.nextInt();
      System.out.println("Enter number of dimes: ");
      int dimes = input.nextInt();
      System.out.println("Enter number of nickles: ");
      int nickles = input.nextInt();
      System.out.println("Enter number of pennies: ");
      int pennies = input.nextInt();   
      
      System.out.println("You entered " + quarters + " quarters");
      System.out.println("You entered " + dimes + " dimes");
      System.out.println("You entered " + nickles + " nickles");
      System.out.println("You entered " + pennies + " pennies");
      
      double sum1 = (quarters*.25 + dimes*.1 + nickles*.05 + pennies*.01);
      double rem = (sum1%1);
      double dollars =(sum1-rem);
      double cents = (rem*100);
      
      System.out.println("Your total is " +(int)sum1+ " DOllars and " +(int)cents+ " Cents.");
      
       
      
      
   
   
   }
}