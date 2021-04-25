package Exercise4_1;

public class Apple extends Fruits{
	
	private int quantity, price;
	
	public Apple(String name, int q, int p) {
		super(name);
		this.quantity = q;
		this.price = p;
		
	}
	
	public int TotalPrice() {
		return this.quantity * this.price;
	}
	
	public String toString() {
		return super.toString()+ "\nPrice\t\t: RM" + price + "\nQuantity\t: " + quantity;
	}

}
