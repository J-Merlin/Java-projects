// CLass: CSE 1321L
//Section:20
//Term: Fall
//Instructor: Kristin Hegna
//Name: Joshua Merlin
//Lab#: 2
import java.util.Scanner;
public class SimpleMath
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a value for R: ");
      double R = input.nextDouble();
      System.out.println("Enter a value for T: ");
      double T = input.nextDouble();  
      
      double sum = (R + T);
      double dif = (R - T);
      double pro = (R * T);
     
      
      System.out.println("R = " + R);
      System.out.println("T = " + T);
      System.out.println("R + T = " + sum);
      System.out.println("R - T = " + dif);
      System.out.println("R * T = " + pro);
      



      
   
   
   
   }
}