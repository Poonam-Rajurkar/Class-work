/* WAP to  calculate interest rate of Fixed deposite or Saving intertest based on choice provided by user whether he wants to keep money for fixed deposite or saving .Interest Rate for fixed Deposit is 7 % and for saving it is 3.5%

*/

import java.util.Scanner;

class Bank
{
	public static void main(String args[])
	{
		String input;			//Variable declaration
		double amount,rate,si,time;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("How you want to deposite your money : (Saving / Fixed Deposite)");
		System.out.println("Enter 'fd' for Fixed Deposite & 'sa' for Saving Account : ");		//User input
		input = sc.nextLine();

		switch(input)
		{
		   case "fd":
			System.out.println("How much amount you want to deposite? ");
			amount = sc.nextInt();

			System.out.println("For how long you want to keep your money? (in years)");
			time = sc.nextInt();

			System.out.println("You want to keep your money in Fixed Deposite. the Interest rate will be 7% .");
			si = (amount * 7 * time)/100;
			System.out.println("The Simple Interest on your amount in Fixed Deposite is " + si);
			break;

		   case "sa":
			System.out.println("How much amount you want to deposite? ");
			amount = sc.nextInt();

			System.out.println("For how long you want to keep your money? (in years)");
			time = sc.nextInt();

			System.out.println("You want to keep your money in Savings. the Interest rate will be 3.5% .");
			si = (amount * 3.5 * time)/100;
			System.out.println("The Simple Interest on your amount in Saving Account is " + si);
			break;

		   default:
			System.out.println("Sorry you have entered wrong choice.");
			break;
		}
	}
}