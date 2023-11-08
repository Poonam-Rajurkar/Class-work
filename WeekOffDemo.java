/*  Switch Case 

switch(ch)
{

	//user input as choice
	case 1:
		code body;
		break;

	case 2:
		code body;
		break;

	case 3:
		code body;
		break;

	default:
		code body;
		break;
}
*/



// WAP to take a number from user and based on that print the weekly off from it.

import java.util.Scanner;

class WeekOffDemo
{
	public static void main(String args[])
	{
		int ch;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number from 1 to 7 to select your weekly off."); 				ch=sc.nextInt();

		switch(ch)
		{
		   case 1:
			System.out.println("Your weekly off is MONDAY!!!!"); 
			break;

		   case 2:
			System.out.println("Your weekly off is TUESDAY!!!!");		
			break;
			
		    case 3:
			System.out.println("Your weekly off is WEDNESDAY!!!!");		
			break;
		
		    case 4:
			System.out.println("Your weekly off is THURSDAY!!!!");		
			break;

 		    case 5:
			System.out.println("Your weekly off is FRIDAY!!!!");		
			break;

		    case 6:
			System.out.println("Your weekly off is SATURDAY!!!!");		
			break;

 		    case 7:
			System.out.println("Your weekly off is SUNDAY!!!!");		
			break;

		    default:
			System.out.println("No weekly off for you");		
			break;
		}
	}
}