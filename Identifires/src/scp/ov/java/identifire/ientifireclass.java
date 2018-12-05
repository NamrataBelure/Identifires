package scp.ov.java.identifire;

public class ientifireclass {
	int Employeeid;
	String name;
	String address;
	String salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("employee information");
		ientifireclass id = new ientifireclass();
		id.instanceMethod();
		staticMethod();

	}
	{
		System.out.println("instance block");
	}
	static{
		System.out.println("static block");
	}
	public void instanceMethod()
	{
		System.out.println("Employee id:1");
		System.out.println("employee name:komal");
		System.out.println("employee address:Sangali");
		System.out.println("employee salary:50,000");
	}
	public static void staticMethod()
	{
		System.out.println("static method");
	}
	
	public ientifireclass() {
		System.out.println("Constructor call");
	}
	
}
