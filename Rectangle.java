import java.util.*;
public class Rectangle
{
   public static void main (String[] args)
   {
   int width;
   int height;
   int area;
   int perimeter;
   
   //asign value to int width
   width=4;
   //assign value to int height
   height=8;
   
   area = width * height;
   perimeter = width + width + height + height;
   
   
   System.out.println("The width of the rectangle is " +width);
   System.out.println("The height of the rectangle is " +height);
   System.out.println("The area of the rectangle is " +area);
   System.out.println("The perimeter of the rectangle is " +perimeter);
   
   }
}