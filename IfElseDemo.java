// If Else conditional Statement
/*	if(test condition)
	{
	  block of code;
	}
	else
	{
	  block of code;
	}
*/

// WAP to identify whether the number is positive or not

import java.util.Scanner;

class IfElseDemo
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("_____ Enter a number ______");
		num = sc.nextInt();

		if(num>0)
		{
		  System.out.println("You have entered a positive number.");
		}
		else
		{
		   System.out.println("You have entered a negative number.");
		}
	}
}
