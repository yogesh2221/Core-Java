 import java.util.*;

class Question21
{

   public static void main(String args[])
{
       Scanner scanner = new Scanner(System.in);

       System.out.print("\nEnter the size of the Array = ");

       int total = 0;

       double average = 0;

       int size = scanner.nextInt();


      int array[] = new int[size];


      for(int i = 0 ; i<array.length ; i++ )

  {
         System.out.print("\nElement At " +i+ " position  = ");
         array[i] = scanner.nextInt();

 }

     for(int i=0 ; i<array.length;i++)

{

     total = total + array[i];
    
 }
        System.out.println("\nSum of array element is = "+total);

        average = total/size;

       System.out.println("\nAverage of array element is = "+ average );
 }

 }