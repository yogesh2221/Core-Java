 import java.util.*;

public class Question20
{

   public static void main(String args[])
{


        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start no:");
		int startpt=sc.nextInt();
		System.out.println("Enter the End no:");
		int endpt=sc.nextInt();
		int flag;
		
		while(startpt < endpt)
		{
			flag=0;
			for(int i=2;i<startpt/2;i++)
			{
				if((startpt%i) == 0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0 && startpt!=0 && startpt!=1)
			{
				System.out.println("Prime Numbers is "+startpt);
			}
			startpt++;
		}

  
      

 }

 }