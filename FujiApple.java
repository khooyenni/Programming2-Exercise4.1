package Exercise4_1;

public class FujiApple extends Apple{
	
	String placeofOrigin, colour;
	
	FujiApple(String name, int p, int q, String c, String place){
		super(name,p,q);
		this.colour=c;
		this.placeofOrigin=place;
	}
	
	public String toString() {
		return super.toString() + "\nPlace of origin\t: " + placeofOrigin + "\nColour\t\t: " + colour;
	}

}
