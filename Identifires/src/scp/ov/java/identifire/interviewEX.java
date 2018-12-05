 package scp.ov.java.identifire;

public class interviewEX {

	public void m1(int a , int b,int c)
	{
		c=a+b;
		System.out.println("sum of m1 is"+c);
		
	}
	public void m1(float a,float b,float c)
	{
		c =a+b;
		System.out.println("sum of m1 is"+c);
	}
	
	
		
	
	public static void main(String[] args) {
	
	interviewEX e =new interviewEX();
	
	e.m1(30, 20, 10);
	
	e.m1(10.2f, 20.2f, 30.3f);
	

	}
	
}
