 import java.util.*;
  
  class Product

{

       int pid;

     int price;

     int quantity;

     Product(int pid , int price, int quantity)

{

    this.pid = pid ;

    this.price = price;

    this.quantity = quantity;

 }

       static int total(Product p1[])
{
          int max = 0;

         for(int i =0 ;i<p1.length;i++)

   {
           max = max +  p1[i].price * p1[i].quantity;

   }
          return max;
}


  }

      public class Question39
{

     public static void main(String args[])

{
      

         Scanner scanner = new Scanner(System.in);

        System.out.println("\nHow much objects you want");
 
         int count  = scanner.nextInt();


        Product p1[] = new Product[count];

        for(int i = 0 ; i<p1.length ; i++)

  {

         System.out.print("\nEnter the pid = ");
         int pid = scanner.nextInt();

         System.out.print("\nEnter the price = ");
         int price = scanner.nextInt();

         System.out.print("\nEnter the quantity = ");
         int quantity= scanner.nextInt();
       
         Product p = new Product(pid,price,quantity);

         p1[i] = p;

}

     
         int max=0;
         int maxpid = 0;
   for(int i = 0 ; i<p1.length;i++)

  {
          max = p1[0].price;

         if(p1[i].price >=max)
     {
             maxpid = p1[i].pid ;
     }
   
 }

      System.out.println("\nPid of product with highest price = " +maxpid);


        int result = Product.total(p1);

        System.out.println("\nTotal Amount spend on all product = "+result);

  }

 }