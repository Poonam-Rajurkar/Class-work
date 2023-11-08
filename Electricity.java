/* Question 2
Given an integer U denoting the amount of KWh units of electricity consumed, the task is to calculate the electricity bill with the help of the below charges:
.	1 to 100 units – Rs. 10/unit

·      100 to 200 units – Rs. 15/unit

·      200 to 300 units – Rs. 20/unit

·      above 300 units – Rs. 25/unit
*/

import java.util.Scanner;

class Electricity
{
	public static void main(String args[])
	{
		int unit, bill;			//Variable declaration
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of units you consumed this month : ");
		unit = sc.nextInt();

		if(unit <= 100)			// Condition
		{
		  bill = unit * 10;
		  System.out.println("Your bill amount for this month is " + bill);
		}
		else if(unit > 100 && unit <=200)
		{
		  bill = (100*10) + (unit-100)*15; 
		  System.out.println("Your bill amount for this month is " + bill);
		}
		else if(unit > 200 && unit <= 300)
		{
		  bill = (100*10) + (100*15) + (unit-200)*20;
		  System.out.println("Your bill amount for this month is " + bill);
		}
		else
		{
		  bill = (100*10) + (100*15) + (100*20) + (unit-300)*25;
		  System.out.println("Your bill amount for this month is " + bill);
		}
	}
}