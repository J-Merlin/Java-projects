import java.util.Scanner;
public class NextMeeting
{
public static void main (String[]args)
{
Scanner input = new Scanner(System.in);
System.out.println("Today is: ");


int dayToday = input.nextInt();
System.out.println("Days to the meeting is ");

int daysToMeeting = input.nextInt();
int total = (dayToday+daysToMeeting)%7;
switch(dayToday){
case 0: System.out.println("Today is Sunday");
   break;
case 1: System.out.println("Today is Monday");
   break;
case 2: System.out.println("Today is Tuesday");
   break;
case 3: System.out.println("Today is Wednesday");
   break;
case 4: System.out.println("Today is Thursday");
   break;
case 5: System.out.println("Today is Friday");
   break;
case 6: System.out.println("Today is Saturday");
   break;
}
System.out.println("Days to the meeting is " +daysToMeeting+" days");

switch(total){
case 0: System.out.println("Your meeting is Sunday");
   break;
case 1: System.out.println("Your meeting is Monday");
   break;
case 2: System.out.println("Your meeting is Tuesday");
   break;
case 3: System.out.println("Your meeting is Wednesday");
   break;
case 4: System.out.println("Your meeting is Thursday");
   break;
case 5: System.out.println("Your meeting is Friday");
   break;
case 6: System.out.println("Your meeting is Saturday");
   break;
  }
  
  }
  
}

 
 
    
 
 
   
   
