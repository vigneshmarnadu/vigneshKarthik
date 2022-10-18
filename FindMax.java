package Functions;

public class FindMax {
	public String findMaxString(String[]names) {
		String temp=names[0];
		for(int i=0;i<names.length;i++) {
			if(names[i].length()>=temp.length()) {
				temp=names[i];
				
			}
		}
		return temp;
		
	}
	public int findMaxNumber(int[]nums) {
		int temp1=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=temp1) {
				temp1=nums[i];
			}
			
		}
		return temp1;
	}
	public void findPlural(String[]names) {
		for(int i=0;i<names.length;i++) {
			if(names[i].endsWith("s")) {
				System.out.println(names[i]);
			}
		}
	}

}
