// WAP to calculate average of three numbers

import java.util.Scanner;			//importing package

class Average
{
	public static void main(String args[])
	{
		double num1, num2, num3;		//Declaration of variable
		double avg;
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First number : ");
		num1 = sc.nextDouble();

		System.out.println("Enter the Second number : ");
		num2 = sc.nextDouble();

		System.out.println("Enter the Third number : ");
		num3 = sc.nextDouble();

		avg = (num1 + num2 + num3)/3;		// Formula for calculate average of three numbers

		System.out.println("Average of the numbers " + num1 + ", " + num2 + ", " + num3 + "= " + avg );
	}
}