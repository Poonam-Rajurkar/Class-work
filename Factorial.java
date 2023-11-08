/* Write a Java program that prompts the user to enter a positive integer and calculates its factorial using a while loop. The program should display the factorial as the output.

fact=fact*i
*/

import java.util.Scanner;

class Factorial 
{
	public static void main(String[] args) 
	{
		int num, i = 1; 
		long factorial = 1;		//variable declaration

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = sc.nextInt();
       
		while(i <= num)				//Condition
        	{
           	  factorial = factorial * i;
            	  i++;
        	}
        	
		System.out.println("Factorial of " + num + " is " + factorial);
    	}
}