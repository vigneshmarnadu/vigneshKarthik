package Functions;

public class WeekDays {
	public void showDay(int day) {
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
	}
	public void findFirstHalf(String []names) {
		for(int i=0;i<names.length/2;i++) {
			System.out.println(names[i]);
		}
		
	}
	public void findSecondHalf(String []names) {
		for(int i=names.length/2;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
	}
	public void positiveNumbers(int[]nums) {
		for(int i=0;i<nums.length;i++) {
	    if(nums[i]>0) {
	    	System.out.println(nums[i]);
	    }
		}
	}

}
