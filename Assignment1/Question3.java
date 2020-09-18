class Question3
{
 public static void main(String args[])
 {
   System.out.println("****Basic Datatypes Checking****");
   
   System.out.println("\n\n1.Basic Equation");
   
   short x = 4;
   
   int y = x*x + 3*x - 7;
   
   System.out.print("\nBasic Equation value is = "+y);

     System.out.print("\n\n2.Basic Increment");
    
      y = x++ + ++x;

     System.out.print("\nBasic Increment value = "+y);


    System.out.print("\n\n3.Basic Increment three variables");


    int   z = x++ - --y - --x  +  x++ ;


    System.out.println("\nValue of z = "+z);

    System.out.println("Value of x = "+x);

    System.out.println("Value of y = "+y);


   System.out.print("\n4.Basic Boolean expression");
  
    boolean var1 = true;

    boolean var2 = false;

   boolean result = var1 && var2 || !(var1 || var2)  ;

   System.out.print("\nBasic Boolean expression value = "+result);

   System.out.print("\n\n");
   
   
 }
}