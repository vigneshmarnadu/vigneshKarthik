package Functions;

public class UseFindMax {
	public static void main(String[]args) {
		FindMax max=new FindMax();
		String names[] = {"vigneshs","vinoth","vijsys","Vjihg"};
		System.out.println(max.findMaxString(names).toUpperCase());
		int nums[]= {10,20,65,75,98};
		System.out.println(max.findMaxNumber(nums));
		max.findPlural(names);
	}

}
