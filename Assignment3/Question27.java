import java.util.Scanner;
class Question27
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers:-");
		int arr[] = new int[10];
		for(int i=0;i<5;i++)
		{
			arr[i] = sc.nextInt();
		}
		int greatest=arr[0];
		int smaller=arr[0];
		for(int j=1;j<5;j++)
		{
			if(smaller>arr[j])
			{
				smaller=arr[j];
			}
			if(greatest<arr[j])
			{
				greatest=arr[j];
			}
		}
		System.out.println("Gretest Number is "+greatest+" And Smaller Number is "+smaller);
	 
	}
}