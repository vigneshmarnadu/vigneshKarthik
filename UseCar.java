package Functions;

public class UseCar {
	public static void main(String[]args) {
		Car car1=new Car();
		car1.brand="Hyundai";
		car1.price=500000;
		car1.color="Red";
		car1.taxAmount=2000;
		car1.discountAmount=1000;
		Car car2=new Car();
		car2.brand="Maruthi";
		car2.price=600000;
		car2.color="Black";
		car2.taxAmount=3000;
		car2.discountAmount=4000;
		Car car3=new Car();
		car3.brand="Benz";
		car3.price=700000;
		car3.color="Yellow";
		car3.taxAmount=6000;
		car3.discountAmount=4000;
		Car car4=new Car();
		car4.brand="Audi";
		car4.price=900000;
		car4.color="Blue";
		car4.taxAmount=5000;
		car4.discountAmount=3000;
		Car[]cars= {car1,car2,car3,car4};
		
		car2.netprice(cars);
		
		
		System.out.println("Mini Price="+car2.findMiniPrice(cars));
		
		System.out.println("Hello world");
		System.out.println("Vignesh");
	}

}
