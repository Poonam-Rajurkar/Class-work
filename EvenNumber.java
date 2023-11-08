// WAP to print even numbers in a range of 1 to 200

class EvenNumber
{  
    public static void main(String args[])   
    {   
        System.out.print("The even numbers from 1 to 200: \n");  
        for(int i=1; i<=200; i++)   
        { 
            if(i%2 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }  
}