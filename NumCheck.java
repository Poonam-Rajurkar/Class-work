// WAP to check greatest among two numbers using if ..else

import java.util.Scanner;

class NumCheck
{
	public static void main(String args[])
	{
		int num1, num2;			// Variable declaration
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if(num1 < num2)
		{
		  System.out.println(num1 + " is less than " + num2);
		}
		else
		{
		  System.out.println(num1 + " is greater than " + num2);
		}
	}
}