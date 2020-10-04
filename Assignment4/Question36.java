import java.util.*;

  class MathOp

{

       void multiply(int num1,int num2)

 {

          int result = num1 + num2;

         System.out.println("Mutilpy of two integres = "+ result);

 }

     void multiply(float num1 , float num2,float num3)
     {

          double result = num1 + num2 + num3 ;

           System.out.println("Mutilpy of three float = " + result);

    }


     void multiply(int array[])
{
  

        int mul  = 1;
     for(int i = 0 ; i<array.length ; i++)

  {

       

            mul = mul * array[i] ;

     }

            System.out.println(mul);
        
      
     }

     void multiply(int num1 , double num2)
{

         double result = num1 + num2 ;

       System.out.println(result);

   }

  }   


         public class Question36
{

   public static void main(String args[])

{

      MathOp m1 = new MathOp();

      Scanner scanner = new Scanner(System.in);

      System.out.println("********Two integers*********");

      m1.multiply(10,20);

     System.out.println("\n\n********Three Floats*********");

      m1.multiply(10.50f,10.30f,10.40f);

     System.out.println("\n\n********Array of Integers*********");

     int array[] = {1,2,3,4};

     m1.multiply(array);
         
     System.out.println("\n\n********One Int One Double*********");   
      
      m1.multiply(10,30.50);
         
  }

 }        
