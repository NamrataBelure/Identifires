package scp.ov.java.identifire;

public class classIdentifires {
   int rollNo;
   String Name;
   String adderess;
   float sMarks;
   
	public static void main(String[] args) {
		System.out.println("students Information...");
		classIdentifires ci=new classIdentifires();
		ci.instancesMethod();
		staticMethod();

	}
	
	{
		System.out.println("instances Block");
	}
	static{
		System.out.println("static Block");
	}
	private static void staticMethod() {
	System.out.println("static method...");
		
	}
	private void instancesMethod() {
		System.out.println("student rollNo is:01");
		System.out.println("student Name is:namrata");
		System.out.println("student adderess is:pune");
		System.out.println("marks are:65");
	}
	
	public classIdentifires() {
		System.out.println("Student Constructor");
	}
	
}
