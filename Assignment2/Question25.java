import java.util.*;

class Question25
{

   public static void main(String args[])
{
       Scanner scanner = new Scanner(System.in);

       System.out.print("\nEnter the size of the Array = ");

       int size = scanner.nextInt();

      int array[] = new int[size];

      int evensum = 0;
      int oddsum = 0;
       
      for(int i = 0 ; i<array.length ; i++ )

  {
         System.out.print("\nElement At " +i+ " position  = ");
         array[i] = scanner.nextInt();

 }

       for(int i = 0 ; i<array.length ; i++)

  {

         if(array[i]%2==0)

      {

                evensum = evensum+ array[i] ;
        
   }

     else if(array[i]%2 !=0)

   {

          oddsum = oddsum+array[i] ;

   }

  }

          System.out.println("\nAddition of Even numbers =  " +evensum);

         System.out.println("\nAddition of  Odd numbers =  " +oddsum);


 }


}