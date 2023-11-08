/* WAP to accept the salary from the user and make a decision as per given condition : 
.	sal>=50000      print "I am happy"
.	sal>=75000  print "I have better life"
.	sal>-=100000 print "My family is happy with me"
*/

import java.util.Scanner;

class UserSalary
{
	public static void main(String args[])
	{
		int sal;
		Scanner sc =  new Scanner(System.in);
	
		System.out.println("Enter your salary : ");
		sal = sc.nextInt();

		if(sal>=50000 && sal<75000)
		{
		  System.out.println("I am happy. ");
		}
		else if(sal >= 75000 && sal<100000)
		{
		  System.out.println("I have better life. ");
		}
		else if(sal>=100000)
		{
		  System.out.println("My family is happy with me. ");
		}
		else
		{
		   System.out.println("I am not happy with my job");
		}
	}
}