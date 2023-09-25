package spring.springCore.alonecollection;

import java.util.List;

public class Teacher {
private String name;
private List<String> subject;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getSubject() {
	return subject;
}
public void setSubject(List<String> subject) {
	this.subject = subject;
}
@Override
public String toString() {
	return "Teacher [name=" + name + ", subject=" + subject + "]";
}
public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}


}
