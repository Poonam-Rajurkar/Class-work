/* "Amar" is HDFC bank customer his Balance is 25000. After  some time He trasfered 11000 amount to his friend "Surya".Print the current balance and find interest value on that amount with interest value 2%  and 12months?

write a java program to find given below employee allowances based on given salary?
*/


import java.util.Scanner;

class HDFC
{
	public static void main(String args[])
	{
		int money, bal = 25000, si, interestValue = 2, time = 12;			//Variable declaration
		Scanner sc = new Scanner(System.in);

		System.out.println("You have Current Balance in you account is " + bal);
		
		System.out.println("Enter money you want to transfer to your friend : ");
		money = sc.nextInt();
		
		bal = bal - money;
		System.out.println("Current Balance = " + bal);

		si = (bal * interestValue * time)/100;
		System.out.println("The interest value on your current balance is " + si);
	}
}