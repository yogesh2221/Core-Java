import java.util.*;

public class Question22
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

         System.out.println("\nElements of original array: ");    

        for (int i = 0; i < array.length; i++)
    {     
        
                  System.out.print(array[i] + "  ");    
        }    
            


        for ( int i = 0 ; i<array.length ; i++)

  {

      for ( int j = i+1 ; j<array.length ; j++)

 {


          if(array[i] < array[j])

   {

      temp = array[i];

     array[i] = array[j];

    array[j] = temp;
           

   }

     

  }

}

      System.out.println("\n\nSorted elelment in array are ");

      for(int i = 0 ; i<array.length;i++)

  {
 
              System.out.print(array[i]+"  " );

   }

}


}