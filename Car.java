package Functions;

public class Car {
	String brand;
	int price;
	String color;
	int taxAmount;
	int discountAmount;
	
	public void netprice(Car[]cars) {
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i].price+cars[i].taxAmount-cars[i].discountAmount);
		}
	}
	public int findMiniPrice(Car[]cars) {
		int temp=cars[0].price;
		for(int i=0;i<cars.length;i++) {
			if(cars[i].price<=temp) {
				temp=cars[i].price;
			}
		}
		return temp;
	}

}
