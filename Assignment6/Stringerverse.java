package string.com;

import java.util.Scanner;

public class Stringerverse {

	public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     
      System.out.println("Enter the String ");
      
      String name = scanner.nextLine();
      
      
      int len = name.length();
      
      for(int i = len-1 ; i>=0 ; i--)
      {
    	  System.out.print(name.charAt(i));
      }
      
   
	}

}