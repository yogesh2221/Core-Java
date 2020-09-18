import java.util.Scanner;
class Question13

{
     public static void main(String args[])

{
          Scanner scanner = new Scanner(System.in);

          System.out.println("\n***Using if else statement***\n");

          System.out.print("Enter the Number 1 = ");
          int num1 = scanner.nextInt();

          System.out.print("Enter the Number 2 = ");
          int num2 = scanner.nextInt();

          System.out.print("Enter the Number 3 = ");
          int num3 = scanner.nextInt();


     if( num1>num2 && num1>num3 )

{
      
       System.out.println("\nNumber 1 is greater = "+num1);

}

   else if( num2 > num3)

{

        System.out.println("\nNumber 2 is greater = "+num2);

}

   else

     {

               System.out.println("\nNumber 3 is greater = "+num3);

     }

        System.out.println("\n****Using ternary operater****");

         int temp = (num1>num2) ? num1:num2;

        int result = (num3>temp) ? num3 : temp;

        System.out.println( "\nNumber which is greater = "+result);         

}

  }