package Functions;

public class UseMobile {
	public static void main(String[]args) {
		Mobile mobile1=new Mobile();
		mobile1.brand="Samsung";
		mobile1.price=20000;
		mobile1.color="Red";
		mobile1.taxAmount=200;
		Mobile mobile2=new Mobile();
		mobile2.brand="LG";
		mobile2.price=15000;
		mobile2.color="Blue";
		mobile2.taxAmount=300;
		Mobile mobile3=new Mobile();
		mobile3.brand="Motorlo";
		mobile3.price=25000;
		mobile3.color="Black";
		mobile3.taxAmount=500;
		Mobile[]mobiles= {mobile1,mobile2,mobile3};
		System.out.println(mobile3.findNetPrice(mobile2));
		mobile3.findNetPricee(mobiles);
		
	}

}
