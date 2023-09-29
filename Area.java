// WAP to get area of rectangle

import java.util.Scanner;				//importing package

class Area
{
	public static void main(String args[])
	{
		double l,b,area;			// Declaration of variables

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the lenght of a rectangle : ");	//User input
		l = sc.nextDouble();

		System.out.println("Enter the breadth of a rectangle : ");	//user input
		b = sc.nextDouble();

		area = l * b;				//Formula to calculate Area of rectangle

		System.out.println("Area of a rectangle = " + area);
	}
}
		