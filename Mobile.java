package Functions;

public class Mobile {
	String brand;
	int price;
	String color;
	int taxAmount;
	
	public int findNetPrice(Mobile mo) {
		return mo.price+mo.taxAmount;
		
	}
	public void findNetPricee(Mobile[]mobiles) {
		for(int i=0;i<mobiles.length;i++) {
			System.out.println(mobiles[i].price+mobiles[i].taxAmount);
		}
	}

}
