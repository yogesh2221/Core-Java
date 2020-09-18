import java.util.Scanner;

class Question6
{
    public static void main(String args[])
	{
	  double pie = 3.14;
	  
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.println("Enter the radius of circle = ");
	  
	  double radius = scanner.nextDouble();
	  
	  double area = pie*radius*radius;
	  
	  System.out.println("Area of circle is = "+area);
	  
	  double circum = 2 * pie * radius;
	  
	  System.out.println("\nCircumference of Circle is = "+area);
	}
}