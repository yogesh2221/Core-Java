package com.file;
import java.io.*;
import java.util.*;

 class Demo1 implements Serializable
 {
	 
	 String itemname;
	 
	 int quantity;
	 
	 double price;

	public Demo1(String itemname, int quantity, double d)
	
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

public class SeralizeDemo {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\hp\\Desktop\\Shopping.dat";
		
		FileOutputStream file = new FileOutputStream(path);
		
		ObjectOutputStream op = new ObjectOutputStream(file);
		

		Demo1 sp = new Demo1("java",2,23.67);

		
		op.writeObject(sp);
		
		file.close();
		
		System.out.println("success");
		
		

	}

}
