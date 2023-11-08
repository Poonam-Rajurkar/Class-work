/*   Looping Statements
	

	Syntax :
	for(initialization;test condition;inc/dec)
	{
	  code body;
	}
*/

// WAP to print Hello World 20 times

class ForDemo
{
	public static void main(String args[])
	{
		int i;
		for(i=1; i<=20; i++)		// i=i+1
		{
		  System.out.println("Hello World!");
		}
		 System.out.println("----------------------------");
		for(i=20; i>=1; i--)		// i=i-1
		{
		  System.out.println("Welcome to Java");
		}
	}
}