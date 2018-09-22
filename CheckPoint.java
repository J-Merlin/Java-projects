import java.util.Scanner;
public class CheckPoint
{
public static void main (String[]args)
{int x, y;
Scanner input = new Scanner(System.in);

System.out.println ("X-Coordinate is: ");
   x=input.nextInt();
System.out.println ("Y-Coordinate is: ");
   y=input.nextInt();
   
if (x==0 && y==0){
   System.out.println("("+x+","+y+") is the origin point");
   
}
else if (x==0&&y!=0){
System.out.println("("+x+","+y+") on the y-axis");
}
else if (y==0&&x!=0){
System.out.println("("+x+","+y+") on the x-axis");
}


else if(x < 0&&y<0) {
   System.out.println("("+x+","+y+") is in 3rd quadrant");
   
}
else if 

 (y<0&&x>0) {
   System.out.println("("+x+","+y+") is in the 4th quadrant");
}   
else if 

 (y>0&&x>0) {
   System.out.println("("+x+","+y+") is in the 1th quadrant");
} 
else if 

 (y>0&&x<0) {
   System.out.println("("+x+","+y+") is in the 2th quadrant");
} 

   

    
    }
 
 }
   