 import java.util.Scanner;

 class Question11

{

     public static void main(String args[])

{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number 1 = ");

        int num1 = scanner.nextInt();


        System.out.print("Enter the Number 2 = ");

        int num2 = scanner.nextInt();


      System.out.println("\n***Number Before swap***\n");


      System.out.println("Number 1 = "+num1);

      System.out.println("Number 2 = "+num2);

      System.out.println("\n***Number After swap***\n");

      num1 = num1 + num2 ;

      num2 = num1 - num2;

      num1 = num1 - num2;
      
      System.out.println("Number 1 = "+num1);

      System.out.println("Number 2 = "+num2);


 }

 }