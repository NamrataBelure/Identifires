package scp.ov.java.identifire;

import java.util.Scanner;

public class staticEx {
	static int cube(int x)
	{
		
		return x*x*x;
		
	}
	static{
		System.out.println("static Block...");
	}
 public static void main(String[] args) {
  int result=staticEx.cube(5);
  System.out.println(result);
  System.out.println("hello");
 }

}
