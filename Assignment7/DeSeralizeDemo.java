package com.file;
import java.io.*;


class Demo2 implements Serializable
{
	 
	 String itemname;
	 
	 int quantity;
	 
	 double price;

	public Demo2(String itemname, int quantity, double d)
	
	{
		this.itemname = itemname;
		this.quantity = quantity;
		this.price = d;
	}

	@Override
	public String toString() {
		return "Demo1 [itemname=" + itemname + ", quantity=" + quantity + ", price=" + price + "]";
	}
	 
	 
	 
	 
}


public class DeSeralizeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
          String path = "C:\\Users\\hp\\Desktop\\Shopping.dat";
		
		FileOutputStream file = new FileOutputStream(path);
		
		ObjectOutputStream op = new ObjectOutputStream(file);
		

		 Demo1 sp = new Demo1("java",2,23.67);

		
		op.writeObject(sp);
		
		file.close();
		
		System.out.println("success data seralize");
		
		
		FileInputStream file1 = new FileInputStream(path);
		
		ObjectInputStream op1 = new ObjectInputStream(file1);
		
		
		 sp = (Demo1) op1.readObject();
		 
		 op1.close();
		 
		 file1.close();
		 
		 System.out.println("================================");
		 
		 System.out.println("Deserilze object are");
		 
		 System.out.println("Name = "+sp.itemname);
		 
		 System.out.println("Quantity = "+sp.quantity);
		 
		 System.out.println("Price = "+sp.quantity);
		
		


	}

}