package scp.ov.java.identifire;

public class student {
int id;
String name;
String city;
static String collageName;
public static void main(String[] args) {
	System.out.println("student class...");
	student s1=new student(01, "anu");
	student s2=new student(02,"komal","pune");
	student s3=new student(03,"rida","pune");
	s1.display();
	s2.display();
	s3.display();
   staticMethod();
	}
public String toString() {
	return "student [id=" + id + ", name=" + name + ", city=" + city + "]";
}
public student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
/**
 * @param id
 * @param name
 * @param city
 */
public student(int id, String name, String city) {
	this(id,name);
	this.city = city;
}

{
	System.out.println("instances Block...");
}
static {
	System.out.println("inside static block...");
}
public static void staticMethod(){
	System.out.println("static method....");
}
public void display(){
	System.out.println("instances method...");
	System.out.println(id+" "+name+" "+city);
	System.out.println();
}   

}
