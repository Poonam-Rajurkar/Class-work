// WAP to take three numbers as input and find the largest number among them.

import java.util.Scanner;

class LargestNum
{
	public static void main(String args[])
	{
		int num1, num2, num3;			//Variable declaration
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the three numbers : ");
		num1 = sc.nextInt();	
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1>=num2 && num1>=num3)  		//Condition to check num1 is largest than other or not
		{
		  System.out.println(num1 + " is the largest number.");  
		} 
		else if(num2>=num1 && num2>=num3)	/*Condition to compare num2 with num1 and num3  
							  if both comes true then num2 is largest */ 
		{  
		  System.out.println(num2 + " is the largest number.");  
		}
		else  					//num3 will be largest if both coditions false  
		{
		  System.out.println(num3 + " is the largest number.");  
		}  
	}
}
