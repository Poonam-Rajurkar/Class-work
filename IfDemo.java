// WAP to implement If conditional statement
// Syntax :  if(test condition){-----}
/* Less than: a < b

Less than or equal to: a <= b

Greater than: a > b

Greater than or equal to: a >= b

Equal to a == b

Not Equal to: a != b   */


import java.util.Scanner;

public class IfDemo
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();

		if(num>0)		// This will return Boolean expression (true or false)
		{
		  System.out.println("Welcome to Java Programming");
		}

		System.out.println("You Enjoy");
	}
}
