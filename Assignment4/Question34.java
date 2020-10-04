 import java.util.*;

 class Circle 

{

       private int radius ;

       private double area ;

      static double pi = 3.14 ;
  


     void init(int radius)

  {
          this.radius = radius ;

 }

   void calulateArea()

 {

      area = pi * radius * radius ;

}

    void  display()

{

     System.out.println("Area of circle is = "+area);

}

    }

         public class Question34
{

   public static void main(String args[])

{

      
        Circle c1 = new Circle ();
      Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the radius = ");

          int tempradius = scanner.nextInt();

          c1.init(tempradius);

         c1.calulateArea();

         c1.display();

   }

 }