// WAP to check whether the number is armstrong number or not.

/*	153 = (3)^3 + (5)^3 + (1)^3
	    = 27 + 125 + 1
	    = 153			... This is armstrong number.

	321 = (1)^3 + 2^3 + 3^3
	    = 1 + 8 + 27
	    = 36			... This is not armstrong number.
*/

import java.util.Scanner;

class ArmstrongNum 
{
	public static void main(String[] args) 
	{
		int num, y, x, sum = 0;			//variable declaration

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = sc.nextInt();
	
		y = num;
		while (y != 0)				//Condition
        	{
            	  x = y % 10;
                  sum = sum + (x*x*x);
                  y = y / 10;
        	}

        	if(sum == num)
		{
            	  System.out.println(num + " is Armstrong number.");
		}
        	else
		{
              	  System.out.println(num + " is not Armstrong number.");
		}
    	}
}