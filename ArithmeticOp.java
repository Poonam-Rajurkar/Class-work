// Program to demonstrate the use of arithmetic operators.

import java.util.Scanner;

class ArithmeticOp
{
	public static void main(String args[])
	{
		int num1, num2, result;		//declaration of variables
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		result = num1 + num2;
		System.out.println(" Addition = " + result);

		result = num1 - num2;
		System.out.println(" Substraction = " + result);

		result = num1 * num2;
		System.out.println(" Multiplication = " + result);

		result = num1 / num2;
		System.out.println(" Division = " + result);

		result = num1 % num2;			// Modulus(%) gives you remainder value

		System.out.println(" Modulus = " + result);
	}
}