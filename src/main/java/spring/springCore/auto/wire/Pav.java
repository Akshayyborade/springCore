package spring.springCore.auto.wire;

public class Pav {
private double price;

public Pav(double price) {
	super();
	this.price = price;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Pav [price=" + price + "]";
}

public Pav() {
	super();
	// TODO Auto-generated constructor stub
}

}
