/* Mr.John wants to buy a car but he needs color of the car as blue.And In Car showroom THere Are black,white,Red and blue cars Are available.Now Accept some basic Information from the user and based on that make decision whether blue car is available or not.

Basic info(Cust_name,brand,color)

Based on that color print a msg  "john Congradulation you purchased your dream car of blue color +brand

MR.XYZ wants to buy a car of his color choice.But In showRoom there are different colors car available(black,white,Red,blue).Greet the customer with thae brand and color he purchased.

*/

import java.util.Scanner;

class Car
{
	public static void main(String args[])
	{
		String name, brand, color;			//Variable declaration
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");			//User input
		name = sc.nextLine();

		System.out.println("Which brand of car want?" + "\n (Maruti, Toyota, Marcedez, Oddi, Hundai)");
		brand = sc.nextLine();	

		System.out.println("What color you want? " + "\n (Black, White, Red, Blue)");
		color = sc.nextLine();	

		switch(color)					//Switch case
		{
		   case "Black":
			System.out.println("Congratulations!!! Mr./Mrs. " + name );
			System.out.println("You purchased your dream car of " + color + " color and " +brand + " brand.");
			break;

		   case "White":
			System.out.println("Congratulations!!! Mr./Mrs. " + name );
			System.out.println("You purchased your dream car of " + color + " color and " +brand + " brand.");
			break;

		   case "Red":
			System.out.println("Congratulations!!! Mr./Mrs. " + name );
			System.out.println("You purchased your dream car of " + color + " color and " +brand + " brand.");
			break;

		   case "Blue":
			System.out.println("Congratulations!!! Mr./Mrs. " + name );
			System.out.println("You purchased your dream car of " + color + " color and " +brand + " brand.");
			break;

		   default:
			System.out.println("Sorry " + color + " and " + brand + " car is not available in showroom.");
		 	break;

		}
	}
}