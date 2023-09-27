package spring.springJdbc.basicJdbc;

public class Student {
   private int id;
   private String name;
   private String city;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
}
   
}
