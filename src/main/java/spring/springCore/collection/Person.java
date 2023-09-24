package spring.springCore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
private String name;
@Override
public String toString() {
	return "Person [name=" + name + ", contacts=" + contacts + ", address=" + address + ", course=" + course + "]";
}
private List<String> contacts;
private Set<String> address;
private Map<String, String> course;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getContacts() {
	return contacts;
}
public void setContacts(List<String> contacts) {
	this.contacts = contacts;
}
public Set<String> getAddress() {
	return address;
}
public void setAddress(Set<String> address) {
	this.address = address;
}
public Map<String, String> getCourse() {
	return course;
}
public void setCourse(Map<String, String> course) {
	this.course = course;
}

}
