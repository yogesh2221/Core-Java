  class Student

{

     private int age ;
     private String name;

   void setData(int a , String n)

 {

      age = a;

     name = n ;

 }

     void show()

{

       System.out.println("Age of Student = "+age) ;
        System.out.println("Name of Student = "+name) ;

}

}

   public class Question31

{



   public static void main(String args[])

{

     Student s1 = new Student() , s2 = new Student();

     s1.setData(10,"ATUL");

     s1.show();

     s2.setData(20,"YOGESH");

     s2.show();
     
}

 }