package Functions;

public class Sample {
	public String findOddEven(int num) {
		if(num%2==0) {
			return"Even Number";
		}
		return "Odd Number";
	}
	public void CheckVowels(String name) {
		if(name.contains("a")||name.contains("e")||name.contains("i")||name.contains("o")||name.contains("u")) {
			System.out.println("IT CONTAINS VOWELS");
		}
		else {
			System.out.println("IT NOT CONTAINS VOWELS");
		}
	}
	public String  findPrimeNumber(int num1) {
		boolean isPrime=true;
		for(int i=2;i<num1;i++) {
		   if(num1%i==0) {
			   isPrime=false;
		   }
			
			}
		if(isPrime) {
			return "Prime Number";
		}
		return "Not Prime";
		
	}
	public void upperCount(String name1) {
		int count=0;
		for(int i=0;i<name1.length();i++) {
			if(name1.charAt(i)>='A'&&name1.charAt(i)<='Z') {
				count++;
			}
		}
			System.out.println(count);	
			}
			
			public void lowerCount(String name2) {
				int count1=0;
				for(int i=0;i<name2.length();i++) {
					if(name2.charAt(i)>='a'&&name2.charAt(i)<='z') {
						count1++;
						
					}
			
		}
				System.out.println(count1);
		
	}

}
