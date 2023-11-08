// WAP to accept score of two team (say India and Pakistan) based on score make a decision who won the match or match draw

import java.util.Scanner;

class CricketMatch
{
	public static void main(String args[])
	{
		int india, pak;			//Variable declaration	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the score of India : ");
		india = sc.nextInt();

		System.out.println("Enter the score of Pakistan : ");
		pak = sc.nextInt();

		if(india>pak)
		{
		   System.out.println("Team India won the match. ");
		}
		else if(india == pak)
		{
		   System.out.println("The match is draw. ");
		}
		else 
		{
		   System.out.println("Team Pakistan won the match. ");
		}
	}
}