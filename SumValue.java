 // CLass: CSE 1321L
//Section:20
//Term: Fall
//Instructor: Kristin Hegna
//Name: Joshua Merlin
//Lab#: 2
 import java.util.Scanner;
 public class SumValue
 {
   public static void main(String[] args)
      {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number for X: ");
      double userInput = input.nextDouble();
      
      System.out.println("Enter a number for Y: ");
      double userDouble = input.nextDouble();
      
      System.out.println("Enter a number for Z: ");
      double userNumber = input.nextDouble();
      
      double sum = (userInput + userDouble + userNumber);
      
      double avg = (sum / 3);
      
      
      if (userInput!=9) {
      System.out.println("X = " + userInput);
      }
      
      if (userDouble!=9) {
      System.out.println("Y = " + userDouble);
      }
      
      if (userNumber!=9) {
      System.out.println("Z = " + userNumber);
      }
      
      System.out.println("Average = " + avg);
      
      
      }
}