// WAP to print whether the number is positive,negative or zero

import java.util.Scanner;

class Number
{
	public static void main(String args[])
	{
		int num;			//Variable declaration
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		num = sc.nextInt();	
		
		if(num > 0)  		//Condition
		{
		  System.out.println("The number is positive.");
		}
		else if(num < 0)  		//Condition
		{
		  System.out.println("The number is negative.");
		}
		else
		{
		  System.out.println("The number is zero.");
		}
	}
}