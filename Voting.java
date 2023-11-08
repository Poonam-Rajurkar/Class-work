// WAP to check whether user is eligible for vote or not

import java.util.Scanner;

class Voting
{
	public static void main(String args[])
	{
		int age;				// Variable declaration
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		age = sc.nextInt();

		if(age>18)
		{
		  System.out.println("You are eligible to vote. ");
		}
		else
		{
		  System.out.println("You are not eligible to vote. ");
		}
	}
}
