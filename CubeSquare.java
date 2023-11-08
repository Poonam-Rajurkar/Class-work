/*  WAP to take a integer as a input from user. If it is odd find cube of it otherwise find 
    square of that number. (Do not accept the input as zero.)
*/

import java.util.Scanner;

class CubeSquare
{
	public static void main(String args[])
	{
		int num, cube, sq;			//Variable declaration
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		num = sc.nextInt();

		if(num == 0)
		{
		  System.out.println("Zero is not acceptable.");
		}
		else if(num % 2 == 0)
		{
		  sq = num * num;
		  System.out.println("Square of the given number is " + sq);
		}
        	else
		{
		  cube = num * num * num;
            	  System.out.println("Cube of the given number is " + cube);
		}
	}
}
