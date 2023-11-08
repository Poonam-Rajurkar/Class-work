// WAP to accept number from user and check if it is divisible by 5 or not

import java.util.Scanner;

class Divisible
{
	public static void main(String args[])
	{
		int num;			//Variable declaration
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		num = sc.nextInt();

		if(num % 5 == 0 && num % 3 == 0)
		{
		  System.out.println("The number is divisible by 5 & 3.");
		}
		else if(num % 5 == 0 || num % 3 == 0)
		{
		  System.out.println("The number is divisible by either 5 or 3.");
		}
		else
		{
		   System.out.println("The number is not divisible by 5 or 3.");
		}
	}
}