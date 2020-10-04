 import java.util.*;

   class MathOperation

{

       static int add(int num1 , int num2)
    {
 
          // System.out.print("Addition of two number = ");

             return num1 + num2;

     }

        static int sub(int num1 , int num2)
    {
 
           //System.out.print("Substration of two number = ");

             return num1 - num2;

     }

          static int multiply(int num1 , int num2)
    {
 
         //  System.out.print("Multiply of two number = ");

             return num1 * num2;

     }

       static int power(int num1,int num2)

    {
          
             int power = 1 ;

            for(int i = 0 ; i<=num2 ; i++)

              power *= num1 ;
   
              return  power ;
}

     static void show(int result)

{

      System.out.println(result);
     
  } 

   }

         public class Question35

{

   public static void main(String args[])

{

       Scanner scanner = new Scanner(System.in);    
          
       System.out.print("Enter number 1 = ");
        int number1  = scanner.nextInt();

        System.out.print("Enter number 2 = ");
        int number2  = scanner.nextInt();

       System.out.print("Addition of two number = ");

       int temp1 =  MathOperation.add(number1,number2);

       MathOperation.show(temp1);

        System.out.print("Substration of two number = ");

       int temp2 =  MathOperation.sub(number1,number2);

       MathOperation.show(temp2);

     
        System.out.print("Multiply of two number = ");

       int temp3 =  MathOperation.multiply(number1,number2);

       MathOperation.show(temp3);

       System.out.print("Power of two number = ");

       int temp4 =  MathOperation.power(number1,number2);

       MathOperation.show(temp4);

     
       

}

 }

      