import java.util.Scanner;

class Question10
{
  public static void main(String args[])
  
 {
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("Convert Fahreneit to Celsius:--");
   
   System.out.println("Enter the Fahreneit Value = ");
   
   double f = scanner.nextDouble();
   
   double celsius = 5*(f-32)/9 ;
   
   System.out.println("\nCelsius = " +celsius);
 }
}