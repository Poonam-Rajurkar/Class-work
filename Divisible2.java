// WAP to accept number from user and check if it is divisible by 5 and 11

import java.util.Scanner;

class Divisible2
{
	public static void main(String args[])
	{
		int num;			//Variable declaration
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		num = sc.nextInt();

		if(num % 5 == 0 && num % 11 == 0)
		{
		  System.out.println("The number is divisible by 5 & 11.");
		}
		else
		{
		   System.out.println("The number is not divisible by 5 & 11.");
		}
	}
}