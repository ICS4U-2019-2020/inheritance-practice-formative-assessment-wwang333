package ICS4U_Unit1;
import java.util.Scanner;
public class Student extends person{

	private int IDn;
	private int year;
	private int grade;
	private String adviser;
	
	public void setIDn(int i)
	{
		i = IDn;
	}
	public void setyear(int y)
	{
		y = year;
	}
	public void setG(int g) {
		g = grade;
	}
	public void setA(String a) {
		a = adviser;
	}
	public Student(int i, int y, int g, String a) {
		IDn = i;
		year = y;
		grade = g;
		adviser = a;
	}
	public Student() {
		IDn = 33333333;
		year = 4;
		grade = 12;
		adviser = "Donnnelllllly";
	}
	
	//Q15. I think all of the attributes in person can be directly accessed from Student 
	
	public String toString(String a) {
		return a;
	}
	public boolean equals(Student n) {
		if(this.IDn == n.IDn && this.year == n.year && this.grade == n.year && this.adviser.contentEquals(n.adviser)) {
			return true;
		}else {
			return false;
		}
	}
}
