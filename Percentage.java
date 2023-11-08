/* WAP to accept percentage from the user and make a decision as per below condition:
per>=75 distinction
per<75 and per>60 first class
per<60 and per>=45 second class
35 to 45 pass class otherwise fail  */

import java.util.Scanner;

class Percentage
{
	public static void main(String args[])
	{
		int per;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your percentage : ");
		per = sc.nextInt();

		if(per >= 75)
		{
		  System.out.println("Distinction");
		}
		else if(per < 75 && per > 60)
		{
		  System.out.println("First Class");
		}
		else if(per < 60 && per >= 45)
		{
		  System.out.println("Second Class");
		}
		else if(per < 45 && per >= 35)
		{
		  System.out.println("Pass Class");
		}
		else
		{
		  System.out.println("Fail");
		}
	}
}