// WAP to swap two numbers by using third variable

import java.util.Scanner;

class Swap
{
	public static void main(String args[])
	{
		int num1, num2, temp;

		Scanner sc = new Scanner(System.in);
 
		System.out.println("Enter the firt number : ");
		num1 = sc.nextInt();

		System.out.println("Enter the second number : ");
		num2 = sc.nextInt();

		System.out.println("Before Swapping the numbers : Number1 = " + num1 + "  Number2 = " + num2 );

		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("After Swapping the numbers : Number1 = " + num1 + "  Number2 = " + num2 );
 	}
}
