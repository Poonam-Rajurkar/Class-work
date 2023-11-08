/* WAP that takes a year from the user and prints whether it is a leap year or not.

	Leap Year is a year having 366 days. A year said to be leap year if the following
	conditions are satisfied:
	. The year is a multiple of 400.
	. The year is multiple of 4 but not 100.
*/

import java.util.Scanner;

class LeapYear
{
	public static void main(String args[])
	{
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any year:");
		year=sc.nextInt();

		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
		  System.out.println(year + " is leap year");
		}
		else
		{
		  System. out.println (year + " is not a leap year");
		}
	}
}