 class Person

{

      private int age ;

     private  String name;

    Person()

   {

      this. age = 18;

     System.out.println("default age is = "+age);

  }

  Person(int age , String name)

{

  this.age = age ;

  this.name = name ;

}

   void show()
{

   System.out.println("Age of Person is = "+age);
   System.out.println("Age of Person is = "+name);
}

  }


       public class Question37
{

   public static void main(String args[])

{

      Person p1 = new Person();

       Person p2 = new Person(10,"YOGESH");

        p2.show();

}

  }


