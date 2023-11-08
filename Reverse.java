// WAP to accept number from  user and do reverse of it

import java.util.Scanner;

class Reverse
{
	public static void main(String args[])
	{
		int num, n, rev = 0;
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the number : ");
        	num = sc.nextInt();
       
		 while(num > 0)
       		 {
           	   n = num % 10;
           	   rev = rev * 10 + n;
                   num = num / 10;
       		 }
       		 System.out.println("Reverse of a Number is "+rev);	
	}
}
