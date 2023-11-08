/* Question 1.
	WAP to find greatest among three using nested if. 
*/

import java.util.Scanner;

class GreatestNum
{
	public static void main(String args[])
	{
		int num1, num2, num3;				//Variable declaration
		Scanner sc = new Scanner(System.in);		//Creating Scanner object

		System.out.println("Enter three numbers : ");	//user input
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1 >= num2) 				//codition to check greatest number
      		{
      			if(num1 >= num3)
        	 	{
           		  System.out.println(num1 + " is greatest number.");
        		}
         		else
         		{
            		  System.out.println(num3 + " is greatest number.");
         		}
      		} 
      		else 
      		{
        	 	if(num2 >= num3)
         		{
            		  System.out.println(num2 + " is greatest number.");
         		}
         		else
         		{
            		  System.out.println(num3 + " is greatest number.");
         		}
      		}
	}
}