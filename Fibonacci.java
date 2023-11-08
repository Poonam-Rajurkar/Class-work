// WAP to print fibonacci series
// 0   1    1    2  3     5   8

class Fibonacci
{
	public static void main(String args[])	
	{
		int num1 = 0, num2 = 1;
    
		System.out.println("Fibonacci Series is : ");

    		for (int i = 1; i <= 10; i++)
		{
      		  System.out.print(num1 + ", ");

      		  int num3 = num1 + num2;
      		  num1 = num2;
      		  num2 = num3;
		}
	}
}