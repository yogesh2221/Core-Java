import java.util.*;

class Question17
{

   public static void main(String args[])
{
   Scanner scanner = new Scanner(System.in);

 System.out.println("\nEnter number to be Reverse=");

   int num= scanner.nextInt();


   int   sum=0;

  while(num !=0) 

{

  int temp=num%10;

  sum=sum * 10 + temp;

  num/=10;

}
           System.out.println("\nReverse number="+sum);
}

}