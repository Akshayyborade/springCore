package spring.springCore.auto.wire;



public class Samosa {
@Override
	public String toString() {
		return "Samosa [price=" + price + ", pav=" + pav + "]";
	}
private double price;
private Pav pav;
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Pav getPav() {
	return pav;
}
public void setPav(Pav pav) {
	this.pav = pav;
}
public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

}
