/*	if(test codition)
	{
	  body of the code.
	}
	else if(test codition)
	{
	  body of the code.
	}
	else
	{
	  code body
	}

*/

// WAP to check whether the number entered by user is greater than 50, lessthan 50 or more than 100, print correct message accordingly.

import java.util.Scanner;

class CheckNum
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		num = sc.nextInt();

		if(num > 50 && num<=100)
		{
		  System.out.println("You have entered value greater than 50. ");
		}
		else if(num > 100)
		{
		  System.out.println("You have entered value greater than 100. ");
		}
		else
		{
		  System.out.println("You have entered value less than 50. ");
		}
	}
}