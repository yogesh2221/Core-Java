  import java.util.*;

public class Question24
{

   public static void main(String args[])
{
       Scanner scanner = new Scanner(System.in);

       System.out.print("\nEnter the size of the Array = ");

       int size = scanner.nextInt();

      int array[] = new int[size];

      int temp = 0;
       
      for(int i = 0 ; i<array.length ; i++ )

  {
         System.out.print("\nElement At " +i+ " position  = ");
         array[i] = scanner.nextInt();

 }

         int j;
            
        System.out.print("\n\nEnter number to be search in array = ");

       int number = scanner.nextInt();

       for(  j = 0 ; j<array.length ; j++ )

  {

      if(number == array[j] )     

       {

               temp = 1;
               break;
    }

}

     if(temp==1)

{
 
          System.out.println("\nNumber is present in the array");
     
}

   else

     {

                 System.out.println("\nNumber is not present in the array");
                 
   }

 }

}