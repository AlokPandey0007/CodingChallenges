package twoPointerProblems;

public class TwoSumArrayForTargetNumber {

	static int[] nums = { 2, 7, 11, 15 };
	static int target = 22;

	// worstcase Scenario using loop
	/*
	 * public static void main(String[] args) {
	 * 
	 * for (int i = 0; i < nums.length ; i++) { for (int j = i+1 ; j < nums.length;
	 * j++) { int value=nums[i]+nums[j]; if(value==target) {
	 * System.out.println("index of the elements are "+i+" "+j); break; } } } }
	 */

	//Tutorial - https://www.youtube.com/watch?v=4YKBwKnTnlM&list=PL7g1jYj15RUOjoeZAJsWjwV8XUo9r0hwc&index=6
	
	//Precondition : Array should be sorted.
	//This is logic will work by having two index if the some of two index is less than the target we will increase the lower index and if
	//some of two index is greater than target we will decrease the higher index. 
	
	
	public static void main(String[] args) {

		int i = 0;
		int j = nums.length - 1;
		boolean flag = true;
		
		
		
		while(flag)
		{
			int value =nums[i]+nums[j];
			if(value==target)
			{
				System.out.println("indexes are :"+i+" "+j);
				flag=false;
				break;
			}
			else {
				if(value<target)
					i++;
				else
					j--;
			}
		}
	}

}
