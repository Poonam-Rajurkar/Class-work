// WAP to check whether the number is palindrome or not


import java.util.Scanner;

class PalindromeNum 
{
	public static void main(String[] args) 
	{
    		int input, reverse = 0, rem;		//variable declaration

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		input = sc.nextInt();
    
		int num = input;
    
 		while (num != 0) 			//Condition
		{
      		   rem = num % 10;
      		   reverse = reverse * 10 + rem;
      		   num = num / 10;
   		}
    
 		if (input == reverse) 	
		{
      		   System.out.println(input + " is a Palindrome.");
    		}
    		else 
		{
      		   System.out.println(input + " is not a Palindrome.");
    		}
  	}
}