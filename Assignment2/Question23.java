 import java.util.*;

public class Question23
{

   public static void main(String args[])
{
       Scanner scanner = new Scanner(System.in);

       System.out.print("\nEnter the size of the Array = ");

       int size = scanner.nextInt();

      int array[] = new int[size];


      for(int i = 0 ; i<array.length ; i++ )

  {
         System.out.print("\nElement At " +i+ " position  = ");
         array[i] = scanner.nextInt();

 }

          System.out.println("\n******Array Reverse*******");

         for(int i = array.length-1 ; i>=0 ; i--)

      {

                    System.out.print("\nElement At " +i+ " position  = ");
                     
           
                    System.out.print(array[i]);
     
      }




}


}