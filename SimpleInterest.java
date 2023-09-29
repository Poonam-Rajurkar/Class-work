// WAP to calculate Simple Interest

import java.util.Scanner;			//importing package

class SimpleInterest
{
	public static void main(String args[])
	{
		double pa, r, t, si;	/* variable to store principal amount, rate of interest,
					   time and simple interest */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Principal amount : ");
		pa = sc.nextDouble();
		
		System.out.println("Enter the Rate of Interest : ");
		r = sc.nextDouble();

		System.out.println("Enter the Time : ");
		t = sc.nextDouble();

		si  = (pa*r*t)/100; 			// Formula to calculate SI
	
		System.out.println("The Simple Interset = " + si);
	}
}