// Character input program.

import java.util.Scanner;

class CharInput
{
	public static void main(String args[])
	{
		String name;
		char gender;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		name = sc.nextLine();
 
		System.out.println("Enter your gender : ");
		gender = sc.next().charAt(0);
		
		if(gender == 'm' || gender == 'M')
		{
			System.out.println("You can do hardwork.");
		}
		else if(gender == 'f' || gender == 'F')
		{
			System.out.println("I can also do HARDWORK.");
		}
		else
		{
			System.out.println("You are welcome but, enter proper input.");
		}
	}
}