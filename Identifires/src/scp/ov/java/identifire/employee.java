package scp.ov.java.identifire;

import com.sun.xml.internal.ws.developer.EPRRecipe;

public class employee {
 int id;
 String name;
 String address;
 
 
 
public static void staticMethod()
 {
	 System.out.println("static method");
	 
 }
 public void display()
 {
	 System.out.println("employee details");
	 System.out.println(id+" "+name+" "+address);
 }
 static{
	 System.out.println("static block");
 }
 {
	 System.out.println("instance block");
 }
/**
 * @param id
 * @param name
 * @param address
 */
public employee(int id, String name, String address) {
	
	this.id = id;
	this.name = name;
	this.address = address;
}
 public static void main(String args[])
 {
	 employee e = new employee(1,"komal", "pune");
	 e.display();
	 staticMethod();
 }
 
}
