// WAP to calculate Total salary of employee 

import java.util.Scanner;
class Salary
{
	public static void main(String args[])
	{
		int basicSal;
		float da;			//variable for storing daily allowance
		double hra,grossSal; 

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Basic Salary : ");
		basicSal = sc.nextInt();

		System.out.println("Enter your Daily Allowance : ");
		da = sc.nextFloat();

		System.out.println("Enter your Housing Rent Allowance : ");
		hra = sc.nextDouble();

		grossSal = basicSal + da + hra;
		System.out.println("The Total Salary is " + grossSal);

		sc.close();			//To close the Scanner connection
	}
}