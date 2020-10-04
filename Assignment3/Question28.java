import java.util.Scanner;
class Question28
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the size of string array:");
		//int n = sc.nextInt();
		System.out.println("Enter the Strings:-");
		String arr[] = new String[5];
		for(int i=0;i<5;i++)
		{
			arr[i] = sc.next();
		}
		for(int j=0;j<5;j++)
		{
		System.out.println(arr[j]);
		}
	}
}