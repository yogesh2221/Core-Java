import java.util.Scanner;
class Question16
{
   public static void main(String args[])
   {
	  Scanner scanner = new Scanner(System.in);

      System.out.println("******Table******");

      System.out.print("Enter the number to print table = ");

      int number  = scanner.nextInt();

    for( int i = 1 ; i<=10  ;  i++ )
	{

    System.out.println(number + " * " + i + " = " + number*i);

     }
   }
}