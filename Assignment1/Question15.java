import java.util.Scanner;

class Question15

{

     public static void main(String args[])

{
          Scanner scanner = new Scanner(System.in);

         System.out.print("\nEnter your Gender = ");

         char gender = scanner.next().charAt(0);

          System.out.print("\nEnter your Age = ");

         int age = scanner.nextInt();


       if (gender == 'm')

    {

         if(age>=21 && age <=59)
  {
          System.out.print("\nMale is eligible for Marriage ");
    }

    else if(age>=60) 

         System.out.print("\nYour are Dbar");

 }

    else if(gender == 'f')

{

    if(age>=18 && age<=45)  

{

      System.out.print("\nFemale is eligible for Marriage ");

}

   else if(age>=46)

        System.out.print("\nYou are Dbar");

   }

  else

     {

             System.out.print("\nInvalid Gender ");

      }

   }
  }