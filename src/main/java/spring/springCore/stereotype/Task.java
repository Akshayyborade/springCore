package spring.springCore.stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Task {
	@Value("task 1")
private String title;
	@Value("this is task for testing purpose")
private String description;
	@Value("10/05/2023")
private String dueDate;
	@Autowired
private User user;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getDueDate() {
	return dueDate;
}
public void setDueDate(String dueDate) {
	this.dueDate = dueDate;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Task(String title, String description, String dueDate, User user) {
	super();
	this.title = title;
	this.description = description;
	this.dueDate = dueDate;
	this.user = user;
}
public Task() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Task [title=" + title + ", description=" + description + ", dueDate=" + dueDate + ", user=" + user + "]";
}



}
