package Exercise4_1;

public class Cherry extends Fruits{
	
	private int price;
	private double weight;
	private String nutrien;
	
	public Cherry(String name, double w, int p, String n) {
		super(name);
		this.weight = w;
		this.price = p;
		this.nutrien = n;

	}
	
	public double TotalPrice() {
		return this.weight * this.price;
	}
	
	public double TotalCalories() {
		return this.weight*500;
	}
	
	public String toString() {
		return super.toString()+ "\nPrice\t\t: RM" + price + "\nWeight(in kg)\t: " + weight + "\nNutrien\t\t: " + nutrien;
	}

}
