package Exercise4_1;

public class Main {

	public static void main(String[] args) {
		
		Fruits obj1 = new Fruits("Fruits");
		System.out.println(obj1 + "\n");
		
		Apple obj2 = new Apple("Apple", 3, 2);
		System.out.println(obj2);
		System.out.println("Total price\t: RM" + obj2.TotalPrice() + "\n");
		
		Lychee obj3 = new Lychee("Lychee", 1.3, 20, "Magnesium, copper, iron, vitamin C, manganese and folate");
		System.out.println(obj3);
		System.out.print("Total price\t: RM" + obj3.TotalPrice() + "\n");
		System.out.printf("Total calories\t: %.2f", obj3.TotalCalories());
		System.out.println("\n");
		
		Cherry obj4 = new Cherry("Cherry", 0.5, 30, "Vitamin C, A, K, potassium, magnesium, and calcium");
		System.out.println(obj4);
		System.out.print("Total price\t: RM" + obj4.TotalPrice() + "\n");
		System.out.printf("Total calories\t: %.2f", obj4.TotalCalories());
		System.out.println("\n");
		
		GrannySmithApple obj5 = new GrannySmithApple("Granny Smith Apple", 4, 3, "Green", "Australia");
		System.out.println(obj5);
		System.out.println("Total price\t: RM" + obj5.TotalPrice() + "\n");
		
		FujiApple obj6 = new FujiApple("Fuji Apple", 8, 2, "Red", "China");
		System.out.println(obj5);
		System.out.println("Total price\t: RM" + obj5.TotalPrice() + "\n");
		
	}
	

}
