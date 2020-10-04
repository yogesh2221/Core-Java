 
  class StudentInfo

{

      private int age;

      private String name;

      private String city;

     private long mobile;

    StudentInfo()

   {

         System.out.println("no arg constructor invoke using this construct);
  
     }  
   StudentInfo(int number)
  {
      this();
     System.out.println(number);
  }
    void setData(int age,String name,String city,long mobile);
  {
        this.age = age;
       this.name = name;
       this.city = city;
       this.mobile = mobile;
   }
     void display();
  {
     
        System.out.println("Age = " + age);
        System.out.println("Name = " + name);
        System.out.println("City = " + city);
        System.out.println("Mobile = " + mobile);
  }
    void displaymethod();
 {
         
               this.display();
   }
}
   public class Question33
{
   public static void main(String args[])
 {
       StudentInfo s1 = new StudentInfo();
       s1.setData(1,"samrat","loni",7709);
      System.out.println("\n ***This keyword used to refer the current class instance Varibale*** ");

       s1.display();

      System.out.println("\n ***This keyword used to invoke class method*** ");

      s1.displaymethod();

    System.out.println("\n ***This() construct keyword used to invoke current class constructor*** ");
      StudentInfo s2 = new StudentInfo(10);

  }

  }

}






