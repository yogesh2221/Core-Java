import java.util.Scanner;

class Question9
{
  public static void main(String args[])
  
  {
    Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter Number of Days:- ");
	
	int days = scanner.nextInt();
	
	double years = days/365 ;
	
	days = days % 365 ;
	
	System.out.println("\n Number of years = "+years);
	
	int week = days / 7 ;
	
	week = days % 7 ;
	
	System.out.println("\n Number of weeks = "+week);
	
	int day = week ;
	
	System.out.println("\n Number of days =  "+days);
  }
}