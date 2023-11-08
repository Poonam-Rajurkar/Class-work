/*    Question 1

St. Xavier School displays a notice on the school notice board regarding admission in Std. XI for choosing different streams, according to marks obtained in English, Maths and Science in ICSE Examinations.

Marks obtained in diff. subjects		Stream

Eng. Maths and Science >= 80%			Pure Science

Eng and Science >= 80% Maths >= 60%		Bio. Science

Eng. Maths and Science >= 60%			Commerce

Print the appropriate stream allotted to the candidate. Write a program in Java to accept marks in English, Maths and Science from the console.

Sample Input:

99, 100,96

Sample Output: Eligiable for pure science
*/

import java.util.Scanner;

class Stream
{
	public static void main(String args[])
	{
		int eng, maths, sci;			//Variable declaration
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your percentage in English : ");
		eng = sc.nextInt();

		System.out.println("Enter your percentage in Maths : ");
		maths = sc.nextInt();

		System.out.println("Enter your percentage in Science : ");
		sci = sc.nextInt();

		if(eng >= 80 && maths >= 80 && sci >= 80)
		{
		   System.out.println("You are allotted the stream 'Pure Science'. ");
		}
		else if(eng >= 80 && sci >= 80 && maths >= 60)
		{
		   System.out.println("You are allotted the stream 'Bio Science'. ");
		}
		else if(eng >= 60 && maths >= 60 && sci >= 60)
		{
		   System.out.println("You are allotted the stream 'Commerce'. ");
		}
		else
		{
		   System.out.println("You are not selected for any stream.");
		}
	}
}