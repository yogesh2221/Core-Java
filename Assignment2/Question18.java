import java.util.*;
class Question18
{
    public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int temp = 0;
		System.out.println("Check Prime Number:-");
		System.out.println("Enter the number:-");
		
		int number = scanner.nextInt();
		for(int i=0;i<number/2;i++)
		{
			if(number % i == 0)
				
				{
					System.out.println("Number is Not Prime");
					temp = 1;
					break;
				}
		}
		if(temp == 0)
		{
			System.out.println("Number is Prime");
		}
	}
}