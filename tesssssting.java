package ICS4U_Unit1;
import java.util.Scanner;
public class tesssssting {
	public static void main(String[] args) {
	person p3 = new person(33, "kj", 8,2);
	
	person p4 = new person();
	
	if(p3.equals(p4) == true)
	{
		System.out.println("they are equal");
	}else {
		System.out.println("no they are not");
	}	
	
	Student s1 = new Student(); 
	Student s2 = (Student) new person();//not valid
	person p1 = new Student();
	person p2 = (person) new Object();//not valid
	Object o1 = new Student();
	Object o2 = new person();

	
	/*Diagram
	 * 
	 * -----------------------------------------------------------------------------------------------------------------------------------------------
	 * Object
	 * 
	 * 
	 * -----------------------------------------------------------------------------------------------------------------------------------------------
	 * person
	 * 
	 * equals and toString
	 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	 * Student
	 * 
	 * 
	 * 
	 * toString and equals
	 */
	
	
}
}
