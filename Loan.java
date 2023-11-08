/* Question 3.
	WAP to check whether the person is eligible for getting loan or not.

        Condition to grant loan is he should have salary more than 50000 and He should be citizen of INDIA.Otherwise Loan can't be given to customer.
*/

import java.util.Scanner;

class Loan 
{
	public static void main(String[] args) 
	{
		double salary;				//variable declaration
		String country;				//variable declaration
	
		Scanner sc = new Scanner(System.in);		//Creating Scanner object

		System.out.println("Please enter your salary : ");		//user input
		salary = sc.nextDouble();

		if(salary >= 50000)		//codition to check if user is elligible for loan or not
		{
			System.out.println("You are citizen of which country? ");
			country = sc.next();
			
			if(country.equals("INDIAN") || country.equals("indian") || country.equals("Indian") || country.equals("india"))
			{
			  System.out.println("Congratulations, you are eligible for getting loan.");
			}
		}
		else
		{
			System.out.println("Sorry, you are not eligible for getting loan.");
		}
	}
}