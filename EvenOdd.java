// WAP to check whether the number is even or odd

import java.util.Scanner;

class EvenOdd
{
	public static void main(String args[])
	{
		int num;			// Variable declaration
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		
		if(num % 2 == 0)
		{
		  System.out.println(num + " is even number.");
		}
        	else
		{
            	  System.out.println(num + " is odd number.");
		}
	}
}