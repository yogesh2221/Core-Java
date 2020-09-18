import java.util.Scanner;
class Question14

{

     public static void main(String args[])

{
          Scanner scanner = new Scanner(System.in);
  
         System.out.print("\nEnter the year = ");
          int year = scanner.nextInt();

       if (year%4==0 && year%100!=0 || year%400 == 0)

   {

          System.out.println("\nGiven year " +year+" is leap year");
        
  }

    else

         {

                    System.out.println("Given year " +year+" is not leap year");

       }
        


 }

 }