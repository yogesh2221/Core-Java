import java.util.Scanner;

class Question8

{

     public static void main(String args[])

{


        Scanner scanner = new Scanner(System.in);

       System.out.println("***Simple Interest***");

        System.out.print("\nEnter the Principle Amount = ");

       double principle = scanner.nextDouble();


       System.out.print("Enter the Rate of interest = ");

      double  rateOfInterest = scanner.nextDouble();


      System.out.print("Enter the Time  = ");

      double time = scanner.nextDouble();


   double final_amount = (principle *  rateOfInterest  * time)/100  ;


      System.out.print("Final Amount to be paid is  = " +final_amount  );

     


    }

}