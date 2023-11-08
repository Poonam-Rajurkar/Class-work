/*  While Loop Syntax	
	declaration and initialization of variable;
	while(test condition)
	{
	   code body;
	}
*/


// WAP a program to accept numbers from user and find sum of digits
/* enter a number : 5678
   sum = 5+6+7+8
   rem=num%10
   sum=sum+rem
   num=num/10
*/


import java.util.Scanner;

class SumOfDigit
{  
    public static void main(String args[])   
    {   
	int rem, sum=0;
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number (more than 2 digits) : ");
	int num = sc.nextInt();
  
        while(num > 0)  
        { 
           rem = num % 10;
	   sum = sum + rem;
	   num = num / 10;
        }
	System.out.println("Sum of the digits : " + sum);
    }  
}
