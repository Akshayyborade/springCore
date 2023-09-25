package spring.springCore.constructorInjection;

public class Person {
private String name;
private String address;
public Person(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Person [name=" + name + ", address=" + address + "]";
}
}
