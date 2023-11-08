/*
WAP to create basic calculator using switch case

1.Addition 2.Subtraction 3.Multiplication  4.Division

*/

import java.util.Scanner;

class Calculator
{
	public static void main(String args[])
	{
		int ch, num1, num2, result;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter operation you want to perform" +  
			"\n (1.Addition 2.Subtraction 3.Multiplication  4.Division 5.Modulus) : "); 	
		ch=sc.nextInt();

		switch(ch)
		{
		   case 1:
			System.out.println("Enter first number : "); 			
			num1=sc.nextInt();
			System.out.println("Enter second number : "); 			
			num2=sc.nextInt();
			result = num1 + num2;
			System.out.println("Addition of " + num1 + " and " + num2 + " = " + result);
			break;

		   case 2:
			System.out.println("Enter first number : "); 			
			num1=sc.nextInt();
			System.out.println("Enter second number : "); 			
			num2=sc.nextInt();
			result = num1 - num2;
			System.out.println("Substraction of " + num1 + " and " + num2 + " = " + result);
			break;

		   case 3:
			System.out.println("Enter first number : "); 			
			num1=sc.nextInt();
			System.out.println("Enter second number : "); 			
			num2=sc.nextInt();
			result = num1 * num2;
			System.out.println("Multiplication of " + num1 + " and " + num2 + " = " + result);
			break;

		   case 4:
			System.out.println("Enter first number : "); 			
			num1=sc.nextInt();
			System.out.println("Enter second number : "); 			
			num2=sc.nextInt();
			result = num1 / num2;
			System.out.println("Division of " + num1 + " and " + num2 + " = " + result);
			break;

		   case 5:
			System.out.println("Enter first number : "); 			
			num1=sc.nextInt();
			System.out.println("Enter second number : "); 			
			num2=sc.nextInt();
			result = num1 % num2;
			System.out.println("Modulus of " + num1 + " and " + num2 + " = " + result);
			break;

 		   default:
			System.out.println("You have entered a wrong choice.");
			break;
		}
	}
}