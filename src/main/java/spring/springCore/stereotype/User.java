package spring.springCore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class User {
	@Value("12")
	private int id;
	@Value("Akshay")
private String name;
	@Value("boradeakshay11@gmail.com")
private String email;
	@Value("password")
private String password;
	@Value("Ware, karjat, raigad")
private String address;

public User(int id, String name, String email, String password, String address) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.password = password;
	this.address = address;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", address=" + address
			+ "]";
}


}
