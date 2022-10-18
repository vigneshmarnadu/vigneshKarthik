package Functions;

public class UseWeekDays {
	public static void main(String[]args) {
		WeekDays week=new WeekDays();
		week.showDay(3);
		
		
		String names[]= {"vignesh","Vinoth","Viki","Vijay","Rahul","Ramesh"};
		WeekDays w=new WeekDays();
		w.findFirstHalf(names);
		w.findSecondHalf(names);
		int nums[]=new int[8];
		nums[0]=89;
		nums[1]=90;
		nums[2]=72;
		nums[3]=90;
		nums[4]=-78;
		nums[5]=-98;
		nums[6]=-90;
		nums[7]=-93;
		w.positiveNumbers(nums);
		

		
		
		
		
	}

}
