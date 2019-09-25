package ICS4U_Unit1;

public class person extends Object{
// .equals();
//.toString();
private int age;
public String name;
private int height;
protected int bday;
public person(int a, String n, int h, int b) {
	age = a;
	name = n;
	height = h;
	bday = b;
}

public person() {
	age = 12;
	name = "OhHiO";
	height = 8;
	bday = 1;
}

public void setAge(int a) {
	a = age;
}
public void setHeight(int h)
{
	h = height;
}
public String toString(String p) {
	return name;
}
public boolean equals(person p) {
	if(this.name.contentEquals(p.name) && this.age == p.age && this.height == p.height && this.bday == p.bday) {
		return true;
	}else {
		return false;
	}
}

}
