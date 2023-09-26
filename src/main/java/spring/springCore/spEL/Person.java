package spring.springCore.spEL;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Person {
	@Value("Rahul")
private String name;
	@Value("540")
private String rollNo;
	@Value("#{temp}")
private List<String> subjects;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRollNo() {
	return rollNo;
}
public void setRollNo(String rollNo) {
	this.rollNo = rollNo;
}
public List<String> getSubjects() {
	return subjects;
}
public void setSubjects(List<String> subjects) {
	this.subjects = subjects;
}
public Person(String name, String rollNo, List<String> subjects) {
	super();
	this.name = name;
	this.rollNo = rollNo;
	this.subjects = subjects;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Person [name=" + name + ", rollNo=" + rollNo + ", subjects=" + subjects + "]";
}

}
