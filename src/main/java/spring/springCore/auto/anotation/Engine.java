package spring.springCore.auto.anotation;

public class Engine {
private String power;

public Engine(String power) {
	super();
	this.power = power;
}

public Engine() {
	super();
	// TODO Auto-generated constructor stub
}

public String getPower() {
	return power;
}

public void setPower(String power) {
	this.power = power;
}

@Override
public String toString() {
	return "Engine [power=" + power + "]";
}

 }
