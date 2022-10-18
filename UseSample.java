package Functions;

public class UseSample {
	public static void main(String[]args) {
		int num=13;
		Sample sam=new Sample();
		System.out.println(sam.findOddEven(num));
		String value=sam.findOddEven(num);
		
		sam.CheckVowels("VIGNESH".toLowerCase());
		
		System.out.println(sam.findPrimeNumber(97));
		String name1="OneSoft";
		sam.upperCount(name1);
		String name2="VigNesH";
		sam.lowerCount(name2);
	}
	

}
